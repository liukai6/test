package demo;

import java.util.Arrays;

/*��ʾ��
1�� ����һ���ɼ����� scores ������Ԥ���Ŀ��Գɼ� 89 , -23 , 64 , 91 , 119 , 52 , 73
2�� �����Զ��巽��������ɼ����飬��ɹ���*/

public class Demo1 {

	public static void main(String[] args) {
		
		//����һ������
		int [] arr={89,-23,64,91,119,52,73};
		
		//��������ķ���
		System.out.println(change(arr));
	}

	private static int change(int[] arr) {
		// TODO Auto-generated method stub
		//�Ƚ����������ֵ��������
		Arrays.sort(arr);
		int x = 0;
		//��������
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<=0&&arr[i]>=100){
				
			}else{
				 x=arr[i];
			}
		}
		
		return x;
	}
}
