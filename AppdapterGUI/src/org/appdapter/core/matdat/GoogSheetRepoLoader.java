package org.appdapter.core.matdat;

import scala.collection.immutable.StringOps;
import scala.Predef$;
import java.util.List;
import com.hp.hpl.jena.query.Dataset;
import org.appdapter.core.store.dataset.SpecialRepoLoader;
import com.hp.hpl.jena.rdf.model.Model;
import java.util.Map;
import org.slf4j.Logger;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "}eB-1cR8pONCW-;SKB|Gj\\1eKJT!a\r5\fGZ1u\t)a!d_J,'BA\t%\t3baR,'OC\n\ry'oZ'\tA5\t!!\t)J\\:uC2dM7f%xNU3bI\b\"B\t\tAj]&$h\bF!\tiCc#nC.,'+9p'B,7\r5ZCA\tI\"AA\tH_><7[3fiJ+o\\*qKDQaAq\tA]1uQBQd\t\b=ja\bA)1oY1mC&!eH!J,G-4\n*#AB*ue&twM#?!)qaQ!M]4t!\rqHU}Q!:sCfDQ\fA5\n1a't!\rq3'N_)'MkRLGNC3QM^1\nQz#'jgR\"AN]R!O\t1\fgnZu]1b7bgNdu.3fe\")A\bC!{1q-;FqR$A\tm}J!J\tAI!,GoQ8oiLg.:UsB,\"B\"\tjD4fiNCW-;UsB,\"B#\t2a7pCluZ3mg&sGo+be,GR1uCN,GFHR#g&j\b+:LGCL\tA*sKB|CA'Sq%BA(Q!\r^1tKRT!!M$xN]3\nMs%!E*qKL\r*fa>du.3fe\")Qa-AQ.Y5o\tN,GXE6\tLZ5)/^3ss*1\fXUtM^=7}A5q\taA2p[&1\r\b\t$m]3u)G\t1g!!N]'pIdCA4mA'BA5kiwZ3m\tY',AsIL!!55{G-7\t=$ALG.Z'pId7\tT:\bE:'{wnZ*iK$(+9p>\fG-:5h!B!8CA:v!\t10Dx\tAH!Am_L!A_<\t7/[2EK\n,xmZ3s\t2\"})\b\"@t\ty!E7bW<un\\4TQ,GOU3q_RaAA\t)\"!AQ\"a\n!AATQ,GOU3q_\"1B?Aq\tQb5fKRdunY1uS>tbBA{qB]lWm9bG.Z3ulW\rE#I1!a \rIe\b/i\bAA\b1!N]*iK$h*Y7fyW1.\ti\" a?\tB]3q_NXm\tbAA\tA!+9p'B,7\rC(M$\t!!5I,\r#jeGo:z>$W\r$s_6<un\\4\fY#!\f2!9BAaCAK\r!a9\fW.Z:qC,7[3fi\"A1GA\ty!eSJ.Z3u\t9dCs\t\\8bINCW-;N_,Gn]%oi>$M]4fiG/Y:fiRIq)a>}\tU'\t\rU)1W)QaM\"1q.!A5Bq!!t\t\t9%\bsK$Wj3fYNCW-;\fI%!R!91JA\"aC:iK$8*Z=\t=1\ta\tb5fKRtU/'\n%AAU!8t4-T1q!qq\r\tIf\f\bbBA/gqLe\fG-T8eK24%o\\7H_><Gc4b\rq\r\b\nY1!\t)'aA=!8b[\b/Y2f'\",W\r(v[\"ANA.\ty!AeSJ.Z3uVl\"CA7gFIAA8aX-3N_,Gn5fKR$C-4bk2$HeMcRC!!t-Q\to\n\t)z)!1PA?%)hn5fG.,GMC }\t!\"8o_R\fG/[8o\t)!#Ut7\r[3dW$g+:jC:W\rC\bN$\t!!#'Ax^3di$GeZ3u><w-:\t-B!a$6'C!B:mMRRBAL#aT8hO\bBCAN\t1J5\b")
public class GoogSheetRepoLoader extends InstallableRepoReader
{
    public static Logger protected$getLogger(final GoogSheetRepoLoader$ x$1) {
        return GoogSheetRepoLoader$.MODULE$.protected$getLogger(x$1);
    }
    
    public static Map<String, String> readModelSheet$default$3() {
        return GoogSheetRepoLoader$.MODULE$.readModelSheet$default$3();
    }
    
