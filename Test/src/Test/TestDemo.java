package Test;

import java.util.HashMap;
import java.util.Scanner;

/*1.����һ��������
 * ����Ҫ����¼��ע����Ϣ
 * 2.����tools��ķ��������Ǵ��뵽HashMap�еļ�����ȥ
 * ����¼���¼��
 * ���ñȽϵķ���
 * 
 * 
 */

public class TestDemo {
	
	public static void main(String[] args) {
		
		//��ӭ����
		System.out.println("===============��ӭ�����ҵ�ϵͳ��++++++++++++++++++++");
		System.out.println("����������ѡ��:");
		System.out.println("1.ע��");
		System.out.println("2.��¼");
		System.out.println("3.�˳�ϵͳ");
		
		HashMap<String, String> hm=new HashMap();
		//��������¼�����
		Scanner sc=new Scanner(System.in);
		while(true){
		//������ʾ
		System.out.println("��������Ч����");
		
		//����¼�����
		String a=sc.nextLine();
		switch(a){
		
			case "1" :
		
			//������ʾ
			System.out.println("������ע���û���");
			
			
			
			//����¼���û���
			String userName=sc.nextLine();
			
			//������ʾ
			System.out.println("������ע������");
			
			//����¼���û���
			String passWord=sc.nextLine();
			
			//����Tools��ķ������д��뵽�����еĶ���
			hm.put(userName,passWord);
			
			case "2"  :
				//������ʾ
				System.out.println("�������¼�û���");
				
				
				
				//����¼���û���
				 userName=sc.nextLine();
				
				//������ʾ
				System.out.println("�������¼����");
				
				//����¼���û���
				 passWord=sc.nextLine();
				 
				 boolean falg = false;
					if(hm.containsKey(userName)){
						
						 falg=hm.get(userName).equals(passWord); 
					}
					System.out.println(falg);
					
			case "3" :
				
				System.exit(0);
				
				
		
		
		
		
		
		
		
		
		
		}
		
		}
	}

}
