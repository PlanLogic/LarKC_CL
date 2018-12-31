package org.logicmoo.system;

import static org.armedbear.lisp.Lisp.PACKAGE_CL;
import static org.armedbear.lisp.Lisp.PACKAGE_CL_USER;
import static org.armedbear.lisp.Lisp.PACKAGE_CYC;
import static org.armedbear.lisp.Lisp.PACKAGE_EXT;
import static org.armedbear.lisp.Lisp.PACKAGE_JAVA;
import static org.armedbear.lisp.Lisp.PACKAGE_SUBLISP;
import static org.armedbear.lisp.Lisp.T;

import java.awt.Container;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

import org.appdapter.gui.api.BoxPanelSwitchableView;
import org.appdapter.gui.browse.Utility;
import org.appdapter.gui.demo.DemoBrowser;
import org.armedbear.j.Editor;
import org.armedbear.j.Log;
import org.armedbear.j.ReaderThread;
import org.armedbear.lisp.Cons;
import org.armedbear.lisp.ControlTransfer;
import org.armedbear.lisp.Environment;
import org.armedbear.lisp.Java;
import org.armedbear.lisp.JavaObject;
//import org.appdapter.core.log.Debuggable;
import org.armedbear.lisp.Lisp;
import org.armedbear.lisp.LispError;
import org.armedbear.lisp.LispObject;
import org.armedbear.lisp.LispThread;
import org.armedbear.lisp.Main;
import org.armedbear.lisp.Nil;
import org.armedbear.lisp.Operator;
import org.armedbear.lisp.Package;
import org.armedbear.lisp.Packages;
import org.armedbear.lisp.SpecialOperator;
import org.armedbear.lisp.Symbol;
import org.armedbear.lisp.Version;
import org.jpl7.JPL;
import org.jpl7.Query;
import org.logicmoo.bb.BeanBowl;
import org.logicmoo.bb.BeansContextListener;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Resourcer;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLListListIterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLMain;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLReader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThreadPool;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLOperator;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.ui.SubLReaderPanel;
import com.netbreeze.bbowl.gui.BeanBowlGUI;


//import com.netbreeze.bbowl.gui.BeanBowlGUI;

import bsh.EvalError;
import bsh.Interpreter;
import bsh.NameSpace;
import bsh.Primitive;
import bsh.Reflect;
import bsh.This;
import bsh.UtilEvalError;
import bsh.util.JConsole;
import sun.misc.Unsafe;

public class BeanShellCntrl
{

	public static void bp()
	{
		if (false)
			;
		// BeanBowlGUI.startBeanBowl();
	}

	public static boolean calledStartDmiles = false;

	public static boolean disableProlog = false;
	public static boolean disablePrologSync = true;

	public static boolean calledStartAppdatper = false;
	public static BeanBowl bowl = new BeanBowl();
	public static Object dbrowser;
	public static Interpreter interpreter;
	final static Map<String, CreationInfo> singletons = new HashMap<String, CreationInfo>();
	private static final LispObject[] EMPTY_LISP_OBJECT = new LispObject[0];

	static public Method useSet = null;
	static
	{
		try
		{
			// DemoBrowser.testLoggingSetup();
			useSet = BeanShellCntrl.class.getDeclaredMethod("bp");
			// BeanBowlGUI.startBeanBowl();
			// Debuggable.setIsTesting(true);
			// Debuggable.setDebugging(false);
		} catch (SecurityException e)
		{
			throw new RuntimeException(e);
		} catch (NoSuchMethodException e)
		{
			throw new RuntimeException(e);
		}
	}

	// final public static BeanBowlGUI gui = BeanBowlGUI.getDefaultFrame();

	static public class StartupError extends Error
	{

		public StartupError(String string) {
			super(string);

		}

	}

	static Container desktop;

	static public Object findDesktopPane(Object thiz)
	{
		if (desktop != null)
			return desktop;
		NameSpace ns = ((This) thiz).getNameSpace();
		Object pane;
		try
		{
			pane = ns.getVariable("pane");
			if (pane == null || pane == Primitive.VOID)
			{

				if (false && org.appdapter.gui.browse.Utility.controlApp != null)
				{

					BoxPanelSwitchableView bpo = org.appdapter.gui.browse.Utility.controlApp.getBoxPanelTabPane();
					if (bpo != null)
					{
						Container container = bpo.getContainer();
						ns.setVariable("pane", container, false);
						Container parent = container.getParent();
						while (parent.getParent() != null)
						{
							parent = parent.getParent();
						}
						ns.setVariable("frame", parent, false);
						return container;
					}
				}
				pane = desktop = new JDesktopPane();
				ns.setVariable("pane", pane, false);
			}
			return pane;
		} catch (Exception e)
		{
			MsgBox.error(e);
		}

		return null;
	}

	public static void startEmbedded()
	{
	//	org.armedbear.lisp.Interpreter.createInstance();

	}

