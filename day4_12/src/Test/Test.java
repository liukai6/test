package Test;

import java.util.Scanner;
import java.util.TreeMap;

/*
 * 完成对键盘录入数据的统计
 * 1.键盘录入
 * 2.把录入的字符串转化为char型数组
 * 3.创建TreeMap集合
 * 4.遍历数组如果数组
 * 5.创建StringBuffer来拼接
 * 6.进行判断
 * 
 */

public class Test {
	
	

	public static void main(String[] args) {
		//System.out.println("怎么不行嫩");
		//创建键盘录入对象
		Scanner sc=new Scanner(System.in);
		
		System.out.println("请录入数据");
		//录入键盘数据
		String str= sc.nextLine();
		
		//把录入的str转换为char类型的数组
		char []ch=str.toCharArray();
		
		//创建TreeMap集合
		TreeMap<Character,Integer> tm=new TreeMap<Character,Integer>(); 
		
		//创建StringBuffer对象
		StringBuffer sb=new StringBuffer();
		
		int value=1;
		
		//遍历数组
		for (int i = 0; i < ch.length; i++) {
			if(!tm.containsKey(ch[i])){
				tm.put(ch[i],value );
				
			}else if(tm.containsKey(ch[i])){
				tm.put(ch[i], value+1);
				
			}
			System.out.println(sb.append(ch[i]).append("(").append(value).append(")"));
		}
	}

}
