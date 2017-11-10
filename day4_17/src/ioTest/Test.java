package ioTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/*IO流(打印流的概述和特点以及作为Writer的子类使用))(掌握)

	A:打印流的概述
		通过API查看
		字节流打印流PrintStream
		字符打印流PrintWriter
	B:打印流的特点
		只能操作目的地，不能操作数据源。
		如果启动了自动刷新，能够自动刷新。
		可以操作任意类型的数据。
		可以操作文件的流(指的是构造方法可以直接接收一个文件字符串或者File对象)
	C:案例演示:	PrintWriter作为Writer的子类使用

 */
public class Test {
	
	public static void main(String[] args) throws IOException {
		
		PrintStream ps=new PrintStream(new FileOutputStream("a.txt"));
		
		//调用打印的方法
		ps.println("abc");
		
		ps.print("明天会更好");
		
		
	}

}
