package org.appdapter.core.matdat;

import scala.Product$class;
import scala.runtime.ScalaRunTime$;
import scala.collection.Iterator;
import scala.runtime.BoxesRunTime;
import scala.Tuple3;
import scala.Function1;
import scala.reflect.ScalaSignature;
import scala.Serializable;
import scala.Product;

@ScalaSignature(bytes = "cB.U5qK2Lg.Z)vKJL8]3d\tA!nCR$\r\tAaY8sK*qC\nCBH-9uKJT!C_J<7A\n1R!5\taBC8-7b\t\tbBB]fVM\tMI!\bAxZ;diBQBF/9AbU3sSdN_1cYD\"%\tAGaBdg.;ueF+XM]=RV\t1?9Q\"H=9\ta:fI4B\"FO]5oO*aD\tG\t)A77oR$(/U;fef\ff\n\t\tK)!C5q7o'J+^3ssFsC#BAHN\\*sGF+XM]=RB\"%\tAG\faBdgn:ba\"\ff\n,\tE\t!1\b8He\b.(!i\"/aN\\5u}Q!q&\r4!\t!DIB1)C1IC1)!!AY\nAaY8qsR!qf:IB%AAmAq!\n1C*iA\tA\tm!Cyq1m9zI,g-Y;mi\nT#A+mq4&A +U\"A!\t!C;oG\",7m[3e\t!e\"b]:|G/;j_:L!AR!#Ut7\r[3dW$g+:jC:W\rCIEI\r|/eK\fW;%e!9!\nAI\naAD2paf$C-4bk2$He\r\b\t\t\"N5(o3vGR&/4jqV\ta\nP)6\tKR%!A.8h6bmL!\t)\tY!C/aO]8ek$I]5usV\t\f3&!L:$\bb/%\t!XaJ|G-^2u2,W.8u)\tq\r?&M:L\bb2\\\rWq\nb3%\t%ZaJ|G-^2uR,'/;peV\ta\rEhUzkS:\t!bY8mYG/[8o\tYNJi\r^8si!!A9\fbY1oF,\r_J\"!9\nEt!a\"p_2,M\bE2\f\t1_!\b!!ABU\f[1tQ{G-1\"9qAA\nB;p'RN\\49CqA30fcV\fGn_rDqAY=alB\tA@#AK/7j]\fV/:z'B,7\rE11\"#1A\n\t)!\t\t\tiaG_5qa:v]RLW.Z\tIAA\tBEN$(/Y2u\rVt7\r^5p]NBq!LA\t\tF !9AA\nB\bBCA\r\t\t\"!)\r9msR9q&!\b BB\r1&/\raS]A\tAA\n9#Av]\b\\=\t%Q\t-qF[q!AB(qi&|gcY2dGgq!A+va2,7C8\r!a_\n\tmAA\n\ti$AsK$'+Z:pYZ,GCAA !\ryI&AB(cUG")
public class PipelineQuerySpec implements Product, Serializable
{
    private final String pplnAttrQueryQN;
    private final String pplnSrcQueryQN;
    private final String pplnGraphQN;
    
    public static Function1<Tuple3<String, String, String>, PipelineQuerySpec> tupled() {
        return (Function1<Tuple3<String, String, String>, PipelineQuerySpec>)PipelineQuerySpec$.MODULE$.tupled();
    }
    
    public static Function1<String, Function1<String, Function1<String, PipelineQuerySpec>>> curried() {
        return (Function1<String, Function1<String, Function1<String, PipelineQuerySpec>>>)PipelineQuerySpec$.MODULE$.curried();
    }
    
    public String pplnAttrQueryQN() {
        return this.pplnAttrQueryQN;
    }
    
    public String pplnSrcQueryQN() {
        return this.pplnSrcQueryQN;
    }
    
    public String pplnGraphQN() {
        return this.pplnGraphQN;
    }
    
