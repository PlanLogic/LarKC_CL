package org.appdapter.core.matdat;

import scala.Product$class;
import scala.runtime.ScalaRunTime$;
import scala.collection.Iterator;
import scala.runtime.BoxesRunTime;
import com.hp.hpl.jena.rdf.model.Model;
import java.util.Set;
import scala.runtime.BoxedUnit;
import scala.Tuple4;
import scala.Function1;
import org.appdapter.core.name.Ident;
import org.appdapter.help.repo.RepoClient;
import scala.reflect.ScalaSignature;
import scala.Serializable;
import scala.Product;

@ScalaSignature(bytes = "ugB.A#8eSJ,7\r#fe&4X\rZ$sCBD'BAi\r3bi*QABG>XM\bI\r9eCB$XMqN]4M)\n3AQE)\tq\"AtGd-\t1I\\=SK\"a\tI!!%\t{WO3N_,G:pm&$WM\t]I!\bAxZ;diBQBG79AbU3sSdN_1cYD\"\b%\tAH[f]3Rkp9fGV\tqA%E!&X\r\\5oKF+XM]=TaC#B!5L\b+9f#V,'/_*qKC+I5L\b+9f'B,7MU\"\"K%R!AK\tI,oY\tA[3ma&a&%xn7jK:$\b#B5L\b+9f'B,7MU\"!!A!f\nA3sm\r5J\tV\tA6q5\taG8\t!a.Y7f\tIdGAJItG<\tE\t!5-!'O^$sCBD\n\tu!Q3Ay\nQ\"\\=VaN$(/Z1n6V#A MBA!Iq-\\3e>$W\r)s_ZLG-:\t\r!#Q\n}\na\"\\=VaN$(/Z1n6CFa)=S:LGO\"K%j\t'AQ!\b#A}AQ!\n#ABQA\r#AQBQ!#A}B\"\t%\tAT\t[f$ui9fGV\tq\n!&K\tN^3eJ\f[*qKDb\tKaT\n[f$ui9fGB\"\t%\tAV[f$N]3di;U#A,MABA-I!N]3di+'/<fI\r5\tm!Q!\n]1\"\\=ESJ,7\r#HA!)Q\fC!=Aq-;N_,GF`!\tW.Db\t7-An_,GNeK!4<6f]T![5!HNkWY1m\\7\n9\f'!B'pId\"9\t\nD4fiRK\b/3OC6,G#:MB;)!]3e%(o\bm\t\t\"xw]=CP_>\tu)\b!a?!9Q%I9bv!\r\b{U\n1@i\b!%Ay\fabY8qs\"WMZ1vYR$'F U\ryAB!!5q\tY!Av]DWmY6fI*Q\btgn;bi&|g.!!E;oG\",7m[3e-.8dK\"IQqCG>\n3fM,H3+\t\tIBK(A\"!\b#%\t!a\b\r|/eK\fW;%gUi\"CAEIAA9w]=%I4-7uIQ*\"!!+}\n\tC.\t\t\"0iO]8ek$\bK]3gSb,\"!!\r\tMQHkQA!a:!A.8h\t\tY$kCZ\fBA kaa;sS:<\"CA\"IAA#1(o3vGR\f%/;z+\t\t9EJ1!a\rIe\n!C#\na:pIVG/7f[tGTecAV%q\bs\\5!a\n12%\tyAA\n\n\t'A\bqe>$Wo;Ji\r^8s+\t\tf-1KOR1!!)w7fGRLwN\\[\n9GJi\r^8s%\t\t\bAA\n\t(dC:,/^1m)\t)(a5\t9(Cz9qAQ8pY\fg\\=!a'B\"a %\t%!!!\f7[\"pI$\"!a\t!!AB;p'RN\\4E\"CAFIIAG)/^1mgR!QOAH)\tY&!#1K\n'!E+A#8eSJ,7\r#fe&4X\rZ$sCBDcA\nAAAA\tIjEmE\rvd\n@6qCsa:v]RLW.ZKyJA\tBEN$(/Y2u\rVt7\r^5p]RBq!RAL\t\tI\"QQQAL%)%a\"\t=qSA\n\t,AbaBdFHg),a.:\"1Q$!,A}Aa!JAW9B.A>[\ra{9*!A}aB;oCBH.\fi\rE\f9-CF:aa9uS>tcBJ~9CgPt!A+va2,GCPm!a\n\tMqSA\n\t).AsK$'+Z:pYZ,GCAAl!\t$!7\n\tmQ\nTWm;")
public class IndirectDerivedGraph implements BoundModelProvider, Product, Serializable
{
    private final PipelineQuerySpec myPipeQuerySpec;
    private final RepoClient myPipeSpecRC;
    private final Ident drvGraphID;
    private final NamedModelProvider myUpstreamNMP;
    private DerivedGraphSpec myDGSpec;
    private DirectDerivedGraph myDirectDG;
    private volatile byte bitmap$0;
    
