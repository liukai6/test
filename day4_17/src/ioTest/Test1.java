package ioTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.util.Properties;

/*
 * 我有一个文本文件，我知道数据是键值对形式的，但是不知道内容是什么。
		     请写一个程序判断是否有“lisi”这样的键存在，如果有就改变其值为"100"

 */
public class Test1 {
	
	public static void main(String[] args) throws IOException{
		
		//创建集合
		Properties pr=new Properties();
		
		//用载入的方法吧文本文档的内容载入到内存中
		pr.load(new FileReader("ab.txt"));
		
		//利用是否存在某键的方法
		boolean con = pr.containsKey("lisi");
		
		if(con){
			
			//将李四的对应的值设置为100
			pr.setProperty("lisi", "100");
			
			//将数据再存入到文本文档中去
			pr.store(new FileWriter("ab.txt"), null);
		
		
	}

	}
}