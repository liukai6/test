package Test;

import java.util.Scanner;
import java.util.TreeMap;

/*
 * ��ɶԼ���¼�����ݵ�ͳ��
 * 1.����¼��
 * 2.��¼����ַ���ת��Ϊchar������
 * 3.����TreeMap����
 * 4.���������������
 * 5.����StringBuffer��ƴ��
 * 6.�����ж�
 * 
 */

public class Test {
	
	

	public static void main(String[] args) {
		//System.out.println("��ô������");
		//��������¼�����
		Scanner sc=new Scanner(System.in);
		
		System.out.println("��¼������");
		//¼���������
		String str= sc.nextLine();
		
		//��¼���strת��Ϊchar���͵�����
		char []ch=str.toCharArray();
		
		//����TreeMap����
		TreeMap<Character,Integer> tm=new TreeMap<Character,Integer>(); 
		
		//����StringBuffer����
		StringBuffer sb=new StringBuffer();
		
		int value=1;
		
		//��������
		for (int i = 0; i < ch.length; i++) {
			if(!tm.containsKey(ch[i])){
				tm.put(ch[i],value );
				
			}else if(tm.containsKey(ch[i])){
				tm.put(ch[i], value+1);
				
			}
			System.out.println(sb.append(ch[i]).append("(").append(value).append(")"));
		}
	}

}
