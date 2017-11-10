package filedemo;

import java.io.File;
import java.io.IOException;

/**
 * 1.��ϰFile��ĸ��ַ���
 * 
 * public boolean createNewFile():�����ļ� ��������������ļ����Ͳ�������
		public boolean mkdir():�����ļ��� ��������������ļ��У��Ͳ�������
		public boolean mkdirs():�����ļ���,������ļ��в����ڣ�����㴴������
		public boolean renameTo(File dest):���ļ�������Ϊָ�����ļ�·��

 * @author liuka
 *
 */

public class FileDemo {
	
	public static void main(String[] args) throws IOException {
		
		
	
		
		//����File����
		File file=new File("a.txt");
		
		System.out.println(file.delete());
		
		//����File����
		System.out.println(file.createNewFile());
		
		File file1=new File("a");
		
		System.out.println(file1.mkdirs());
		
		File file2=new File("b//a//c//a.doc");
		
		System.out.println(file2.mkdirs());
		
		System.out.println(file2.getName());
		
		File dest=new File("c.txt");
		
		System.out.println(file2.renameTo(dest));
	}

}
