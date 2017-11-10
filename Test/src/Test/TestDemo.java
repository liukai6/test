package Test;

import java.util.HashMap;
import java.util.Scanner;

/*1.定义一个测试类
 * 首先要键盘录入注册信息
 * 2.调用tools里的方法将他们存入到HashMap中的集合中去
 * 键盘录入登录的
 * 调用比较的方法
 * 
 * 
 */

public class TestDemo {
	
	public static void main(String[] args) {
		
		//欢迎界面
		System.out.println("===============欢迎来到我的系统中++++++++++++++++++++");
		System.out.println("请输入数字选择:");
		System.out.println("1.注册");
		System.out.println("2.登录");
		System.out.println("3.退出系统");
		
		HashMap<String, String> hm=new HashMap();
		//创建键盘录入对象
		Scanner sc=new Scanner(System.in);
		while(true){
		//友情提示
		System.out.println("请输入有效数字");
		
		//键盘录入对象
		String a=sc.nextLine();
		switch(a){
		
			case "1" :
		
			//友情提示
			System.out.println("请输入注册用户名");
			
			
			
			//键盘录入用户名
			String userName=sc.nextLine();
			
			//友情提示
			System.out.println("请输入注册密码");
			
			//键盘录入用户名
			String passWord=sc.nextLine();
			
			//调用Tools里的方法进行存入到集合中的动作
			hm.put(userName,passWord);
			
			case "2"  :
				//友情提示
				System.out.println("请输入登录用户名");
				
				
				
				//键盘录入用户名
				 userName=sc.nextLine();
				
				//友情提示
				System.out.println("请输入登录密码");
				
				//键盘录入用户名
				 passWord=sc.nextLine();
				 
				 boolean falg = false;
					if(hm.containsKey(userName)){
						
						 falg=hm.get(userName).equals(passWord); 
					}
					System.out.println(falg);
					
			case "3" :
				
				System.exit(0);
				
				
		
		
		
		
		
		
		
		
		
		}
		
		}
	}

}
