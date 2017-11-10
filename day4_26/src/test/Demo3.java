package test;
/**
 * 用for和while循环分别循环出1到100的奇数和偶数的和病求和
 * 
 * @author liuka
 *
 */

public class Demo3 {
	
	public static void main(String[] args) {
		
		//定义一个变量记录奇数和
		int sum1=0;
		int sum2=0;
		//首先用for循环求全体奇数的和
		for(int a=1;a<100;a++){
			if(a%2==1){
				
				sum1+=a;
					
			}
			
		}
		//用while循环求偶数的和
		int b=2;
		while(b<=100){
			
			sum2+=b;
			b+=2;
		}
		//最后求和
		System.out.println("1-100奇数的和为:"+sum1);
		System.out.println("1-100偶数的和为:"+sum2);
		System.out.println("1到100数的和为:"+(sum1+sum2));
		
	}

}
