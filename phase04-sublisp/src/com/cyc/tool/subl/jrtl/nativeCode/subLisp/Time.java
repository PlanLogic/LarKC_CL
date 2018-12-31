/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *   
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package  com.cyc.tool.subl.jrtl.nativeCode.subLisp;

//// Internal Imports
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumber;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;

//// External Imports
import java.util.TimeZone;
import java.util.Date;

public  class Time extends SubLTrampolineFile {
  //// Constructors
  /** Creates a new instance of Time. */
  public Time() {}
  public static SubLFile me = new Time();
  //// Public Area
  public static long EPOCH_OFFSET = ((365L * 70L) + 17L) * 24L * 60L * 60L;
  public static long EPOCH_OFFSET_MILLIS = EPOCH_OFFSET * 1000L;
  
  /*
   * get the time in the JRTL's epoch date of 1900-01-01 00:00:00 GMT
   * in microseconds, as a Java data type
   * @note since Java's resolution is milli-seconds at best, the
   * precision will be in milli-secconds as well
   * @return long the current time micro-seconds in JRTL's epoch representation
   */
  public static long get_time_internal() {
    long elapsedMillis  = System.currentTimeMillis();
    long epochMicros = fromPlatformTime(elapsedMillis);
    return epochMicros;
  }
  /*
   * get the time in the JRTL's epoch date of 1900-01-01 00:00:00 GMT
   * in microseconds, as a SubL data type
   * @note since Java's resolution is milli-seconds at best, the
   * precision will be in milli-secconds as well
   * @return SubLObject the current time in JRTL's epoch representation
   */
  public static SubLObject get_time() {
    long epochMicros = get_time_internal();
    SubLObject result = SubLObjectFactory.makeInteger(epochMicros);
    return result;
  }
  /* get the timezone and the daylight-savings time flag
   * optionally take a universal time, which is going to be in
   * seconds (so work backward to platform time)
   * @return the timezone as an offset in seconds west (i.e. CDT
   * is 5, expressed as 18000
   * @return whether daylight savings time was active or not, i.e.
   * T or NIL (e.g. T for Summer 2006 in CDT)
   */
  public static SubLObject get_timezone(SubLObject universalTime) {
    // pass through UNPROVIDED args -- universalTimeToUnixTime knows how to handle this
    long elapsedMillis = universalTimeToUnixTime(universalTime);
    TimeZone localTZ = TimeZone.getDefault();
    long offsetMillis = localTZ.getOffset(elapsedMillis);
    int offsetSeconds = (int)(offsetMillis/1000L);
    // west seconds are sign inverted offset seconds?
    int offsetWestSeconds = -offsetSeconds;
    boolean wasDST = localTZ.inDaylightTime(new Date(elapsedMillis));
    return Values.values( SubLObjectFactory.makeInteger(offsetWestSeconds),
            SubLObjectFactory.makeBoolean(wasDST));
  }
  public static SubLObject internal_real_time_has_arrivedP(SubLObject internal_real_time) {
    long epochMicrosNow = get_time_internal();
    long epochMicrosExpected = internal_real_time.longValue();
    boolean hasArrived = (epochMicrosNow >= epochMicrosExpected) ? true : false;
    return SubLObjectFactory.makeBoolean(hasArrived);
  }
  public static SubLObject time_has_arrivedP(SubLObject universal_time) {
    long epochMicrosNow = get_time_internal();
    long universalTimeTyped = universal_time.longValue();
    long epochMicrosExpected = scaleUniversalToInternalTime(universalTimeTyped);
    boolean hasArrived = (epochMicrosNow >= epochMicrosExpected) ? true : false;
    return SubLObjectFactory.makeBoolean(hasArrived);
  }
  /*
   * @note in some sense this should be in time-high, but time-high
   * has no way of accepting a UNIX time ...
   * this is used by the file-sys code to convert file time
   * into universal time
   */
  public static SubLObject unixTimeToUniversalTime( long elapsedMillis) {
    long epochMicros = fromPlatformTime(elapsedMillis);
    long epochSeconds = scaleInternalToUniversalTime(epochMicros);
    SubLObject result = SubLObjectFactory.makeInteger(epochSeconds);
    return result;
  }
  public static long universalTimeToUnixTime(SubLObject universalTime) {
    if (universalTime == UNPROVIDED) {
      return System.currentTimeMillis();
    } else {
      long epochSeconds = universalTime.longValue();
      long epochMicros = scaleUniversalToInternalTime(epochSeconds);
      return toPlatformTime(epochMicros);
    }
  }
  public static long scaleInternalToUniversalTime(long epochMicros) {
    long epochSeconds = (epochMicros/1000L)/1000L;
    return epochSeconds;
  }
  public static long scaleUniversalToInternalTime(long epochSeconds) {
    long epochMicros = epochSeconds * 1000L * 1000L;
    return epochMicros;
  }
  /*
   * @deprecated This should probably be somewhere else.
   */
  public static SubLObject compute_with_process_resource_tracking_results(SubLObject resourceSpec) {
    SubLObject now = get_internal_real_time();
    // since we are already in microseconds, hundreds of nanos are only one factor away
    SubLObject delta = Numbers.subtract(now, resourceSpec);
    SubLObject hundredsOfNanos = Numbers.multiply(delta,TEN_INTEGER);
    Object[] listItems = {
      // we have no clue, so assume it is all our fault
      SubLObjectFactory.makeKeyword("SYSTEM-TIME"), ZERO_INTEGER,
      SubLObjectFactory.makeKeyword("USER-TIME"), hundredsOfNanos
    };
    SubLObject result = SubLObjectFactory.makeList( listItems);
    return result;
  }
  
