
public class Test {
	
	public static int x=1;
	
	public Test(){
		this.x=2;
	}

	public  int getX() {
		return x;
	}

	public  void setX(int i) {
		this.x =i;
	}
	public static void main(String[] args) {
		
		System.out.println(Test.x);
		
		Test t1=new Test();
		Test t2=new Test();
		t1.setX(3);
		System.out.println(t1.getX());
		t2.setX(4);
		System.out.println(t2.getX());
	}
	
}
