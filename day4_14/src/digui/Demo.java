package digui;

/*�������Ӷ�ʮ���µĶ���
 * 
 * 
 * 
 */

public class Demo {

	public static void main(String[] args) {
		
		//���õݹ�ķ���������
		int a=20;
		System.out.println(b(a));;
		
	}

	public static int b(int a) {
		if(a==1||a==2){
			
			return 1;
		}else{
			
		return b(a-1)+b(a-2);
		}
	}
}
