package hashcode;

import java.util.HashSet;

/*
 * ��HashSet�洢�ַ���
 * 
 * 
 * */

public class HashCodeDemo {

	public static void main(String[] args) {
		
		//�������϶���
		HashSet<String> str = new HashSet<String>();
		
		//����add��������ַ���
		str.add("memda");
		str.add("yuadw");
		str.add("dwd");
		
		//ͨ���߼�forѭ�����б�������
		for (String string : str) {
			System.out.println(string);
		}
		
	}
}
