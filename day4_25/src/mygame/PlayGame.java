package mygame;

public class PlayGame {
	
	public static void main(String[] args) {
		
		//��������һ��1-6���������
		int math=1+(int)(6*Math.random());
		
		//��ӡ����
		System.out.println(math);
		//Ȼ����switch���ʹ�͸�����ǵĴ�С�����ж�
		switch(math){
		
		case 6:
			
		case 5:
		
		case 4:
		
			System.out.println("�����˴��");
			break;
		case 3:
			
		case 2:
			
		case 1:
			
			System.out.println("������С��");
			break;
	
		}
	}
}
