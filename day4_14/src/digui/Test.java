package digui;
/*
 * ²âÊÔn!
 * 
 * 
 */

public class Test {
	
	public static void main(String[] args) {
		
		
		int n=5;
		int a=ji(n);
		System.out.println(a);
	}

	public static int ji(int n) {
		
		if(n==1){
			
		return 1;
		}else {
		return n*ji(n-1);
		}
	}
}
