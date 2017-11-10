package homework;

import java.util.Scanner;

/*
 * 
 * 
 * 2、编写程序，斐波那契数列，并测试
需求：一列数的规则如下: 1、1、2、3、5、8、13、21、34...... 
  求第30位数是多少， 用递归算法实现
  分析斐波那契数列的特点
  从第三位开始本位就是前两位的和
优化加入键盘录入值
 */

public class Work2 {
	
	public static void main(String[] args) {
		
		//创建键盘录入对象
		Scanner sc=new Scanner(System.in);
		
		//友情提示
		System.out.println("请输入数字");
		//创建一个变量表示位数
		double d=Integer.valueOf(sc.nextLine());
		double n=System.currentTimeMillis();
		//把值传入发到方法里
		System.out.println(ji(d));
		double b=System.currentTimeMillis();
		System.out.println(b-n);
	}

	public static int ji(double d) {
		
		//加入判断给递归寻找出口
		if(d==1||d==2){
			
			return 1;
		}else {
			
			return ji(d-1)+ji(d-2);
		}
		
		
	}

}
