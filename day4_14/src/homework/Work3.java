package homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *编写程序，采用多种方式，把d:\\video01.avi的内容复制到d:\\video02.avi中 
 * 
 * 
 */
public class Work3 {
	
	public static void main(String[] args) throws IOException {
		
		//创建对象
		FileInputStream fis=new FileInputStream("d://test.mp4");
		
		FileOutputStream fos=new FileOutputStream("d://a//test.mp4");
		long b=System.currentTimeMillis();
		int len=0;
		while((len=fis.read())!=-1){
			
			fos.write(len);
		}
		long a=System.currentTimeMillis();
		System.out.println((a-b)/1000+"秒");
		fis.close();
		fos.close();
	}

}
