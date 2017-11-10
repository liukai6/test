package Single;

/*
 * 懒汉式
 * 
 */
public class Test {
	
//	私有化构造方法
	private Test(){
		
	}

//	定义一个变量
	private static Test t;
	
	//定义一个可以获取对象的方法
	public static Test getTest(){
		
		//进行判断当没有对象时创建一个对象
		if(t==null){
			
			t=new Test();
			
		}
		return t;
	}
}
