package itbool;
/**
 * 需求：某电影院目前正在上映贺岁大片，共有100张票，而它有3个售票窗口售票，请设计一个程序模拟该电影院售票。
		通过继承Thread类实现

 * 
 * @author liuka
 *
 */
public class Test100 {
	public static void main(String[] args) {
		
		Ticket t1=new Ticket();
		Ticket t2=new Ticket();
		Ticket t3=new Ticket();
		
		t1.start();
		t2.start();
		t3.start();
		for(int x=0;x<100;x++){
		t1.mai();
		}
		for(int x=0;x<100;x++){
			t2.mai();
			}
		for(int x=0;x<100;x++){
			t3.mai();
			}
	}

}
