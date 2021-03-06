package org.appdapter.core.matdat;

import com.hp.hpl.jena.query.Dataset;
import org.appdapter.core.store.dataset.SpecialRepoLoader;
import java.util.Map;
import com.hp.hpl.jena.rdf.model.Model;
import java.util.List;
import org.slf4j.Logger;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\t%aB-1'T1NCW-;SKB|Gj\\1eKJT!a\r5\fGZ1u\t)a!d_J,'BA\t%\t3baR,'OC\n\ry'oZ'\tA5\t!!\t)J\\:uC2dM7f%xNU3bI\b\"B\t\tAj]&$h\bF!\tiCc#nC.,'+9p'B,7\r5ZCA\tI\"AA\fPMdN\\3YYN.Z3u%xn9fG\")1a9!/;i!\ti2EC5\tqDC!8-7b\ts$Qe$WMZIaa;sS:<'B 9C1)\t18ESqI!AK(/Y=\t1\"A\rd5E/gUja\faE\nA!;jY*\t!'kCZ\fB0an;YJT\"Aa\n7b]L!AO\rcm]:M_$WMy!\t%PO$X\t;y\"AN \n:\"B!\tjE4fi{g^1j]H+9f\">19W\r^*iK$H+9f)\"Gmaw.3N_,Gn]%oi>$M]4fiG/Y:fiR)qI+e]BaS~A!8ji\")1\na!!/9p!\ti%+DO\ty+AeCR\f7/;E#!B:u_J,BA*OE/Z2jC2V\r]8M_$WM+\rAV\t[LgR:fiBqKY1*LWcV,'/7rAA[3oC*QLXQBd'BA0a\tAOCb\rw.\\GbqR1uCN,GCf\ta-eSJluZ3m!\t9G.Di\tI'.An_,GNl5!4\n5D'!B'pId\"B8Ei4jYluZ3m2x!B9a-M'b.Z3u%xT8bI\bCAt\r\t!#u'\tXws6\tqOy\tAn\\4\ni<(!\"bg&G)2vO,'CgAFsq8\" bw.3TQ,G/T8eK2J;p)x-;ECR\f7/;\t!a%\"B&~a\"B+~1BBA{a-\tnsK'/Z2u_JLXj3fY\")q. a[1QB:1bQ8bY8-Z*ueV!CA'\tY!ay\t)\"C}a!8z%4bCA\t)A;\t!\t?\t\t\r1bK!Q\tOac*%1F9{G[5oO\"9#a=BBAkb!a\r\fuQ\"A:\tmQa;A\"!\f1H\rIElM]6%c6\f'o;\ti@]AAbBA\"g\rQIG>\fG.Z:dK~HO]5oOV!qIA')\tI%a\rM1BA&!\ty\"!\r\tbKA\"aB1\n\b'HAA+Eaw.3YNC6[3fiJ+o\r/\ni&!f%1\tebAA.\tI1[3fiJ+o\b?\n\t15\b.Z3u>\r^5p]\"91MA)aA8b[\b/Y2f'\",W\r(b[Dq!aRA$eSJ.Z3ulW\rp#\r!\f\t[\n\t1pA!/9p'B,7\rEcJ1!a!V\r]8TabBA<gPe\fG-T8eK2.Z3u1RIa-a~1\b?\n)\b1\ty(!Aq\tb5fKRt-\\3\t\rQaB\\:KCZ\fW*99\n9\t\b\n%uFANCBDaa\\A;ibBAHgSe\fG\rR5sK$xN]=N_,GN:p[bc5\nMMQSAL3Cq!aACd5\tQa9!Aq.!$QCN\r\" )2.Z=G_JDFj-C_>$8[3fiJT# \t\r6)A}12.Z=G_JDFj-C_>$8[3fiJC(N\r\" ian]*iK$h*Y7feIBq!a+tA%a(\bogNCW-;OC6,'G\r\t=6O1A}A3jeNCW-;OC6,'G\r\bg\b!?=!N]*iK$h*Y7feI\"CA\\g\nIAAPI\tX/:jKN.Z3ulWM\r\tm6)A}/^3sS8[3fi:W.3A!9qX:\n!7pC$Vm;YNC6[3fiJ+o/Bq!!2t\t\t9-nC&tGcA$J\"91ZAbAB1sONDq!a4t\t\t\t.uKN$8+Z7TQ,GFH'Dq!a3NCXN\f\n\"Z!#/Z1e\t&Xm;pefluZ3m\rJ|W'T1\"WMZ1vYR$C'\\*Q&!8,}BAqWl!!a9\tq]\nk:.Z2lKT1!!; )\tgN\\8uCRLwN\\[\fOA\tv]DWmY6fIZ'/[1oGDq!!=t\t\t0A\nqe>$Xm;fI:W\r'pO,'v\n\rACAA|!\tI0a@m(bAA)145U&!!AA~aunZ4fe\"Q!QAAx\rAaa$Ga")
public class XLSXSheetRepoLoader extends InstallableRepoReader
{
    public static Logger protected$getLogger(final XLSXSheetRepoLoader$ x$1) {
        return XLSXSheetRepoLoader$.MODULE$.protected$getLogger(x$1);
    }
    
    public static List<ClassLoader> readDirectoryModelFromXLSX$default$4() {
        return XLSXSheetRepoLoader$.MODULE$.readDirectoryModelFromXLSX$default$4();
    }
    
