package Single;
/*
 * 第一种饿汉试
 */
public class Demo {

	
	private  static Demo d=new Demo();
	//私有化构造方法
	private Demo(){}
	
	//提供一个获取构造方法的方法
	
	public static Demo getDemo(){
		
		return d;
	}
	
	
}
