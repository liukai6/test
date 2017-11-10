package ThreadDemo;

class Test1 implements Runnable {
	
	private int num=50;
	public static void main (String[] args) {
		
		Thread t = new Thread(new Test() );

		t.start();
	}
		public void run() {

			for (int i =0; i < num; i++) {

				System.out.println( i );

			}

		}

}	
