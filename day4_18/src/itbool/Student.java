package itbool;

public class Student extends Thread {
	static int i=0;
	private String name;
	private int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Student() {
		super();
		
		}
	public String getName1() {
		return name;
	}
	public void setName1(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void run(){
		for(int x=10;x>0;x--){
			System.out.println("µπº∆ ±:"+x+"√Î");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		for (int i = 0; i < 100; i++) {
			
			
			System.out.println(Thread.currentThread().getName()+"----"+i);
		}
	}
		

	

}