	public static void addConsole(bsh.This thiz, final JConsole console) throws UtilEvalError, EvalError
	{
		Object o = thiz.getNameSpace().getVariable("interpreter", false);
		Interpreter interpreter = null;
		if (o instanceof Interpreter)
		{
			interpreter = (Interpreter) o;
		}

		String myName = null;
		o = thiz.getNameSpace().getVariable("name", false);
		if (o instanceof String)
		{
			myName = (String) o;
			addObject(myName, thiz);
			String myNameL = myName.toLowerCase();
			if (myNameL.contains("lispui"))
			{
				connectLisp(myName, console);
				return;
			} else if (myNameL.contains("lisp"))
			{
				if (Main.needIOConsole)
				{
					Main.needIOConsole = false;
					thiz.invokeMethodVA("captureSysIO");
					//connectLisp(myName, console);
					return;
				} else {
					connectLisp(myName, console);
				}
				return;
			} else if (myNameL.contains("prolog"))
			{
				/// console.setNameCompletion(new LispNameCompletion());
				connectProlog(myName, console);
				return;
			}
		}
		if (interpreter != null)
		{
			return;
		}
		// setSingleton(thiz);
		try
		{
			if (Main.needIOConsole)
			{
				Main.needIOConsole = false;
				thiz.invokeMethodVA("captureSysIO");
				// if (false) {
				// Lisp.setIO((new SystemCurrent.In(myName) {
				// @Override
				// public InputStream getIn() {
				// return console.getInputStream();
				// }
				// }), (new SystemCurrent.Out(myName) {
				// @Override
				// public OutputStream getOutStream() {
				// return console.getOut();
				// }
				// }));
				//
				// }
			}
		} catch (EvalError e)
		{
			MsgBox.error(e);
			throw new RuntimeException(e);
		}
		System.out.println("Hi");
	}

	/**
	 * @param console
	 * @throws IOException
	 */
	public static JConsole connectLisp(String myName, final JConsole console0)
	{
		final JConsole console;
		if (console0 == null)
			console = new JConsole(myName);
		else
			console = console0;
		SubLThreadPool.newSubLThread(new SubLProcess(myName)
		{
			@Override
			public void safeRun()
			{
				try
				{
					org.armedbear.lisp.Interpreter interp = org.armedbear.lisp.Interpreter.createNewLispInstance(
							console.getInputStream(), console.getOut(), new File("./").getCanonicalPath(),
							Version.getVersion());
					console.setNameCompletion(new LispNameCompletion());
					interp.run();
				} catch (IOException e)
				{
					MsgBox.error(e);
					throw JVMImpl.doThrow(e);
				}
			}

		});
		return console;
	}

	private static JConsole connectProlog(String name, final JConsole console0)
	{
		final JConsole console;
		if (console0 == null)
			console = new JConsole(name);
		else
			console = console0;
		try
		{
			swipl_init_server();
			Socket p = null;
			try {
				 p = new Socket("localhost", 4023);
				if (!p.isConnected())
				p.connect(p.getRemoteSocketAddress(), 2000);// endpoint, 1000);
			}
			catch (IOException sto) {
				console.setName(""+sto);
				return console;
			}
			final OutputStreamWriter stdin = new OutputStreamWriter(p.getOutputStream());
			ReaderThread stdoutThread = new ReaderThread(p.getInputStream())
			{
				@Override
				public void update(String s)
				{
					console.print(s);
				}
			};
			ReaderThread stdinThread = new ReaderThread(console.getInputStream())
			{
				@Override
				public void update(String s)
				{
					try
					{
						stdin.write(s);
						stdin.flush();
					} catch (IOException e)
					{
						e.printStackTrace();
						throw JVMImpl.doThrow(e);
					}
				}
			};
			stdoutThread.start();
			stdinThread.start();

		} catch (Throwable t)
		{
			Log.error(t);
			throw throwException(t);
		}
		return console;

	}

	@LispMethod
	static public Object prolog_ui() throws EvalError
	{
		JConsole console = (JConsole) bsh_eval("makeConsole(\"PrologUI\")");
		return console;
	}

	@LispMethod
	static public Object lisp_ui() throws EvalError
	{
		JConsole console = (JConsole) bsh_eval("makeConsole(\"LispUI\")");
		return console;
	}


	@LispMethod
	static public Object bsh_eval(String statements) throws EvalError
	{
		return ensureBSH().eval(statements);
	}

	@SuppressWarnings("unchecked")
	private static <T extends Throwable> Error throwException1(final Throwable exception, Object dummy) throws T
	{
		throw (T) exception;
	}

	public static Error throwException(Throwable exception)
	{
		if (true)
			getUnsafe().throwException(exception);
		return BeanShellCntrl.<RuntimeException>throwException1(exception, null);
	}

	public static Unsafe getUnsafe()
	{
		try
		{
			Field field = Unsafe.class.getDeclaredField("theUnsafe");
			field.setAccessible(true);
			return (Unsafe) field.get(null);
		} catch (Exception e)
		{
			throw new RuntimeException(e);
		}
	}

	@LispMethod
	synchronized public static void start_from_prolog() throws InterruptedException
	{
		//Thread t = Main.mainUnjoined(new String[]{"--load","cyc"});
		//t.run();

		if(true) {
			lisp_from_prolog();
			return;
		}

		//t.start();
		Main.needIOConsole = false;
		Main.passedArgs = new String[]{"--load","cyc"};
		bsh_desktop();
	}


	@LispMethod
	synchronized public static void start_from_prolog_ikvm() throws InterruptedException
	{
		//Thread t = Main.mainUnjoined(new String[]{"--load","cyc"});
		//t.run();

		if(true) {
			lisp_from_prolog();
			return;
		}

		//t.start();
		Main.needIOConsole = false;
		Main.passedArgs = new String[]{"--load","cyc"};
		bsh_desktop();
	}

	@LispMethod
	synchronized public static void lisp_from_prolog() throws InterruptedException
	{
		Main.needIOConsole = false;
		Main.passedArgs = new String[]{"--load","cyc"};
		Thread t = Main.mainUnjoined(new String[]{"--load","cyc"});
		//t.run();
		t.start();
		//bsh_desktop();
	}

