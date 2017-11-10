package com;
/*
 * 装饰者模式练习
 */
public class Decorate implements Tea {
	

	
	public void Method() {
		// TODO Auto-generated method stub
		System.out.println("好喝");
	}

}

class RedTea implements Tea{
	
	
	private RedTea rt;
	
	public RedTea(Tea  dec){
		this.rt=(RedTea) dec;
	}
	
	public void Method() {
		// TODO Auto-generated method stub
		System.out.println("不好喝");
	}

}