    public static Function1<Tuple4<PipelineQuerySpec, RepoClient, Ident, NamedModelProvider>, IndirectDerivedGraph> tupled() {
        return (Function1<Tuple4<PipelineQuerySpec, RepoClient, Ident, NamedModelProvider>, IndirectDerivedGraph>)IndirectDerivedGraph$.MODULE$.tupled();
    }
    
    public static Function1<PipelineQuerySpec, Function1<RepoClient, Function1<Ident, Function1<NamedModelProvider, IndirectDerivedGraph>>>> curried() {
        return (Function1<PipelineQuerySpec, Function1<RepoClient, Function1<Ident, Function1<NamedModelProvider, IndirectDerivedGraph>>>>)IndirectDerivedGraph$.MODULE$.curried();
    }
    
    private DerivedGraphSpec myDGSpec$lzycompute() {
        synchronized (this) {
            if ((byte)(this.bitmap$0 & 0x1) == 0) {
                this.myDGSpec = DerivedGraphSpecReader$.MODULE$.findOneDerivedGraphSpec(this.myPipeSpecRC(), this.myPipeQuerySpec(), this.drvGraphID());
                this.bitmap$0 |= 0x1;
            }
            final BoxedUnit unit = BoxedUnit.UNIT;
            return this.myDGSpec;
        }
    }
    
    private DirectDerivedGraph myDirectDG$lzycompute() {
        synchronized (this) {
            if ((byte)(this.bitmap$0 & 0x2) == 0) {
                this.myDirectDG = new DirectDerivedGraph(this.myDGSpec(), this.myUpstreamNMP());
                this.bitmap$0 |= 0x2;
            }
            final BoxedUnit unit = BoxedUnit.UNIT;
            return this.myDirectDG;
        }
    }
    
    public Set<Object> assembleModelRoots() {
        return (Set<Object>)BoundModelProvider$class.assembleModelRoots((BoundModelProvider)this);
    }
    
    public PipelineQuerySpec myPipeQuerySpec() {
        return this.myPipeQuerySpec;
    }
    
    public RepoClient myPipeSpecRC() {
        return this.myPipeSpecRC;
    }
    
    public Ident drvGraphID() {
        return this.drvGraphID;
    }
    
    public NamedModelProvider myUpstreamNMP() {
        return this.myUpstreamNMP;
    }
    
    public DerivedGraphSpec myDGSpec() {
        return ((byte)(this.bitmap$0 & 0x1) == 0) ? this.myDGSpec$lzycompute() : this.myDGSpec;
    }
    
    public DirectDerivedGraph myDirectDG() {
        return ((byte)(this.bitmap$0 & 0x2) == 0) ? this.myDirectDG$lzycompute() : this.myDirectDG;
    }
    
    public Model getModel() {
        return this.myDirectDG().getModel();
    }
    
    public TypedResrc getTypedName() {
        return this.myDirectDG().getTypedName();
    }
    
    public IndirectDerivedGraph copy(final PipelineQuerySpec myPipeQuerySpec, final RepoClient myPipeSpecRC, final Ident drvGraphID, final NamedModelProvider myUpstreamNMP) {
        return new IndirectDerivedGraph(myPipeQuerySpec, myPipeSpecRC, drvGraphID, myUpstreamNMP);
    }
    
