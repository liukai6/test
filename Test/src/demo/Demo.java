package demo;

//����java.util.Arrays;
/*
	 * ���ܣ�����ָ�����ȵ�int�����飬������100���������Ϊ�����е�ÿ��Ԫ�ظ�ֵ
	 * ����һ�����δ�����ֵ�ķ�����ͨ��������������ĳ��ȣ����ظ�ֵ�������
	 */
class Demo{
	
	public static void main(String[] args) {
		
//		���ȶ���һ��ָ�����ȵĵ�int������
		int length=10;
		
//		���÷�������arr�������
		int[] arr=randomMath(length);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
	}

	private static int[] randomMath(int length) {
		int [] arr=new int[length];
		for(int i=0;i<length;i++){
			
			arr[i]=(int)(Math.random()*100);
			
		}
		return arr;
	}
	
	
	
}