package itbool;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 使用高级for循环
 * 1.定义一个arraylist集合，
 * 2.向集合中添加字符串对象
 * 3.利用高级for循环进行遍历
 * */

public class Demo {

	public static void main(String[] args) {
		
		//创建键盘录入对象
		Scanner sc=new Scanner(System.in);
		
		//友情提示
		System.out.println("请输入数字");
		
		sc.nextLine();
		ArrayList<String> arr=new ArrayList<String>();
		
		arr.add("lihua");
		arr.add("liming");
		arr.add("limgin");
		
		//用增强for循环进行遍历集合ArrayList
		for (String string : arr) {
			System.out.println(string);
		}
	}
}
