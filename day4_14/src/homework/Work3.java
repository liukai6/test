package homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *��д���򣬲��ö��ַ�ʽ����d:\\video01.avi�����ݸ��Ƶ�d:\\video02.avi�� 
 * 
 * 
 */
public class Work3 {
	
	public static void main(String[] args) throws IOException {
		
		//��������
		FileInputStream fis=new FileInputStream("d://test.mp4");
		
		FileOutputStream fos=new FileOutputStream("d://a//test.mp4");
		long b=System.currentTimeMillis();
		int len=0;
		while((len=fis.read())!=-1){
			
			fos.write(len);
		}
		long a=System.currentTimeMillis();
		System.out.println((a-b)/1000+"��");
		fis.close();
		fos.close();
	}

}
