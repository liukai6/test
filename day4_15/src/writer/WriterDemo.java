package writer;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/*д������,�����ַ����
 * 
 */

public class WriterDemo {
	
	public static void main(String[] args) throws IOException {
		
		//�����ַ����������
		OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("a.txt"));
		
		//д������
		osw.write("�߹�����");
		
		//guanbilioi
		osw.close();
	}

}
