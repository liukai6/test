package test;
/*
 * 生成1-100的循环,要求循环到88停止
 * 
 */
public class Demo6 {
	
	public static void main(String[] args) {
		
//		分析循环生成数字
		while(true){
			int a=(int)(1+Math.random()*100);
			System.out.println(a);
			switch(a){
			case 88:
				return;
			}
		}
	}

}
