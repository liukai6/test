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
 * ���Ƶ����ļ���,�ѵ����ļ���d://bĿ¼������d://aĿ¼��
 * 1.���ഴ�����������������
 * 
 * @author liuka
 *
 */
public class Test3 {
	
	public static void main(String[] args) throws IOException {
		
		//���������������
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
		//��д
		
		//�ر�liu
		bos.close();
		brt.close();
	}

}
