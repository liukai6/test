package day4_16;

import java.util.Arrays;

/*С����ǣ��������ѧ֪ʶ����дһ�� JAVA ����ʵ��������Գɼ���ǰ����
Ҫ��
1�� ���Գɼ��ѱ��������� scores �У�����Ԫ������Ϊ 89 , -23 , 64 , 91 , 119 , 52 , 73
2�� Ҫ��ͨ���Զ��巽����ʵ�ֳɼ�������������������ɼ�������Ϊ��������
3�� Ҫ���жϳɼ�����Ч�ԣ� 0��100 ��������ɼ���Ч������Դ˳ɼ�
����Ч����
*/
public class Test1 {
	
	public static void main(String[] args) {
		
		//����һ������������Ҫ��Ԫ��
		int[] scores={89,-23,64,91,119,52,73};
		
		chang(scores);
	}

	public static void chang(int[] scores) {
		
		//�������������
		Arrays.sort(scores);
		//���ȷ����������
		for (int i = scores.length-1;  i>=0; i--) {
			
			//�жϳɼ��Ƿ�ΪΪ����Χ
			if(scores[i]>=0&&scores[i]<=100){
				
				//��ӡ
				System.out.println(scores[i]);
			}
		}
	}

}
