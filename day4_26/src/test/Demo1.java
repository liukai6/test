package test;
/*
 * Ҫ��ʹ�õݹ������н׳˵����
 * 
 */
public class Demo1 {
	
	public static void main(String[] args) {
		
		//����һ����������׳˵���ֵ
		int a=5;
		int b=method(a);
		System.out.println(b);
	}

	private static int method(int a) {
		// TODO Auto-generated method stub
		//�����ý׳˾��Ǳ������Ա���Сһ����ֱ��һֹͣ
		int b=0;
		if(a==1){
			
		return 1;
			
		}
		b=a*method(a-1);
		a--;
		
		return b;
	}

}
