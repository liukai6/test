package itbool;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * ʹ�ø߼�forѭ��
 * 1.����һ��arraylist���ϣ�
 * 2.�򼯺�������ַ�������
 * 3.���ø߼�forѭ�����б���
 * */

public class Demo {

	public static void main(String[] args) {
		
		//��������¼�����
		Scanner sc=new Scanner(System.in);
		
		//������ʾ
		System.out.println("����������");
		
		sc.nextLine();
		ArrayList<String> arr=new ArrayList<String>();
		
		arr.add("lihua");
		arr.add("liming");
		arr.add("limgin");
		
		//����ǿforѭ�����б�������ArrayList
		for (String string : arr) {
			System.out.println(string);
		}
	}
}
