package test;
/**
 * ��for��whileѭ���ֱ�ѭ����1��100��������ż���ĺͲ����
 * 
 * @author liuka
 *
 */

public class Demo3 {
	
	public static void main(String[] args) {
		
		//����һ��������¼������
		int sum1=0;
		int sum2=0;
		//������forѭ����ȫ�������ĺ�
		for(int a=1;a<100;a++){
			if(a%2==1){
				
				sum1+=a;
					
			}
			
		}
		//��whileѭ����ż���ĺ�
		int b=2;
		while(b<=100){
			
			sum2+=b;
			b+=2;
		}
		//������
		System.out.println("1-100�����ĺ�Ϊ:"+sum1);
		System.out.println("1-100ż���ĺ�Ϊ:"+sum2);
		System.out.println("1��100���ĺ�Ϊ:"+(sum1+sum2));
		
	}

}
