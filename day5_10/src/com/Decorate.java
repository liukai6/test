package com;
/*
 * װ����ģʽ��ϰ
 */
public class Decorate implements Tea {
	

	
	public void Method() {
		// TODO Auto-generated method stub
		System.out.println("�ú�");
	}

}

class RedTea implements Tea{
	
	
	private RedTea rt;
	
	public RedTea(Tea  dec){
		this.rt=(RedTea) dec;
	}
	
	public void Method() {
		// TODO Auto-generated method stub
		System.out.println("���ú�");
	}

}

