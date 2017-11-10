package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 输入一段话
 * 
 * 
 */
public class Test {
	
	public static void main(String[] args) throws IOException {
		
		//创建输入流对象
		FileInputStream f=new FileInputStream("d://test.mp4");
		
		//创建输出流对象
		FileOutputStream f1=new FileOutputStream("d://a//c.mp4");
		
		//进行频繁的duxie
		byte []	by=new byte[1024];
		int len=0;
		while((len=f.read())!=-1){
			
			f1.write(by, 0, len);
		}
		
	}

}