    public PipelineQuerySpec copy$default$1() {
        return this.myPipeQuerySpec();
    }
    
    public RepoClient copy$default$2() {
        return this.myPipeSpecRC();
    }
    
    public Ident copy$default$3() {
        return this.drvGraphID();
    }
    
    public NamedModelProvider copy$default$4() {
        return this.myUpstreamNMP();
    }
    
    public String productPrefix() {
        return "IndirectDerivedGraph";
    }
    
    public int productArity() {
        return 4;
    }
    
    public Object productElement(final int x$1) {
        Object o = null;
        switch (x$1) {
            default: {
                throw new IndexOutOfBoundsException(BoxesRunTime.boxToInteger(x$1).toString());
            }
            case 3: {
                o = this.myUpstreamNMP();
                break;
            }
            case 2: {
                o = this.drvGraphID();
                break;
            }
            case 1: {
                o = this.myPipeSpecRC();
                break;
            }
            case 0: {
                o = this.myPipeQuerySpec();
                break;
            }
        }
        return o;
    }
    
    public Iterator<Object> productIterator() {
        return (Iterator<Object>)ScalaRunTime$.MODULE$.typedProductIterator((Product)this);
    }
    
    public boolean canEqual(final Object x$1) {
        return x$1 instanceof IndirectDerivedGraph;
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
            if (x$1 instanceof IndirectDerivedGraph) {
                final IndirectDerivedGraph indirectDerivedGraph = (IndirectDerivedGraph)x$1;
                final PipelineQuerySpec myPipeQuerySpec = this.myPipeQuerySpec();
                final PipelineQuerySpec myPipeQuerySpec2 = indirectDerivedGraph.myPipeQuerySpec();
                boolean b = false;
                Label_0173: {
                    Label_0172: {
                        if (myPipeQuerySpec == null) {
                            if (myPipeQuerySpec2 != null) {
                                break Label_0172;
                            }
                        }
                        else if (!myPipeQuerySpec.equals(myPipeQuerySpec2)) {
                            break Label_0172;
                        }
                        final RepoClient myPipeSpecRC = this.myPipeSpecRC();
                        final RepoClient myPipeSpecRC2 = indirectDerivedGraph.myPipeSpecRC();
                        if (myPipeSpecRC == null) {
                            if (myPipeSpecRC2 != null) {
                                break Label_0172;
                            }
                        }
                        else if (!myPipeSpecRC.equals(myPipeSpecRC2)) {
                            break Label_0172;
                        }
                        final Ident drvGraphID = this.drvGraphID();
                        final Ident drvGraphID2 = indirectDerivedGraph.drvGraphID();
                        if (drvGraphID == null) {
                            if (drvGraphID2 != null) {
                                break Label_0172;
                            }
                        }
                        else if (!drvGraphID.equals(drvGraphID2)) {
                            break Label_0172;
                        }
                        final NamedModelProvider myUpstreamNMP = this.myUpstreamNMP();
                        final NamedModelProvider myUpstreamNMP2 = indirectDerivedGraph.myUpstreamNMP();
                        if (myUpstreamNMP == null) {
                            if (myUpstreamNMP2 != null) {
                                break Label_0172;
                            }
                        }
                        else if (!myUpstreamNMP.equals(myUpstreamNMP2)) {
                            break Label_0172;
                        }
                        if (indirectDerivedGraph.canEqual(this)) {
                            b = true;
                            break Label_0173;
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
    
    public IndirectDerivedGraph(final PipelineQuerySpec myPipeQuerySpec, final RepoClient myPipeSpecRC, final Ident drvGraphID, final NamedModelProvider myUpstreamNMP) {
        this.myPipeQuerySpec = myPipeQuerySpec;
        this.myPipeSpecRC = myPipeSpecRC;
        this.drvGraphID = drvGraphID;
        this.myUpstreamNMP = myUpstreamNMP;
        BoundModelProvider$class.$init$((BoundModelProvider)this);
        Product$class.$init$((Product)this);
    }
}

/*

	Total time: 55 ms
	
*/