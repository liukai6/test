package ioTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.util.Properties;

/*
 * ����һ���ı��ļ�����֪�������Ǽ�ֵ����ʽ�ģ����ǲ�֪��������ʲô��
		     ��дһ�������ж��Ƿ��С�lisi�������ļ����ڣ�����о͸ı���ֵΪ"100"

 */
public class Test1 {
	
	public static void main(String[] args) throws IOException{
		
		//��������
		Properties pr=new Properties();
		
		//������ķ������ı��ĵ����������뵽�ڴ���
		pr.load(new FileReader("ab.txt"));
		
		//�����Ƿ����ĳ���ķ���
		boolean con = pr.containsKey("lisi");
		
		if(con){
			
			//�����ĵĶ�Ӧ��ֵ����Ϊ100
			pr.setProperty("lisi", "100");
			
			//�������ٴ��뵽�ı��ĵ���ȥ
			pr.store(new FileWriter("ab.txt"), null);
		
		
	}

	}
}