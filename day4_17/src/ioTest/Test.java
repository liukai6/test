package ioTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/*IO��(��ӡ���ĸ������ص��Լ���ΪWriter������ʹ��))(����)

	A:��ӡ���ĸ���
		ͨ��API�鿴
		�ֽ�����ӡ��PrintStream
		�ַ���ӡ��PrintWriter
	B:��ӡ�����ص�
		ֻ�ܲ���Ŀ�ĵأ����ܲ�������Դ��
		����������Զ�ˢ�£��ܹ��Զ�ˢ�¡�
		���Բ����������͵����ݡ�
		���Բ����ļ�����(ָ���ǹ��췽������ֱ�ӽ���һ���ļ��ַ�������File����)
	C:������ʾ:	PrintWriter��ΪWriter������ʹ��

 */
public class Test {
	
	public static void main(String[] args) throws IOException {
		
		PrintStream ps=new PrintStream(new FileOutputStream("a.txt"));
		
		//���ô�ӡ�ķ���
		ps.println("abc");
		
		ps.print("��������");
		
		
	}

}