    public PipelineQuerySpec copy(final String pplnAttrQueryQN, final String pplnSrcQueryQN, final String pplnGraphQN) {
        return new PipelineQuerySpec(pplnAttrQueryQN, pplnSrcQueryQN, pplnGraphQN);
    }
    
    public String copy$default$1() {
        return this.pplnAttrQueryQN();
    }
    
    public String copy$default$2() {
        return this.pplnSrcQueryQN();
    }
    
    public String copy$default$3() {
        return this.pplnGraphQN();
    }
    
    public String productPrefix() {
        return "PipelineQuerySpec";
    }
    
    public int productArity() {
        return 3;
    }
    
    public Object productElement(final int x$1) {
        String s = null;
        switch (x$1) {
            default: {
                throw new IndexOutOfBoundsException(BoxesRunTime.boxToInteger(x$1).toString());
            }
            case 2: {
                s = this.pplnGraphQN();
                break;
            }
            case 1: {
                s = this.pplnSrcQueryQN();
                break;
            }
            case 0: {
                s = this.pplnAttrQueryQN();
                break;
            }
        }
        return s;
    }
    
    public Iterator<Object> productIterator() {
        return (Iterator<Object>)ScalaRunTime$.MODULE$.typedProductIterator((Product)this);
    }
    
    public boolean canEqual(final Object x$1) {
        return x$1 instanceof PipelineQuerySpec;
    }
    
    @Override
    public int hashCode() {
        return ScalaRunTime$.MODULE$._hashCode((Product)this);
    }
    
    @Override
    public String toString() {
        return ScalaRunTime$.MODULE$._toString((Product)this);
    }
    
    @Override
    public boolean equals(final Object x$1) {
        if (this != x$1) {
            if (x$1 instanceof PipelineQuerySpec) {
                final PipelineQuerySpec pipelineQuerySpec = (PipelineQuerySpec)x$1;
                final String pplnAttrQueryQN = this.pplnAttrQueryQN();
                final String pplnAttrQueryQN2 = pipelineQuerySpec.pplnAttrQueryQN();
                boolean b = false;
                Label_0141: {
                    Label_0140: {
                        if (pplnAttrQueryQN == null) {
                            if (pplnAttrQueryQN2 != null) {
                                break Label_0140;
                            }
                        }
                        else if (!pplnAttrQueryQN.equals(pplnAttrQueryQN2)) {
                            break Label_0140;
                        }
                        final String pplnSrcQueryQN = this.pplnSrcQueryQN();
                        final String pplnSrcQueryQN2 = pipelineQuerySpec.pplnSrcQueryQN();
                        if (pplnSrcQueryQN == null) {
                            if (pplnSrcQueryQN2 != null) {
                                break Label_0140;
                            }
                        }
                        else if (!pplnSrcQueryQN.equals(pplnSrcQueryQN2)) {
                            break Label_0140;
                        }
                        final String pplnGraphQN = this.pplnGraphQN();
                        final String pplnGraphQN2 = pipelineQuerySpec.pplnGraphQN();
                        if (pplnGraphQN == null) {
                            if (pplnGraphQN2 != null) {
                                break Label_0140;
                            }
                        }
                        else if (!pplnGraphQN.equals(pplnGraphQN2)) {
                            break Label_0140;
                        }
                        if (pipelineQuerySpec.canEqual(this)) {
                            b = true;
                            break Label_0141;
                        }
                    }
                    b = false;
                }
                if (b) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public PipelineQuerySpec(final String pplnAttrQueryQN, final String pplnSrcQueryQN, final String pplnGraphQN) {
        this.pplnAttrQueryQN = pplnAttrQueryQN;
        this.pplnSrcQueryQN = pplnSrcQueryQN;
        this.pplnGraphQN = pplnGraphQN;
        Product$class.$init$((Product)this);
    }
}

/*

	Total time: 20 ms
	
*/