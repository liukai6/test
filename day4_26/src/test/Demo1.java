package test;
/*
 * 要求使用递归来进行阶乘的求解
 * 
 */
public class Demo1 {
	
	public static void main(String[] args) {
		
		//定义一个方法来求阶乘的数值
		int a=5;
		int b=method(a);
		System.out.println(b);
	}

	private static int method(int a) {
		// TODO Auto-generated method stub
		//分析得阶乘就是本数乘以比他小一个数直到一停止
		int b=0;
		if(a==1){
			
		return 1;
			
		}
		b=a*method(a-1);
		a--;
		
		return b;
	}

}
