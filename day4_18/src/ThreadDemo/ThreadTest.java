package ThreadDemo;

class ThreadTest {
	
	public int start = 1;
	public int end = 99;
	
	public static void main (String[] args) { 
		new ThreadTest().method();

	} 

	public void method() {

		//²åÈë´úÂë´¦
		class Mythread implements Runnable{

			@Override
			public void run() {
				for(;start<=end;start++){
					
					System.out.println(start);
				}
				
			}

		}
		Mythread a=new Mythread(); 
		
		Thread t = new Thread( a );

		t.start();

	} 
}
