package itbool;
/**
 * ����ĳ��ӰԺĿǰ������ӳ�����Ƭ������100��Ʊ��������3����Ʊ������Ʊ�������һ������ģ��õ�ӰԺ��Ʊ��
		ͨ���̳�Thread��ʵ��

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
