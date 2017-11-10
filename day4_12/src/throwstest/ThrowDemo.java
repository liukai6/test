package throwstest;

/*练习throw的使用
 * 
 * 
 */

public class ThrowDemo {

	public static void main(String[] args) {
		
		int [] a=new int[3];
		
		//Exception e=mew Exception；
		//创建Exception对象
		//Exception e=new Exception("错了,错了就是错了");
		
	try {
			System.out.println(a[7]);
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
			System.out.println("------------------");
			e.printStackTrace();
			System.out.println("--------------");
			e.toString();
			e.printStackTrace();
		}
	
//		调用Exception的方法

	}
}
