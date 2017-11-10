package writer;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/*写入数据,利用字符输出
 * 
 */

public class WriterDemo {
	
	public static void main(String[] args) throws IOException {
		
		//创建字符输出流对象
		OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("a.txt"));
		
		//写入数据
		osw.write("哼哈二将");
		
		//guanbilioi
		osw.close();
	}

}
