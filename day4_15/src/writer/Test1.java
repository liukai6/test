package writer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/*
 * 
 * ���ı��ļ��ж�ȡ����(ÿһ��Ϊһ���ַ�������)�������У�����������
 * 1.���ȴ���һ������������,�����ݶ�ȡ���ڴ���
 * 2.����һ��arraylist����
 * 3.����ȡ��ÿ�����ݴ洢��arraylis������
 * 4.��������
 * ����һ���ı��ļ���ÿһ����һ��ѧ�������֣���дһ������ÿ�����������ȡһ��ѧ������
 * 1.���ȶ�һ���������0-size-1.
 * 2.�����ӡ������ֶ�Ӧ������
 * 
 */

public class Test1 {

	public static void main(String[] args) throws IOException {
		
		//��������������
		BufferedReader br=new BufferedReader(new FileReader("b.txt"));
		
		//����һ��arraylist���������洢ÿ�е��ַ���
		ArrayList<String> a=new ArrayList<String>();
		
		//һ�ζ�ȡһ�е�����
		String str=null;
		while((str=br.readLine())!=null){
			
			a.add(str);
		
		}
		//�ر���
		br.close();
		//��������
		for (String string : a) {
			
			System.out.println(string);
			
		}
		System.out.println("=========================");
		//�����ȡ������ֵķ���
		Random r=new Random();
		int index = r.nextInt(a.size());
		
		System.out.println(a.get(index));
		
		
	}
}
