package writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 *  ���󣺰�ArrayList�����е��ַ������ݴ洢���ı��ļ�
 * 
 */
public class Test {

	public static void main(String[] args) throws IOException {
		
		//����arraylist����
		ArrayList<String> a=new ArrayList<String>();
		
		//�򼯺������Ԫ��
		a.add("liukai");
		a.add("mingt");
		a.add("adwd");
		
		//�����ַ����������
		BufferedWriter bw=new BufferedWriter(new FileWriter("b.txt"));
		
		//��������
		for (String str : a) {
			
			//�������е��ַ���д��b.txt
			bw.write(str);
			//����
			bw.newLine();
		}
		//�ر�����Դ
		bw.close();
	}
}