    public static void testSemSheet(final String[] args) {
        XLSXSheetRepoLoader$.MODULE$.testSemSheet(args);
    }
    
    public static void main(final String[] args) {
        XLSXSheetRepoLoader$.MODULE$.main(args);
    }
    
    public static String queriesSheetName22() {
        return XLSXSheetRepoLoader$.MODULE$.queriesSheetName22();
    }
    
    public static String dirSheetName22() {
        return XLSXSheetRepoLoader$.MODULE$.dirSheetName22();
    }
    
    public static String nsSheetName22() {
        return XLSXSheetRepoLoader$.MODULE$.nsSheetName22();
    }
    
    public static String keyForXLSXBootSheet22() {
        return XLSXSheetRepoLoader$.MODULE$.keyForXLSXBootSheet22();
    }
    
    public static Model readDirectoryModelFromXLSX(final String sheetLocation, final String namespaceSheetName, final String dirSheetName, final List<ClassLoader> fileModelCLs) {
        return XLSXSheetRepoLoader$.MODULE$.readDirectoryModelFromXLSX(sheetLocation, namespaceSheetName, dirSheetName, fileModelCLs);
    }
    
    public static Model readModelSheetX(final String sheetLocation, final String sheetName, final Map<String, String> nsJavaMap, final List<ClassLoader> fileModelCLs) {
        return XLSXSheetRepoLoader$.MODULE$.readModelSheetX(sheetLocation, sheetName, nsJavaMap, fileModelCLs);
    }
    
    public static SheetRepo loadXLSXSheetRepo(final String sheetLocation, final String namespaceSheetName, final String dirSheetName, final List<ClassLoader> fileModelCLs, final RepoSpec repoSpec) {
        return XLSXSheetRepoLoader$.MODULE$.loadXLSXSheetRepo(sheetLocation, namespaceSheetName, dirSheetName, fileModelCLs, repoSpec);
    }
    
    public static <A extends String> CoalesceStr<A> coalesce_string(final A a) {
        return XLSXSheetRepoLoader$.MODULE$.coalesce_string(a);
    }
    
    public static void loadSheetModelsIntoTargetDataset(final SpecialRepoLoader repo, final Dataset mainDset, final Model myDirectoryModel, final List<ClassLoader> fileModelCLs) {
        XLSXSheetRepoLoader$.MODULE$.loadSheetModelsIntoTargetDataset(repo, mainDset, myDirectoryModel, fileModelCLs);
    }
    
    public static void logDebug(final String s) {
        XLSXSheetRepoLoader$.MODULE$.logDebug(s);
    }
    
    public static void logWarning(final String s) {
        XLSXSheetRepoLoader$.MODULE$.logWarning(s);
    }
    
    public static void logError(final String s) {
        XLSXSheetRepoLoader$.MODULE$.logError(s);
    }
    
    public static void logWarning(final String s, final Throwable t) {
        XLSXSheetRepoLoader$.MODULE$.logWarning(s, t);
    }
    
    public static void logError(final String s, final Throwable t) {
        XLSXSheetRepoLoader$.MODULE$.logError(s, t);
    }
    
    public static void logInfo(final String s) {
        XLSXSheetRepoLoader$.MODULE$.logInfo(s);
    }
    
    public static void logInfo(final int n, final String s) {
        XLSXSheetRepoLoader$.MODULE$.logInfo(n, s);
    }
    
    public static Long logInfoEvent(final int n, final boolean b, final Long n2, final String s, final Object[] array) {
        return XLSXSheetRepoLoader$.MODULE$.logInfoEvent(n, b, n2, s, array);
    }
    
    public static boolean checkDebugImportance(final int n) {
        return XLSXSheetRepoLoader$.MODULE$.checkDebugImportance(n);
    }
    
    public static void setDebugImportanceThreshold(final int debugImportanceThreshold) {
        XLSXSheetRepoLoader$.MODULE$.setDebugImportanceThreshold(debugImportanceThreshold);
    }
    
    public static void setLogger(final Logger logger) {
        XLSXSheetRepoLoader$.MODULE$.setLogger(logger);
    }
    
    public static void useLoggerForClass(final Class clazz) {
        XLSXSheetRepoLoader$.MODULE$.useLoggerForClass(clazz);
    }
    
    public OfflineXlsSheetRepoSpec makeRepoSpec(final String path, final String[] v3, final List<ClassLoader> cLs) {
        return new OfflineXlsSheetRepoSpec(v3[0], v3[1], v3[3], (List)cLs);
    }
    
    public String getExt() {
        return "xlsx";
    }
    
    public String getContainerType() {
        return "ccrt:XlsxWorkbookRepo";
    }
    
    public String getSheetType() {
        return "ccrt:XlsxSheet";
    }
    
    public void loadModelsIntoTargetDataset(final SpecialRepoLoader repo, final Dataset mainDset, final Model dirModel, final List<ClassLoader> fileModelCLs) {
        XLSXSheetRepoLoader$.MODULE$.loadSheetModelsIntoTargetDataset(repo, mainDset, dirModel, fileModelCLs);
    }
    
    public static class CoalesceStr<A extends String>
    {
        private final A a;
        
        public A $qmark$qmark(final A b) {
            return (this.a == null || this.a.length() == 0) ? b : this.a;
        }
        
        public CoalesceStr(final A a) {
            this.a = a;
        }
    }
}

/*

	Total time: 37 ms
	
*/