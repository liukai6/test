package itbool;

public class MyThread extends Thread{
	
	
	public MyThread(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//实现砰的爆炸
		System.out.println("出现故障了,请及时处理解决");
	}
}
