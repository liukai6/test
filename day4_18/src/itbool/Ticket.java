package itbool;

public class Ticket extends Thread {
	
	static int i=100;
	
	public void run(){
		for(;i>0;i--){
		System.out.println("Ê£ÓàÆ±Êı:"+i);
		
		}else {
		System.out.println("Æ±ÒÑÊÛóÀ");
		}
	}
	public int mai(){
		
		return i--;
	}

}
