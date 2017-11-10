package writer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/*
 * 
 * 从文本文件中读取数据(每一行为一个字符串数据)到集合中，并遍历集合
 * 1.首先创建一个输入流对象,将数据读取到内存中
 * 2.创建一个arraylist集合
 * 3.将读取的每行数据存储到arraylis集合中
 * 4.遍历集合
 * 我有一个文本文件，每一行是一个学生的名字，请写一个程序，每次允许随机获取一个学生名称
 * 1.首先定一个随机数字0-size-1.
 * 2.随机打印随机数字对应的名字
 * 
 */

public class Test1 {

	public static void main(String[] args) throws IOException {
		
		//创建输入流对象
		BufferedReader br=new BufferedReader(new FileReader("b.txt"));
		
		//创建一个arraylist集合用来存储每行的字符串
		ArrayList<String> a=new ArrayList<String>();
		
		//一次读取一行的数据
		String str=null;
		while((str=br.readLine())!=null){
			
			a.add(str);
		
		}
		//关闭流
		br.close();
		//遍历数组
		for (String string : a) {
			
			System.out.println(string);
			
		}
		System.out.println("=========================");
		//定义获取随机数字的方法
		Random r=new Random();
		int index = r.nextInt(a.size());
		
		System.out.println(a.get(index));
		
		
	}
}
