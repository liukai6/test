package day4_16;

import java.util.Arrays;

//����Arrays��


public class Test {
    public static void main(String[] args) {
        
		// ����һ���ַ�������
		String[] hobbys = { "sports", "game", "movie" };
        
		// ʹ��Arrays���sort()�����������������
		Arrays.sort(hobbys);
        
		// ʹ��Arrays���toString()����������ת��Ϊ�ַ��������
		System.out.println(Arrays.toString(hobbys));
	}
}