  /* @deprecated
   * use time-high.get_universal_time() instead
   */
  public static SubLObject get_universal_time() {
    long elapsedMillis  = System.currentTimeMillis();
    SubLObject universalTime = unixTimeToUniversalTime(elapsedMillis);
    return universalTime;
  }
  /*
   * @deprecated
   * use time-high.get_decoded_time() instead
   */
  public static SubLObject get_decoded_time() {
    return time_high.get_decoded_time();
  }
  /*
   * @deprecated
   * use time-high.decode_universal_time() instead
   */
  public static SubLObject decode_universal_time(SubLObject universalTime, SubLObject timeZone) {
    return time_high.decode_universal_time(universalTime,timeZone);
  }
  /*
   * @deprecated
   * use time-high.encode_universal_time() instead
   */
  public static SubLObject encode_universal_time(SubLObject second, SubLObject minute, SubLObject hour,
          SubLObject day, SubLObject month, SubLObject year, SubLObject time_zone) {
    return time_high.encode_universal_time(second, minute,hour, day, month, year, time_zone);
  }
  /* @deprecated
   * use time-high.get_internal_real_time() instead
   */
  public static SubLObject get_internal_real_time() {
    return time_high.get_internal_real_time();
  }
  /* @deprecated
   * use time-high.get_internal_run_time() instead
   */
  public static SubLObject get_internal_run_time() {
    return time_high.get_internal_run_time();
  }
  
  //// Initializations
  public void declareFunctions() {
    /* -- this is here in error -- it is actually in time-high.java
    SubLFiles.declareFunction(me, "get_universal_time",     "GET-UNIVERSAL-TIME",     0, 0, false);
    SubLFiles.declareFunction(me, "get_decoded_time",       "GET-DECODED-TIME",       0, 0, false);
     */
    SubLFiles.declareFunction(me, "get_time",     "GET-TIME",     0, 0, false);
    SubLFiles.declareFunction(me, "get_timezone", "GET-TIMEZONE", 1, 0, false);
    /* -- this is here in error -- it is actually in time-high.java
    SubLFiles.declareFunction(me, "decode_universal_time",  "DECODE-UNIVERSAL-TIME",  1, 1, false);
    SubLFiles.declareFunction(me, "encode_universal_time", "ENCODE-UNIVERSAL-TIME", 6, 1, false);
    SubLFiles.declareFunction(me, "get_internal_real_time", "GET-INTERNAL-REAL-TIME", 0, 0, false);
    SubLFiles.declareFunction(me, "get_internal_run_time", "GET-INTERNAL-RUN-TIME", 0, 0, false);
     -- */
    SubLFiles.declareFunction(me, "internal_real_time_has_arrivedP", "INTERNAL-REAL-TIME-HAS-ARRIVED?", 1, 0, false);
    SubLFiles.declareFunction(me, "time_has_arrivedP", "TIME-HAS-ARRIVED?", 1, 0, false);
  }
  public void initializeVariables() {
  }
  public void runTopLevelForms() {
  }
  //// Protected Area
  protected static long fromPlatformTime( long elapsedMillis) {
    long epochMillis = elapsedMillis + EPOCH_OFFSET_MILLIS;
    long epochMicros = epochMillis * 1000L;
    return epochMicros;
  }
  protected static long toPlatformTime( long epochMicros) {
    long epochMillis = epochMicros / 1000L;
    long elapsedMillis = epochMillis - EPOCH_OFFSET_MILLIS;
    return elapsedMillis;
  }
  
  //// Private Area
  private static long startTime = System.currentTimeMillis();
  //// Internal Rep
  //// Main
  static public void main(String[] args) {
    TimeZone tz = TimeZone.getDefault();
    System.out.println("Got default time-zone " + tz);
    System.out.println("The offset for this timezone is: " + tz.getRawOffset());
    System.out.println("The daylight savings information for this timezone is: " + tz.getDSTSavings());
    System.out.println("The offset for this timezone via the current time is: " + tz.getOffset(System.currentTimeMillis()));
    System.out.println("The daylight savings information via the current time is: " + tz.inDaylightTime(new java.util.Date()));
  }
}
