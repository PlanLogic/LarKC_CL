/*
 * FaslReader.java
 *
 * Copyright (C) 2005 Peter Graves
 * $Id: FaslReader.java 12431 2010-02-08 08:05:15Z mevenson $
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 *
 * As a special exception, the copyright holders of this library give you
 * permission to link this library with independent modules to produce an
 * executable, regardless of the license terms of these independent
 * modules, and to copy and distribute the resulting executable under
 * terms of your choice, provided that you also meet, for each linked
 * independent module, the terms and conditions of the license of that
 * module.  An independent module is a module which is not derived from
 * or based on this library.  If you modify this library, you may extend
 * this exception to your version of the library, but you are not
 * obligated to do so.  If you do not wish to do so, delete this
 * exception statement from your version.
 */

package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.*;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObjectFactory.*;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class FaslReader
{
    // ### fasl-read-comment
    public static ReaderMacroFunction FASL_READ_COMMENT =
        new ReaderMacroFunction("fasl-read-comment", PACKAGE_SYS, false,
                                "stream character")
    {
        
        public SubLObject execute(LispStream stream, char ignored)

        {
          try 
            {
              while (true) {
                int n = stream._readChar();
                if (n < 0)
                  return null;
                if (n == '\n')
                  return null;
              }
            }
          catch (java.io.IOException e)
            {
              return null;
            }
        }
    };

    // ### fasl-read-string
    public static ReaderMacroFunction FASL_READ_STRING =
        new ReaderMacroFunction("fasl-read-string", PACKAGE_SYS, false,
                                "stream character")
    {
        
        public SubLObject execute(LispStream stream, char terminator)

        {
            Readtable rt = FaslReadtable.getInstance();
            StringBuilder sb = new StringBuilder();
            try 
              {
                while (true) {
                  int n = stream._readChar();
                  if (n < 0) {
                    error(new EndOfFile(stream));
                    // Not reached.
                    return null;
                  }
                  char c = (char) n;
                  if (rt.getSyntaxType(c) == Readtable.SYNTAX_TYPE_SINGLE_ESCAPE) {
                    // Single escape.
                    n = stream._readChar();
                    if (n < 0) {
                      error(new EndOfFile(stream));
                      // Not reached.
                      return null;
                    }
                    sb.append((char)n);
                    continue;
                  }
                  if (Utilities.isPlatformWindows) {
                    if (c == '\r') {
                      n = stream._readChar();
                      if (n < 0) {
                        error(new EndOfFile(stream));
                        // Not reached.
                        return null;
                      }
                      if (n == '\n') {
                        sb.append('\n');
                      } else {
                        // '\r' was not followed by '\n'.
                        stream._unreadChar(n);
                        sb.append('\r');
                      }
                      continue;
                    }
                  }
                  if (c == terminator)
                    break;
                  // Default.
                  sb.append(c);
                }
                return makeString(sb);
              }
            catch (java.io.IOException e)
              {
                return makeString(sb);
		//                return null;
              }
        }
    };

    // ### fasl-read-list
    public static ReaderMacroFunction FASL_READ_LIST =
        new ReaderMacroFunction("fasl-read-list", PACKAGE_SYS, false,
                                "stream character")
    {
        
        public SubLObject execute(LispStream stream, char ignored)

        {
            return stream.readList(false, true);
        }
    };

    // ### fasl-read-right-paren
    public static ReaderMacroFunction FASL_READ_RIGHT_PAREN =
        new ReaderMacroFunction("fasl-read-right-paren", PACKAGE_SYS, false,
                                "stream character")
    {
        
        public SubLObject execute(LispStream stream, char ignored)

        {
            return error(new ReaderError("Unmatched right parenthesis.", stream));
        }
    };

    // ### fasl-read-quote
    public static ReaderMacroFunction FASL_READ_QUOTE =
        new ReaderMacroFunction("fasl-read-quote", PACKAGE_SYS, false,
                                "stream character")
    {
        
        public SubLObject execute(LispStream stream, char ignored)

        {
            return makeCons(LispSymbols.QUOTE,
                            makeCons(stream.faslRead(true, NIL, true,
                                                     LispThread.currentThread())));
        }
    };

    // ### fasl-read-dispatch-char
    public static ReaderMacroFunction FASL_READ_DISPATCH_CHAR =
        new ReaderMacroFunction("fasl-read-dispatch-char", PACKAGE_SYS, false,
                                "stream character")
    {
        
        public SubLObject execute(LispStream stream, char c)

        {
            return stream.readDispatchChar(c, true);
        }
    };

    // ### fasl-sharp-left-paren
    public static DispatchMacroFunction FASL_SHARP_LEFT_PAREN =
        new DispatchMacroFunction("fasl-sharp-left-paren", PACKAGE_SYS, false,
                                  "stream sub-char numarg")
    {
        
        public SubLObject execute(LispStream stream, char c, int n)

        {
            LispThread thread = LispThread.currentThread();
            SubLObject list = stream.readList(true, true);
            if (_BACKQUOTE_COUNT_.symbolValue(thread).isZero()) {
                if (n >= 0) {
                    SubLObject[] array = makeLispObjectArray(n);
                    for (int i = 0; i < n; i++) {
                        array[i] = list.first();
                        if (list.rest() != NIL)
                            list = list.rest();
                    }
                    return makeSimpleVector(array);
                } else
                    return makeSimpleVector(list);
            }
            return makeCons(_BQ_VECTOR_FLAG_.symbolValue(thread), list);
        }
    };

    // ### fasl-sharp-star
    public static DispatchMacroFunction FASL_SHARP_STAR =
        new DispatchMacroFunction("fasl-sharp-star", PACKAGE_SYS, false,
                                  "stream sub-char numarg")
    {
        
        public SubLObject execute(LispStream stream, char ignored, int n)

        {
            LispThread thread = LispThread.currentThread();
            Readtable rt = FaslReadtable.getInstance();
            boolean suppress =
                (LispSymbols.READ_SUPPRESS.symbolValue(thread) != NIL);
            StringBuilder sb = new StringBuilder();
	    try 
	      {
		while (true) {
		  int ch = stream._readChar();
		  if (ch < 0)
                    break;
		  char c = (char) ch;
		  if (c == '0' || c == '1')
                    sb.append(c);
		  else {
                    int syntaxType = rt.getSyntaxType(c);
                    if (syntaxType == Readtable.SYNTAX_TYPE_WHITESPACE ||
                        syntaxType == Readtable.SYNTAX_TYPE_TERMINATING_MACRO) {
		      stream._unreadChar(c);
		      break;
                    } else if (!suppress) {
		      String name = CharacterFunctions.charToName(c);
		      if (name == null)
			name = "#\\" + c;
		      error(new ReaderError("Illegal element for bit-vector: " + name,
					    stream));
                    }
		  }
		}
	      }
	    catch (java.io.IOException e)
	      {
		error(new ReaderError("IO error: ",
				      stream));
		return NIL;
	      }

            if (suppress)
                return NIL;
            if (n >= 0) {
                // n was supplied.
                int length = sb.length();
                if (length == 0) {
                    if (n > 0)
                        return error(new ReaderError("No element specified for bit vector of length " +
                                                      n + '.',
                                                      stream));
                }
                if (n > length) {
                    char c = sb.charAt(length - 1);
                    for (int i = length; i < n; i++)
                        sb.append(c);
                } else if (n < length) {
                    return error(new ReaderError("Bit vector is longer than specified length: #" +
                                                  n + '*' + sb.toString(),
                                                  stream));
                }
            }
            return new SimpleBitVector(sb.toString());
        }
    };

    // ### fasl-sharp-dot
    public static DispatchMacroFunction FASL_SHARP_DOT =
        new DispatchMacroFunction("fasl-sharp-dot", PACKAGE_SYS, false,
                                  "stream sub-char numarg")
    {
        
        public SubLObject execute(LispStream stream, char c, int n)

        {
            LispThread thread = LispThread.currentThread();
            if (LispSymbols.READ_EVAL.symbolValue(thread) == NIL)
                return error(new ReaderError("Can't read #. when *READ-EVAL* is NIL.",
                                              stream));
            else
                return Lisp.eval(stream.faslRead(true, NIL, true, thread),
                            new Environment(), thread);
        }
    };

    // ### fasl-sharp-colon
    public static DispatchMacroFunction FASL_SHARP_COLON =
        new DispatchMacroFunction("fasl-sharp-colon", PACKAGE_SYS, false,
                                  "stream sub-char numarg")
    {
        
        public SubLObject execute(LispStream stream, char c, int n)

        {
            LispThread thread = LispThread.currentThread();
            SubLSymbol symbol = (SubLSymbol) stream.readSymbol(FaslReadtable.getInstance());
            SubLObject pkg = Load._FASL_ANONYMOUS_PACKAGE_.symbolValue(thread);
            Debug.assertTrue(pkg != NIL);
            symbol = ((SubLPackage)pkg).intern(symbol.getJavaSymbolName());
            symbol.setLispPackage(NIL);
            return symbol;
        }
    };

    // ### fasl-sharp-a
    public static DispatchMacroFunction FASL_SHARP_A =
        new DispatchMacroFunction("fasl-sharp-a", PACKAGE_SYS, false,
                                  "stream sub-char numarg")
    {
        
        public SubLObject execute(LispStream stream, char c, int n)

        {
            return stream.faslReadArray(n);
        }
    };

    // ### fasl-sharp-b
    public static DispatchMacroFunction FASL_SHARP_B =
        new DispatchMacroFunction("fasl-sharp-b", PACKAGE_SYS, false,
                                  "stream sub-char numarg")
    {
        
        public SubLObject execute(LispStream stream, char c, int n)

        {
            return stream.faslReadRadix(2);
        }
    };

    // ### fasl-sharp-c
    public static DispatchMacroFunction FASL_SHARP_C =
        new DispatchMacroFunction("fasl-sharp-c", PACKAGE_SYS, false,
                                  "stream sub-char numarg")
    {
        
        public SubLObject execute(LispStream stream, char c, int n)

        {
            return stream.faslReadComplex();
        }
    };

    // ### fasl-sharp-o
    public static DispatchMacroFunction FASL_SHARP_O =
        new DispatchMacroFunction("fasl-sharp-o", PACKAGE_SYS, false,
                                  "stream sub-char numarg")
    {
        
        public SubLObject execute(LispStream stream, char c, int n)

        {
            return stream.faslReadRadix(8);
        }
    };

    // ### fasl-sharp-p
    public static DispatchMacroFunction FASL_SHARP_P =
        new DispatchMacroFunction("fasl-sharp-p", PACKAGE_SYS, false,
                                  "stream sub-char numarg")
    {
        
        public SubLObject execute(LispStream stream, char c, int n)

        {
            return stream.faslReadPathname();
        }
    };

    // ### fasl-sharp-r
    public static DispatchMacroFunction FASL_SHARP_R =
        new DispatchMacroFunction("fasl-sharp-r", PACKAGE_SYS, false,
                                  "stream sub-char numarg")
    {
        
        public SubLObject execute(LispStream stream, char c, int n)

        {
            return stream.faslReadRadix(n);
        }
    };

    // ### fasl-sharp-s
    public static DispatchMacroFunction FASL_SHARP_S =
        new DispatchMacroFunction("fasl-sharp-s", PACKAGE_SYS, false,
                                  "stream sub-char numarg")
    {
        
        public SubLObject execute(LispStream stream, char c, int n)

        {
            return stream.readStructure();
        }
    };

    // ### fasl-sharp-x
    public static DispatchMacroFunction FASL_SHARP_X =
        new DispatchMacroFunction("fasl-sharp-x", PACKAGE_SYS, false,
                                  "stream sub-char numarg")
    {
        
        public SubLObject execute(LispStream stream, char c, int n)

        {
            return stream.faslReadRadix(16);
        }
    };

    // ### fasl-sharp-quote
    public static DispatchMacroFunction FASL_SHARP_QUOTE =
        new DispatchMacroFunction("fasl-sharp-quote", PACKAGE_SYS, false,
                                  "stream sub-char numarg")
    {
        
        public SubLObject execute(LispStream stream, char c, int n)

        {
            return makeCons(LispSymbols.FUNCTION,
                            makeCons(stream.faslRead(true, NIL, true,
                                                     LispThread.currentThread())));
        }
    };

    // ### fasl-sharp-backslash
    public static DispatchMacroFunction FASL_SHARP_BACKSLASH =
        new DispatchMacroFunction("fasl-sharp-backslash", PACKAGE_SYS, false,
                                  "stream sub-char numarg")
    {
        
        public SubLObject execute(LispStream stream, char c, int n)

        {
            return stream.readCharacterLiteral(FaslReadtable.getInstance(),
                                               LispThread.currentThread());
        }
    };

    // ### fasl-sharp-vertical-bar
    public static DispatchMacroFunction FASL_SHARP_VERTICAL_BAR =
        new DispatchMacroFunction("sharp-vertical-bar", PACKAGE_SYS, false,
                                  "stream sub-char numarg")
    {
        
        public SubLObject execute(LispStream stream, char c, int n)

        {
            stream.skipBalancedComment();
            return null;
        }
    };

    // ### fasl-sharp-illegal
    public static DispatchMacroFunction FASL_SHARP_ILLEGAL =
        new DispatchMacroFunction("fasl-sharp-illegal", PACKAGE_SYS, false,
                                  "stream sub-char numarg")
    {
        
        public SubLObject execute(LispStream stream, char c, int n)

        {
            StringBuilder sb =
                new StringBuilder("Illegal # macro character: #\\");
            String s = CharacterFunctions.charToName(c);
            if (s != null)
                sb.append(s);
            else
                sb.append(c);
            return error(new ReaderError(sb.toString(), stream));
        }
    };
}
