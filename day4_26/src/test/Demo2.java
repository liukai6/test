package test;

import java.util.Random;

/*
 * ����������ɵ��·ݴ�ӡ�����·ݵ�����
 * 
//���ȿ���ʹ��switch���,ͬ��ʹ��case��͸���ԺܺõĽ������
 * 
 */
public class Demo2 {
	
	public static void main(String[] args) {

		//����1��12���������
		Random r=new Random();
		int a=1+r.nextInt(11);
//		int a=(int)(1+Math.random()*11);
		System.out.println(a);
		
		//Ȼ������switch���бȽϴ�ӡ�·�
		switch(a){
		
		case 2:
			System.out.println("��������28��");
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8 :
		case 10 :
		case 12:
			System.out.println("��������31��");
			break;
		default:
			System.out.println("��������30��");
			
		
		
		
		}
		
	}
}
