package test;
/*
 * 要求用while循环打印1-1000能被5整除的数,且每行打印3个
 * 
 */
public class Demo4 {
	
	public static void main(String[] args) {
		
		//定义一个变量
		int a=1;
		while(a<=990){
			
			if(a%5==0){
				for(int b=0;b<=10;b+=5){
					
					System.out.print(a+b+"\t");
				}
				System.out.println();
			}
			a++;
		}
	}

}