    public static Model readModelFromGoog(final String sheetKey, final int namespaceSheetNum, final int dirSheetNum) {
        return GoogSheetRepoLoader$.MODULE$.readModelFromGoog(sheetKey, namespaceSheetNum, dirSheetNum);
    }
    
    public static Model readModelSheet(final String sheetKey, final int sheetNum, final Map<String, String> nsJavaMap) {
        return GoogSheetRepoLoader$.MODULE$.readModelSheet(sheetKey, sheetNum, nsJavaMap);
    }
    
    public static void loadSheetModelsIntoTargetDataset(final SpecialRepoLoader repo, final Dataset mainDset, final Model dirModel, final List<ClassLoader> fileModelCLs) {
        GoogSheetRepoLoader$.MODULE$.loadSheetModelsIntoTargetDataset(repo, mainDset, dirModel, fileModelCLs);
    }
    
    public static Model readDirectoryModelFromGoog(final String sheetLocation, final int namespaceSheet, final int dirSheet) {
        return GoogSheetRepoLoader$.MODULE$.readDirectoryModelFromGoog(sheetLocation, namespaceSheet, dirSheet);
    }
    
    public static SheetRepo makeGoogSheetRepo(final String sheetLocation, final int namespaceSheetName, final int dirSheetName, final List<ClassLoader> fileModelCLs, final RepoSpec repoSpec) {
        return GoogSheetRepoLoader$.MODULE$.makeGoogSheetRepo(sheetLocation, namespaceSheetName, dirSheetName, fileModelCLs, repoSpec);
    }
    
    public static void logDebug(final String s) {
        GoogSheetRepoLoader$.MODULE$.logDebug(s);
    }
    
    public static void logWarning(final String s) {
        GoogSheetRepoLoader$.MODULE$.logWarning(s);
    }
    
    public static void logError(final String s) {
        GoogSheetRepoLoader$.MODULE$.logError(s);
    }
    
    public static void logWarning(final String s, final Throwable t) {
        GoogSheetRepoLoader$.MODULE$.logWarning(s, t);
    }
    
    public static void logError(final String s, final Throwable t) {
        GoogSheetRepoLoader$.MODULE$.logError(s, t);
    }
    
    public static void logInfo(final String s) {
        GoogSheetRepoLoader$.MODULE$.logInfo(s);
    }
    
    public static void logInfo(final int n, final String s) {
        GoogSheetRepoLoader$.MODULE$.logInfo(n, s);
    }
    
    public static Long logInfoEvent(final int n, final boolean b, final Long n2, final String s, final Object[] array) {
        return GoogSheetRepoLoader$.MODULE$.logInfoEvent(n, b, n2, s, array);
    }
    
    public static boolean checkDebugImportance(final int n) {
        return GoogSheetRepoLoader$.MODULE$.checkDebugImportance(n);
    }
    
    public static void setDebugImportanceThreshold(final int debugImportanceThreshold) {
        GoogSheetRepoLoader$.MODULE$.setDebugImportanceThreshold(debugImportanceThreshold);
    }
    
    public static void setLogger(final Logger logger) {
        GoogSheetRepoLoader$.MODULE$.setLogger(logger);
    }
    
    public static void useLoggerForClass(final Class clazz) {
        GoogSheetRepoLoader$.MODULE$.useLoggerForClass(clazz);
    }
    
    public GoogSheetRepoSpec makeRepoSpec(final String path, final String[] args, final List<ClassLoader> cLs) {
        return new GoogSheetRepoSpec(args[0], new StringOps(Predef$.MODULE$.augmentString(args[1])).toInt(), new StringOps(Predef$.MODULE$.augmentString(args[2])).toInt(), (List)cLs);
    }
    
    public String getExt() {
        return "goog";
    }
    
    public String getContainerType() {
        return "ccrt:GoogSheetRepo";
    }
    
    public String getSheetType() {
        return "ccrt:GoogSheet";
    }
    
    public void loadModelsIntoTargetDataset(final SpecialRepoLoader repo, final Dataset mainDset, final Model dirModel, final List<ClassLoader> fileModelCLs) {
        GoogSheetRepoLoader$.MODULE$.loadSheetModelsIntoTargetDataset(repo, mainDset, dirModel, fileModelCLs);
    }
}

/*

	Total time: 40 ms
	
*/