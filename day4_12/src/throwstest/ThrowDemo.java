package throwstest;

/*��ϰthrow��ʹ��
 * 
 * 
 */

public class ThrowDemo {

	public static void main(String[] args) {
		
		int [] a=new int[3];
		
		//Exception e=mew Exception��
		//����Exception����
		//Exception e=new Exception("����,���˾��Ǵ���");
		
	try {
			System.out.println(a[7]);
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
			System.out.println("------------------");
			e.printStackTrace();
			System.out.println("--------------");
			e.toString();
			e.printStackTrace();
		}
	
//		����Exception�ķ���

	}
}
