package ioTest;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

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
public class Demo {
	
	public static void main(String[] args) throws IOException {
		
		//�����ַ���ӡ������
		PrintWriter pw=new PrintWriter(new FileWriter("ab.txt"),true);
		
		//��ӡ
		pw.printf("awdwd");
	}

}
