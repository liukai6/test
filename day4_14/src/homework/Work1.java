package homework;

import java.util.Scanner;

/*
 * 1����д���򣬵ݹ�(�׳�)��������
 * 2.�����Ż�,ͨ������¼������÷���
 * 
 */
public class Work1 {
	
	public static void main(String[] args) {
		
		//��������¼�����
		Scanner sc=new Scanner(System.in);
		
		//����tishi
		System.out.println("��������Ҫ�׳˵�����");
		//���õݹ飬�������
		int n=Integer.valueOf(sc.nextLine());
		//�����׳˵ķ���
		if(n>0&&n<30){
			System.out.println(ji(n));
		}else{
			System.out.println("��������ǲ��Ϸ�!!!!!!!");
		}
	}

	public static int ji(int n) {
		//��һ�ݹ�ĳ���
		if(n==1){
			
		return 1;	
		}else{
			
		return n*ji(n-1);
		}
	}

}
