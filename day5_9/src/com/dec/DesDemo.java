package com.dec;

public class DesDemo {
	//��һ��������
	public static void main(String[] args) {
		//׼�������Ѿ�����,��ħ����ʱ����
		Tea rt=new RedTea();
		Tea gt=new GreenTea(rt);
		gt.method();
		
	}
}
//����һ����ͬʵ�ֵĽӿ�Tea
interface Tea{
	
	public void method();
	
}
//����һ�������
class RedTea implements Tea{

	public void method() {
		// TODO Auto-generated method stub
		System.out.println("������.......red");
	}

}
//����һ���̲�
class GreenTea implements Tea{
	
	//��������Green�������к��ζ����Ҫ��װ����ģʽ
	//����һ��˽�ж���
	private Tea rt;
	public GreenTea(){}
	//�����̲�Ĺ��췽��
	public GreenTea(Tea rt){
		this.rt=rt;
	}

	public void method() {
		// TODO Auto-generated method stub
		System.out.println("������......green");
	}
	
}