package itbool;

public class Ticket extends Thread {
	
	static int i=100;
	
	public void run(){
		for(;i>0;i--){
		System.out.println("ʣ��Ʊ��:"+i);
		
		}else {
		System.out.println("Ʊ������");
		}
	}
	public int mai(){
		
		return i--;
	}

}
