package homework;

import java.util.Scanner;

/*
 * 
 * 
 * 2����д����쳲��������У�������
����һ�����Ĺ�������: 1��1��2��3��5��8��13��21��34...... 
  ���30λ���Ƕ��٣� �õݹ��㷨ʵ��
  ����쳲��������е��ص�
  �ӵ���λ��ʼ��λ����ǰ��λ�ĺ�
�Ż��������¼��ֵ
 */

public class Work2 {
	
	public static void main(String[] args) {
		
		//��������¼�����
		Scanner sc=new Scanner(System.in);
		
		//������ʾ
		System.out.println("����������");
		//����һ��������ʾλ��
		double d=Integer.valueOf(sc.nextLine());
		double n=System.currentTimeMillis();
		//��ֵ���뷢��������
		System.out.println(ji(d));
		double b=System.currentTimeMillis();
		System.out.println(b-n);
	}

	public static int ji(double d) {
		
		//�����жϸ��ݹ�Ѱ�ҳ���
		if(d==1||d==2){
			
			return 1;
		}else {
			
			return ji(d-1)+ji(d-2);
		}
		
		
	}

}
