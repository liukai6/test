package digui;

/*计算兔子二十个月的对数
 * 
 * 
 * 
 */

public class Demo {

	public static void main(String[] args) {
		
		//利用递归的方法来进行
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
