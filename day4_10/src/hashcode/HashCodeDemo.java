package hashcode;

import java.util.HashSet;

/*
 * 用HashSet存储字符串
 * 
 * 
 * */

public class HashCodeDemo {

	public static void main(String[] args) {
		
		//创建集合对象
		HashSet<String> str = new HashSet<String>();
		
		//调用add方法添加字符串
		str.add("memda");
		str.add("yuadw");
		str.add("dwd");
		
		//通过高级for循环进行遍历集合
		for (String string : str) {
			System.out.println(string);
		}
		
	}
}
