package writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 *  需求：把ArrayList集合中的字符串数据存储到文本文件
 * 
 */
public class Test {

	public static void main(String[] args) throws IOException {
		
		//创建arraylist集合
		ArrayList<String> a=new ArrayList<String>();
		
		//向集合中添加元素
		a.add("liukai");
		a.add("mingt");
		a.add("adwd");
		
		//创建字符输出流对象
		BufferedWriter bw=new BufferedWriter(new FileWriter("b.txt"));
		
		//遍历集合
		for (String str : a) {
			
			//将集合中的字符串写到b.txt
			bw.write(str);
			//换行
			bw.newLine();
		}
		//关闭流资源
		bw.close();
	}
}
