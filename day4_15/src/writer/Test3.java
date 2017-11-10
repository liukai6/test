package writer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

/**
 * 复制单级文件夹,把单级文件夹d://b目录拷贝到d://a目录下
 * 1.首相创建输入输出对象将内容
 * 
 * @author liuka
 *
 */
public class Test3 {
	
	public static void main(String[] args) throws IOException {
		
		//创建输入输出对象
//		BufferedReader br=new BufferedReader(new FileReader("d://b"));
//		BufferedWriter bw=new BufferedWriter(new FileWriter("d://a"));
		BufferedInputStream brt=new BufferedInputStream(new FileInputStream("d://b"));
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("d://a"));
		File f=new File("d://b");
		File[] lf = f.listFiles();
		
		for (File file : lf) {
			int ch=0;
			while((ch=file.read())!=-1){
				
				bos.write(ch);
				bos.flush();
			}
		}
		//读写
		
		//关闭liu
		bos.close();
		brt.close();
	}

}
