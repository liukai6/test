package Single;

import java.io.IOException;

import org.omg.CORBA.Context;
import org.omg.CORBA.ContextList;
import org.omg.CORBA.DomainManager;
import org.omg.CORBA.ExceptionList;
import org.omg.CORBA.NVList;
import org.omg.CORBA.NamedValue;
import org.omg.CORBA.Object;
import org.omg.CORBA.Policy;
import org.omg.CORBA.Request;
import org.omg.CORBA.SetOverrideType;
import org.omg.SendingContext.RunTime;

/*测试定义的单例设计模型
 * 
 * 
 */
public class DemoTest {

	public static void main(String[] args) {
		
//		创建Demo对象
		Demo d1=Demo.getDemo();
		Demo d2=Demo.getDemo();
		
		System.out.println(d1.equals(d2));
		System.out.println(d1==d2);
		
		System.out.println("-----------------");
		
		Test t1=Test.getTest();
		Test t2=Test.getTest();
		
		System.out.println(t1.equals(t2));
		System.out.println(t1==t2);
		
		//创建runTime对象
		Runtime r= Runtime.getRuntime();
		
		try {
			r.exec("calc");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	}
}
