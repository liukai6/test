package homework;

import java.util.Scanner;

/*
 * 1、编写程序，递归(阶乘)，并测试
 * 2.方法优化,通过键盘录入改良该方法
 * 
 */
public class Work1 {
	
	public static void main(String[] args) {
		
		//创建键盘录入对象
		Scanner sc=new Scanner(System.in);
		
		//友情tishi
		System.out.println("请输入需要阶乘的数字");
		//利用递归，定义变量
		int n=Integer.valueOf(sc.nextLine());
		//创建阶乘的方法
		if(n>0&&n<30){
			System.out.println(ji(n));
		}else{
			System.out.println("你输入得是不合法!!!!!!!");
		}
	}

	public static int ji(int n) {
		//第一递归的出口
		if(n==1){
			
		return 1;	
		}else{
			
		return n*ji(n-1);
		}
	}

}