	@LispMethod
	synchronized public static void bsh_desktop()
	{
		try
		{
			if (calledStartDmiles)
				return;
			// calledStartDmiles = true;

			ensureBSH().eval("startDmiles()");

			// BeanShellCntrl.setSingleton(interpreter);
			// interpreter.setShowResults(true);
			// BeanShellCntrl.describeStreams();
			// new Thread(interpreter).start();
			// interpreter.get(name)
			Utility.invokeLater(new Runnable(){
				@Override
				public void run()
				{
					try
					{
						ensureBSH().eval("sdesktop()");
					} catch (EvalError e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
		} catch (Throwable e)
		{
			// TODO Auto-generated catch block
			calledStartDmiles = false;
			MsgBox.error(e);
		}
	}

	public static bsh.Interpreter ensureBSH()
	{
		if (interpreter == null)
			interpreter = new bsh.Interpreter();
		return interpreter;
	}

	/**
	 * @author Administrator
	 *
	 */
	@Retention(RetentionPolicy.RUNTIME)
	static public @interface LispMethod
	{

	}

	@LispMethod
	public static Object bsh_eval(Object form) throws EvalError
	{
		if (form instanceof String)
			return ensureBSH().eval((String) form);
		if (form instanceof File)
		{
			try
			{
				return ensureBSH().source(((File) form).getPath());
			} catch (FileNotFoundException e)
			{
				throw JVMImpl.doThrow(e);
			} catch (IOException e)
			{
				throw JVMImpl.doThrow(e);
			}
		}
		return ensureBSH().eval(String.valueOf(form));
	}

	@LispMethod
	public static void ui_inspector()
	{
		try
		{
			if (calledStartAppdatper)
			{
				DemoBrowser.show();
				return;
			}
			calledStartAppdatper = true;
			if (true)
			{
				BeanBowlGUI.startBeanBowl(bowl);
			}

			// TODO

			try
			{
				DemoBrowser.testLoggingSetup();
				DemoBrowser.setLoggerTo(Level.ALL);
			} catch (Throwable e1)
			{
				// e1.printStackTrace();
				// TODO Auto-generated catch block
				// MsgBox.error(e1);

			}

			DemoBrowser.defaultExampleCode = true;
			DemoBrowser.ensureRunning(true, new String[0]);
			DemoBrowser.show();
			JFrame appFrame = Utility.getAppFrame();
			appFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			// some more test code
			DemoBrowser.addMoreExamples();

			dbrowser = DemoBrowser.mainControl;
			// TODO
			bowl.addListener((BeansContextListener) dbrowser);

		} catch (Throwable e)
		{
			e.printStackTrace();
			// TODO Auto-generated catch block
			// MsgBox.error(e);

		}

	}

	public static void addSingleton(Object self)
	{
		if (self == null)
		{
			Errors.warn("null singleton");
			return;
		}
		Class isc = self.getClass();
		setSingleton(isc, self);
	}

	static class CreationInfo
	{

		public CreationInfo(Object self) {
			value = self;
			made = createStackTraceSTring(new Throwable("Made " + self.getClass()));
		}

		public Object resolve()
		{
			return value;
		}

		@Override
		public String toString()
		{
			return made.toString();
		}

		String made;
		Object value;
	}

	public static <T> T getSingleton(Class<T> isc)
	{
		synchronized (singletons)
		{
			String named = Lisp.getDotName(isc);
			CreationInfo was = singletons.get(named);
			if (was == null)
				return null;
			return (T) was.value;
		}
	}

	public static void setSingleton(Class isc, Object self)
	{
		synchronized (singletons)
		{
			if (isc == null)
				isc = self.getClass();
			String named = Lisp.getDotName(isc);
			CreationInfo was = singletons.get(named);
			CreationInfo wasnt = new CreationInfo(self);
			if (was != null)
			{
				if (was.value != self)
				{
					String message = "Difference from " + was + " and " + wasnt + " isntance " + self;
					MsgBox.error(message);
					if (false)
						throw new StartupError(message);
					named = null;
				}
				// throw new StartupError("REregistering from " + isc + "
				// isntance " + self);
			}
			singletons.put(named, wasnt);

			addObject(named, self);

		}
	}

	public static void describeStreams()
	{
		if (true)
			return;
		final StringBuilder string = new StringBuilder();
		OutputStream outputStream = new OutputStream()
		{

			@Override
			public void write(int b) throws IOException
			{
				string.append((char) b);
			}

			// Netbeans IDE automatically overrides this toString()
			public String toString()
			{
				return string.toString();
			}
		};
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(outputStream));
		describeObject("System.in", System.in, pw);
		describeObject("System.out", System.out, pw);
		describeObject("System.err", System.err, pw);
		String v = string.toString();
		MsgBox.info(v);

	}

	/**
	 * @param self
	 */
	static public String createStackTraceSTring(Throwable t)
	{
		final StringBuilder string = new StringBuilder();
		OutputStream outputStream = new OutputStream()
		{

			@Override
			public void write(int b) throws IOException
			{
				string.append((char) b);
			}

			// Netbeans IDE automatically overrides this toString()
			public String toString()
			{
				return string.toString();
			}
		};
		t.printStackTrace(new PrintStream(outputStream));
		return string.toString();
	}

	private static void describeObject(String name, Object in, PrintWriter pw)
	{

		if (in == null)
		{
			pw.println("" + name + " is NULL!");
			return;
		}
		pw.print("" + name + " is: ");
		pw.println(pw.getClass() + " sihc=" + System.identityHashCode(in));
	}

	public static class MsgBox
	{
		public static void info(String message)
		{
			info(message, theNameOfTheMethodThatCalledMe());
		}

		public static void error(Throwable e)
		{
			e.printStackTrace();
			error(createStackTraceSTring(e));
		}

		public static void info(String message, String caller)
		{
			show(message, caller, JOptionPane.INFORMATION_MESSAGE);
		}

		static void error(String message)
		{
			error(message, theNameOfTheMethodThatCalledMe());
		}

		public static void error(String message, String caller)
		{
			show(message, caller, JOptionPane.ERROR_MESSAGE);
		}

		public static void show(String message, String title, int iconId)
		{
			setClipboard(title + ":" + NEW_LINE + message);
			JOptionPane.showMessageDialog(null, message, title, iconId);
		}

		private static final String NEW_LINE = System.getProperty("line.separator");

		public static String theNameOfTheMethodThatCalledMe()
		{
			StackTraceElement[] ste = Thread.currentThread().getStackTrace();
			return ste[3].getMethodName();
		}

		public static void setClipboard(String message)
		{
			try
			{
				CLIPBOARD.setContents(new StringSelection(message), null);
			} catch (Throwable unk)
			{
				// unk.printStackTrace();
			}
			// nb: we don't respond to the "your content was splattered"
			// event, so it's OK to pass a null owner.
		}

		private static final Toolkit AWT_TOOLKIT = Toolkit.getDefaultToolkit();
		private static final Clipboard CLIPBOARD = AWT_TOOLKIT.getSystemClipboard();

	}

	public static String addObject(String named, Object value)
	{
		bowl.addBean(named, value);
		return bowl.getWrapper(value).getName();
	}

	public static String addObject(String named, Object value, boolean showNow)
	{
		bowl.addBean(named, value);
		if (showNow)
			DemoBrowser.showObject(value);
		return bowl.getWrapper(value).getName();
	}

	public static BeanBowl getBowl()
	{
		return bowl;
	}

	public static void showObject(Object o)
	{
		DemoBrowser.showObject(o);

	}

	static Editor editor = null;
	private static boolean inited_subl;
	private static boolean inited_cyc;
	private static boolean inited_kb;
	private static boolean inited_server;

	@LispMethod
	public static LispObject j_desktop()
	{
		if (editor == null)
			editor = Editor.currentEditor();

		if (true) return  org.armedbear.lisp.JavaObject.getInstance(editor);

		if (editor == null)
			Editor.startJ(new String[0], false);
		if (editor == null)
			editor = Editor.currentEditor();
		if (editor == null)
			Errors.unimplementedMethod("BeanShellCntrl.j_desktop");
		addSingleton(editor);
		return org.armedbear.lisp.JavaObject.getInstance(editor);
	}

	static public class MethodFunction extends org.armedbear.lisp.Primitive
	{

		@Override
		public boolean isFunction()
		{
			return super.isFunction();//evalArgs;
		}

		@Override
		public boolean isSpecial()
		{
			if (evalArgs)
			{
				bp();
			}
			return super.isSpecial();// !evalArgs;
		}

		MethodFunction(SubLSymbol sym) {
			super((Symbol) sym, "&rest any");

		}

		Method[] methodByArity;
		Set<Method> staticMethods;
		boolean evalArgs;

		int methodCount;

		synchronized public void addMethod(Method m)
		{
			methodCount++;
			Class[] pt = m.getParameterTypes();
			int paramLen = pt.length;
			if (paramLen == 2 && pt[1] == Environment.class)
			{
				evalArgs = false;
			}
			if (methodByArity == null)
			{
				methodByArity = new Method[10];
				methodByArity[paramLen] = m;
				methodCount++;
				return;
			}
			Method was = methodByArity[paramLen];
			if (was == m)
				return;
			if (was == null)
			{
				methodByArity[paramLen] = m;
				methodCount++;
				return;
			}
			if (staticMethods == null)
				staticMethods = new HashSet<Method>();
			if (was == useSet)
			{
				staticMethods.add(m);
				methodCount++;
				return;
			}
			methodByArity[paramLen] = useSet;
			methodCount++;

			staticMethods.add(m);
			staticMethods.add(was);

		}

		@Override
		public LispObject execute(LispObject args, Environment env)
		{
			if (methodByArity != null)
			{
				Method m = methodByArity[2];
				if (m != null)
				{
					Class[] parameterTypes = m.getParameterTypes();
					Class class1 = parameterTypes[1];
					if (class1 == Environment.class || class1 == SubLEnvironment.class)
					{
						final Object result = invokeM(m, null, args, env);
						return JavaObject.getInstance(result, true, m.getReturnType());
					}
				}
			}
			if (args == NIL)
			{
				return executeEVA(env, EMPTY_LISP_OBJECT);
			}
			return executeEVA(env, args.copyToArray());
		}

		@Override
		public LispObject arrayify(LispObject... args)
		{
			return executeEVA(null, args);
		}

		@Override
		public LispObject execute(LispObject[] args)
		{
			return executeEVA(null, args);
		}

		public LispObject executeEVA(Environment env, LispObject[] args)
		{
			int paramLen = args.length;

			if (methodByArity == null)
				executeEML(env, paramLen, true, args);
			Method m = methodByArity[paramLen];
			if (m == useSet)
			{
				return executeEML(env, paramLen, true, args);
			}
			if (m == null)
			{
				return executeEML(env, paramLen, false, args);
			}
			return invokeArgs(m, env, args);
		}

		private LispObject invokeArgs(Method m, Environment env, LispObject[] args)
		{
			Class[] argTypes = m.getParameterTypes();
			int argTypesLen = argTypes.length;
			int usedLen = args.length;
			if (argTypesLen == 2 && argTypes[1] == Environment.class && usedLen == 1)
			{
				assert env != null;
				return (LispObject) invokeM(m, null, args[0], env);
			}
			if (argTypesLen == 2 && argTypes[1] == SubLEnvironment.class && usedLen == 1)
			{
				assert env != null;
				return (LispObject) invokeM(m, null, args[0], env);
			}
			Object[] methodArgs = new Object[argTypesLen];
			for (int i = 0; i < usedLen; i++)
			{
				LispObject arg = args[i];

				if (evalArgs)
				{
					LispObject sarg = Lisp.eval(arg, env);
					arg = (LispObject) sarg;
				}

				if (false && arg.equals(NIL))
				{
					methodArgs[i] = false;
				} else if (false && arg.equals(T))
				{
					methodArgs[i] = true;
				} else
				{
					methodArgs[i] = arg.javaInstance(argTypes[i]);
				}
			}
			m.setAccessible(true);
			Object result = invokeM(m, null, methodArgs);
			if (LispObject.class.isAssignableFrom(m.getReturnType()))
				return (LispObject) result;
			if (result instanceof Boolean)
				return (LispObject) SubLObjectFactory.makeBoolean((Boolean) result);
			return JavaObject.getInstance(result, true, m.getReturnType());
		}

		private LispObject executeEML(Environment env, int paramLen, boolean tryPTLArityFirst, LispObject[] args)
		{
			if (staticMethods == null)
				return error(new LispError("no methods")); // return error(new
			// WrongNumberOfArgumentsException(this,
			// args.length));
			Method m = null;
			if (staticMethods.size() > 0)
			{
				Method[] methodsArray = staticMethods.toArray(new Method[staticMethods.size()]);
				m = findMethod(methodsArray, args);
			}
			if (m == null)
				error(new LispError("no such method"));

			return invokeArgs(m, env, args);
		}

		public void setEvalArgsFirst(boolean evalArgsFirst)
		{
			evalArgs = evalArgsFirst;
		}
	}

	static public class SpecialMethod extends SpecialOperator
	{

		@Override
		public boolean isSpecialRestOnly()
		{
			return super.isSpecialRestOnly();
		}

		@Override
		public boolean isFunction()
		{
			return super.isFunction();//evalArgs;
		}

		@Override
		public boolean isSpecial()
		{
			if (evalArgs)
			{
				bp();
			}
			return super.isSpecial();// !evalArgs;
		}

		SpecialMethod(SubLSymbol sym) {
			super((Symbol) sym, "&rest any");

		}

		Method[] methodByArity;
		Set<Method> staticMethods;
		boolean evalArgs;

		int methodCount;

		synchronized public void addMethod(Method m)
		{
			methodCount++;
			Class[] pt = m.getParameterTypes();
			int paramLen = pt.length;
			if (paramLen == 2 && pt[1] == Environment.class)
			{
				evalArgs = false;
			}
			if (methodByArity == null)
			{
				methodByArity = new Method[10];
				methodByArity[paramLen] = m;
				methodCount++;
				return;
			}
			Method was = methodByArity[paramLen];
			if (was == m)
				return;
			if (was == null)
			{
				methodByArity[paramLen] = m;
				methodCount++;
				return;
			}
			if (staticMethods == null)
				staticMethods = new HashSet<Method>();
			if (was == useSet)
			{
				staticMethods.add(m);
				methodCount++;
				return;
			}
			methodByArity[paramLen] = useSet;
			methodCount++;

			staticMethods.add(m);
			staticMethods.add(was);

		}

		@Override
		public LispObject execute(LispObject args, Environment env)
		{
			if (methodByArity != null)
			{
				Method m = methodByArity[2];
				if (m != null)
				{
					Class[] parameterTypes = m.getParameterTypes();
					Class class1 = parameterTypes[1];
					if (class1 == Environment.class || class1 == SubLEnvironment.class)
					{
						final Object result = invokeM(m, null, args, env);
						return JavaObject.getInstance(result, true, m.getReturnType());
					}
				}
			}
			if (args == NIL)
			{
				return executeEVA(env, EMPTY_LISP_OBJECT);
			}
			return executeEVA(env, args.copyToArray());
		}

		@Override
		public LispObject arrayify(LispObject... args)
		{
			return executeEVA(null, args);
		}

		@Override
		public LispObject execute(LispObject[] args)
		{
			return executeEVA(null, args);
		}

		public LispObject executeEVA(Environment env, LispObject[] args)
		{
			int paramLen = args.length;

			if (methodByArity == null)
				executeEML(env, paramLen, true, args);
			Method m = methodByArity[paramLen];
			if (m == useSet)
			{
				return executeEML(env, paramLen, true, args);
			}
			if (m == null)
			{
				return executeEML(env, paramLen, false, args);
			}
			return invokeArgs(m, env, args);
		}

		private LispObject invokeArgs(Method m, Environment env, LispObject[] args)
		{
			Class[] argTypes = m.getParameterTypes();
			int argTypesLen = argTypes.length;
			int usedLen = args.length;
			if (argTypesLen == 2 && argTypes[1] == Environment.class && usedLen == 1)
			{
				assert env != null;
				return (LispObject) invokeM(m, null, args[0], env);
			}
			if (argTypesLen == 2 && argTypes[1] == SubLEnvironment.class && usedLen == 1)
			{
				assert env != null;
				return (LispObject) invokeM(m, null, args[0], env);
			}
			Object[] methodArgs = new Object[argTypesLen];
			for (int i = 0; i < usedLen; i++)
			{
				LispObject arg = args[i];

				if (evalArgs)
				{
					LispObject sarg = Lisp.eval(arg, env);
					arg = (LispObject) sarg;
				}

				if (false && arg.equals(NIL))
				{
					methodArgs[i] = false;
				} else if (false && arg.equals(T))
				{
					methodArgs[i] = true;
				} else
				{
					methodArgs[i] = arg.javaInstance(argTypes[i]);
				}
			}
			m.setAccessible(true);
			Object result = invokeM(m, null, methodArgs);
			if (LispObject.class.isAssignableFrom(m.getReturnType()))
				return (LispObject) result;
			if (result instanceof Boolean)
				return (LispObject) SubLObjectFactory.makeBoolean((Boolean) result);
			return JavaObject.getInstance(result, true, m.getReturnType());
		}

		private LispObject executeEML(Environment env, int paramLen, boolean tryPTLArityFirst, LispObject[] args)
		{
			if (staticMethods == null)
				return error(new LispError("no methods")); // return error(new
			// WrongNumberOfArgumentsException(this,
			// args.length));
			Method m = null;
			if (staticMethods.size() > 0)
			{
				Method[] methodsArray = staticMethods.toArray(new Method[staticMethods.size()]);
				m = findMethod(methodsArray, args);
			}
			if (m == null)
				error(new LispError("no such method"));

			return invokeArgs(m, env, args);
		}

		public void setEvalArgsFirst(boolean evalArgsFirst)
		{
			evalArgs = evalArgsFirst;
		}

	}

	public static Object invokeM(Method m, Object object, Object... methodArgs)
	{
		try
		{
			return m.invoke(object, methodArgs);
		} catch (SecurityException e)
		{
			return Lisp.error(new LispError("inaccessible method " + m));
		} catch (IllegalAccessException e)
		{
			return Lisp.error(new LispError("illegal access" + m));
		} catch (IllegalArgumentException e)
		{
			return Lisp.error(new LispError("illegal argument " + m));
		} catch (ControlTransfer t)
		{
			throw t;
		} catch (Throwable t)
		{ // no code -> no ControlTransfer
			t.printStackTrace();
			return Lisp.error(new LispError(t.getMessage()));
		}
	}

	public static Method findMethod(Method[] staticMethods, Object[] javaArgs)
	{
		int argCount = javaArgs.length;
		Method result = null;
		for (int i = staticMethods.length; i-- > 0;)
		{
			Method method = staticMethods[i];
			if (method.getParameterTypes().length != argCount)
			{
				continue;
			}
			Class<?>[] methodTypes = (Class<?>[]) method.getParameterTypes();
			if (!Java.isApplicableMethod(methodTypes, javaArgs))
			{
				continue;
			}
			if (result == null || Java.isMoreSpecialized(methodTypes, result.getParameterTypes()))
			{
				result = method;
			}
		}
		return result;
	}

	public LispObject[] toArray(LispObject args)
	{
		if (args == Nil.NIL)
			return EMPTY_LISP_OBJECT;
		if (!(args instanceof Cons))
			return new LispObject[] { args };
		return args.copyToArray();
	}

	static public class PrimitiveEverywhere extends org.armedbear.lisp.Primitive
	{

		public PrimitiveEverywhere(String string) {
			super(string, Lisp.PACKAGE_CYC, true);
			exportInCyc(this);
		}

	}

	public static void cycSeesCL()
	{
		PACKAGE_CYC.unusePackage(PACKAGE_SUBLISP);
		PACKAGE_CYC.usePackage(PACKAGE_JAVA, true);
		PACKAGE_CYC.usePackage(PACKAGE_EXT, true);
		PACKAGE_CYC.usePackage(PACKAGE_CL, true);
		PACKAGE_CYC.usePackage(PACKAGE_CL_USER, true);
		PACKAGE_CYC.usePackage(PACKAGE_SUBLISP, true);
	}

	public static void clSeesCyc()
	{
		// SubLPackage.setCurrentPackage(Lisp.PACKAGE_CL_USER);
		PACKAGE_CL_USER.usePackage(PACKAGE_CYC, true);
		PACKAGE_CL_USER.unusePackage(PACKAGE_CL);
		PACKAGE_CL_USER.unusePackage(PACKAGE_EXT);
		PACKAGE_CL_USER.unusePackage(PACKAGE_JAVA);
		PACKAGE_CL_USER.usePackage(PACKAGE_SUBLISP, true);
		PACKAGE_CL_USER.usePackage(PACKAGE_EXT, true);
		PACKAGE_CL_USER.usePackage(PACKAGE_JAVA, true);
		PACKAGE_CL_USER.usePackage(PACKAGE_CL, true);
		PACKAGE_CL_USER.addNickname("USER");
		// PACKAGE_SUBLISP.usePackage(PACKAGE_CL, true);
		// if(true) return ;
	}

	/**
	 *
	 */
	synchronized static public SubLReader ensureMainReader()
	{
		SubLReader SLR = SubLMain.getMainReader();
		if (SLR == null)
		{
			SLR = new SubLReader();
			SubLMain.setMainReader(SLR);
		}
		return SLR;
	}

	@LispMethod
	synchronized static public LispObject init_subl()
	{
		if(inited_subl) return T;
		inited_subl = true;
		boolean b = SubLMain.isInitialized();
		if (b)
		{
			return T;
		}
		boolean wasSubLisp = Main.isSubLisp();
		SubLMain me = SubLMain.me;
		SubLPackage prevPackage = SubLPackage.getCurrentPackage();
		SubLPackage.initPackages();
		Main.setSubLisp(true);
		try
		{
			SubLMain.shouldRunInBackground = true;
			SubLMain.initializeSubL(new String[0]);
			SubLPackage.setCurrentPackage("SUBLISP");
			ensureMainReader();
			if (!SubLMain.noInitCyc)
				SubLMain.initializeTranslatedSystems();
		} finally
		{
			SubLPackage.setCurrentPackage(prevPackage);
			Main.setSubLisp(wasSubLisp);
		}
		return T;
	}

	@LispMethod
	public synchronized static void init_cyc()
	{
		if (inited_cyc)
			return;
		inited_cyc = true;

		boolean wasSubLisp = Main.isSubLisp();
		Main.setSubLisp(true);
		try
		{
			SubLPackage prevPackage = SubLPackage.getCurrentPackage();
			try
			{
				init_subl();
				Lisp.PACKAGE_SYS.ALLOW_INHERIT_CONFLICTS = true;
				Lisp.PACKAGE_EXT.ALLOW_INHERIT_CONFLICTS = true;
				Lisp.PACKAGE_CL.ALLOW_INHERIT_CONFLICTS = true;
				Lisp.PACKAGE_CL_USER.ALLOW_INHERIT_CONFLICTS = true;
				SubLPackage.setCurrentPackage(Lisp.PACKAGE_SUBLISP);
				ensureMainReader();
				SubLMain.initializeTranslatedSystems();
				SubLMain.handleInits();
				inited_cyc = true;
			} catch (Throwable e)
			{
				throw JVMImpl.doThrow(e);
			} finally
			{

				SubLPackage.setCurrentPackage(prevPackage);
			}
		} finally
		{
			Main.setSubLisp(wasSubLisp);
		}

	}

	@LispMethod
	public synchronized static void init_kb()
	{
		if(inited_kb) return;
		inited_kb = true;

		boolean wasSubLisp = Main.isSubLisp();
		Main.setSubLisp(true);
		try
		{
			SubLPackage prevPackage = SubLPackage.getCurrentPackage();
			try
			{
				init_cyc();
				SubLPackage.setCurrentPackage("CYC");
				Eval.eval("(sl:load \"init/jrtl-release-init.lisp\")");
			} catch (Throwable e)
			{
				throw JVMImpl.doThrow(e);
			} finally
			{
				SubLPackage.setCurrentPackage(prevPackage);
			}
		} finally
		{
			Main.setSubLisp(wasSubLisp);
		}
	}

	@LispMethod
	public synchronized static void init_server()
	{
		if (inited_server)
			return;
		if(inited_server) return;

		boolean wasSubLisp = Main.isSubLisp();
		Main.setSubLisp(true);
		try
		{
			SubLPackage prevPackage = SubLPackage.getCurrentPackage();
			try
			{
				init_cyc();
				SubLPackage.setCurrentPackage("CYC");
				Eval.eval("(sl:load \"init/services-init.lisp\")");
				inited_server = true;
			} catch (Throwable e)
			{
				throw JVMImpl.doThrow(e);
			} finally
			{
				SubLPackage.setCurrentPackage(prevPackage);
			}
		} finally
		{
			Main.setSubLisp(wasSubLisp);
		}
	}

	@LispMethod
	static public SubLObject cyc_eval(SubLCons specialForm, SubLEnvironment env)
	{
		SubLListListIterator iter = null;
		Resourcer resourcer = Resourcer.getInstance();
		try
		{
			iter = resourcer.acquireSubLListListIterator(specialForm, 1);
			return SubLSpecialOperatorDeclarations.list_progn(iter, env);
		} finally
		{
			resourcer.releaseSubLListListIterator(iter);
		}

	}

	@LispMethod
	static public LispObject lisp_eval(LispObject args, Environment env)
	{
		if (args instanceof Cons)
		{
			if (args.cdr() instanceof Nil)
			{
				LispObject arg = args.car();
				if (arg instanceof SubLString)
				{
					return lisp_eval(arg.getStringValue());
				}
			}
		}
		LispThread thread = LispThread.currentThread();
		return Lisp.progn(args, env, thread);
	}

	@LispMethod
	static public LispObject lisp_eval(String statements)
	{
		return org.armedbear.lisp.Interpreter.evaluate(statements);
	}

	@LispMethod
	static public LispObject cyc_repl()
	{
		boolean wasSubLisp = Main.isSubLisp();
		init_subl();
		SubLReader SLR = SubLMain.getMainReader();
		boolean wasQuitOnExit = SLR.quitOnExit;
		boolean was_shouldReadloopExit = SLR.shouldReadloopExit;
		SLR.quitOnExit = false;
		SLR.shouldReadloopExit = false;
		try
		{
			if (false && SubLMain.shouldRunReadloopInGUI())
				SubLMain.setMainReader(SubLReaderPanel.startReadloopWindow());
			SLR.setThread(SubLProcess.currentSubLThread());
			while (!SLR.shouldReadloopExit())
			{
				Main.setSubLisp(true);
				SLR.doReadLoop();
			}
		} finally
		{
			SLR.quitOnExit = wasQuitOnExit;
			SLR.shouldReadloopExit = was_shouldReadloopExit;
			Main.setSubLisp(wasSubLisp);
		}
		return Lisp.T;
	}

	@LispMethod
	static public LispObject lisp_repl()
	{
		boolean wasSubLisp = Main.isSubLisp();
		Main.setSubLisp(false);
		if (wasSubLisp)
		{
			clSeesCyc();
			cycSeesCL();
		}
		try
		{
			return Lisp.PACKAGE_TPL.findAccessibleSymbol("TOP-LEVEL-LOOP").execute();
		} finally
		{
			Main.setSubLisp(wasSubLisp);
		}
	}

	static public void exportInCyc(Operator cyc_eval2)
	{
		exportInCyc(cyc_eval2.getLambdaName().toSymbol().toLispObject());
	}

	static public void exportInCyc(Symbol symbol)
	{
		Lisp.PACKAGE_SUBLISP.importSymbol(symbol);
		Lisp.PACKAGE_CYC.importSymbol(symbol);
		Lisp.PACKAGE_CYC.export(symbol);
		Lisp.PACKAGE_EXT.importSymbol(symbol);
		Lisp.PACKAGE_CL_USER.importSymbol(symbol);
	}

	static boolean isIKVM() {
		return (System.getProperty("java.vm.name").toUpperCase().contains("IKVM"));
	}

	@LispMethod
	static void swipl_init()
	{
		if(disableProlog) return;
		JPL.init();
		if(isIKVM()) {
		Query.oneSolution("assert(swicli:is_ikvm)");
		}
	}

	static boolean swipl_inited_server = false;

	@LispMethod
	synchronized public static void swipl_init_server()
	{
		if(disableProlog)
			return;
		if (swipl_inited_server)
			return;
		try {
		swipl_init();
		Query.oneSolution("use_module(library('prolog_server'))");
		Query.oneSolution("prolog_server(4023, [allow(_)])");
		  swipl_inited_server = true;
		} catch(Throwable t) {
		    MsgBox.error(t);
		}
	}

	@LispMethod
	static public LispObject ui_inspect(LispObject arg)
	{
		BeanShellCntrl.addObject(null, arg);
		return arg;
	}

	@LispMethod
	static public LispObject bsh_exec(LispObject arg) throws EvalError
	{
		if (arg.isString())
			return JavaObject.getInstance(BeanShellCntrl.bsh_eval(arg.getStringValue()), true, null);
		return JavaObject.getInstance(BeanShellCntrl.bsh_eval((String) arg.javaInstance()), true, null);
	}

	public static void scanForExports(Class clz)
	{
		for (java.lang.reflect.Method m : clz.getDeclaredMethods())
		{
			if (Reflect.isStatic(m))
			{
				if (m.isAnnotationPresent(LispMethod.class))
				{
					registerMethod(m);
					continue;
				}
				if (m.getReturnType() == LispObject.class)
				{
					registerMethod(m);
					continue;
				}
			}
		}
		// for (java.lang.reflect.Field m : clz.getDeclaredFields()) {
		// if (Reflect.isStatic(m)) {
		// if (m.isAnnotationPresent(LispMethod.class)) {
		// //registerMethod(m);
		// //continue;
		// }
		//
		// }
		// }

	}

	private static void registerMethod(Method m)
	{

		boolean evalArgsFirst = true;
		String js = m.getName();
		if (js.startsWith("sf_"))
		{
			evalArgsFirst = false;
			js = js.substring(3);
		}
		Symbol sym = findOrCreateSymbol(js);
		if (evalArgsFirst)
		{
			MethodFunction cf = setMethodFunction(sym);
			cf.setEvalArgsFirst(evalArgsFirst);
			cf.addMethod(m);
			return;
		}
		SpecialMethod cf = setSpecialMethod(sym);
		cf.setEvalArgsFirst(evalArgsFirst);
		cf.addMethod(m);
	}

	/**
	 * @param js
	 * @return
	 */
	public static Symbol findOrCreateSymbol(String js)
	{

		Package pkg = null;
		if (js.startsWith("pkg_"))
		{
			js = js.substring(3);

			int i = js.indexOf('_');
			String srch4 = js.substring(0, i);
			pkg = Packages.findPackage(srch4).toPackage().toLispObject();
			js = js.substring(i);
			/*
			 * if (js.startsWith("ext_")) { pkg = Lisp.PACKAGE_EXT; js =
			 * js.substring(4); } else if (js.startsWith("usr_")) { pkg =
			 * Lisp.PACKAGE_CL_USER; js = js.substring(4); }
			 */
		}

		js = js.replace("_", "-");
		js = js.replace("$", "*");
		js = js.replace("**", "$");

		if (js.startsWith("-") && js.endsWith("-"))
		{
			js = "+" + js.substring(1, js.length() - 2) + "+";
		}
		js = js.toUpperCase();
		if (pkg == null)
			pkg = org.armedbear.lisp.Package.getCurrentPackage();
		Symbol sym = ((Package) pkg).internAndExport(js);
		exportInCyc(sym);
		return sym;
	}

	static MethodFunction setMethodFunction(Symbol sym)
	{
		LispObject sf = sym.getSymbolFunctionOrNull();
		if (sf == null)
		{
			sf = new MethodFunction(sym);
			sym.setFunction((SubLOperator) sf);
			sym.setBuiltInFunction(true);
		} else if (sf instanceof MethodFunction)
		{
			return (MethodFunction) sf;
		} else
		{
			Lisp.program_error("Trying to overwrite a non method function");
		}

		return (MethodFunction) sf;
	}

	static SpecialMethod setSpecialMethod(Symbol sym)
	{
		LispObject sf = sym.getSymbolFunctionOrNull();
		if (sf == null)
		{
			sf = new SpecialMethod(sym);
			sym.setFunction((SubLOperator) sf);
			sym.setBuiltInFunction(true);
		} else if (sf instanceof SpecialMethod)
		{
			return (SpecialMethod) sf;
		} else
		{
			Lisp.program_error("Trying to overwrite a non special method");
		}

		return (SpecialMethod) sf;
	}

	static
	{
		scanForExports(BeanShellCntrl.class);
		// swipl_init_server();
	}

}
