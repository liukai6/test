package test;
/*
 * 打印10*10的正方形
 * 打印10*10的空心正方形
 * 
 */
public class Test8 {
	
	public static void main(String[] args) {
		//实心正方形
//		for(int i=1;i<=10;i++){
//			
//			for(int j=1;j<=10;j++){
//				
//				System.out.print("*  ");
//			}
//			System.out.println();
//		}
		//空心正方形
	for(int i=1;i<=10;i++){
			
			for(int j=1;j<=10;j++){
				
				if(i==1){
				System.out.print("*  ");
				}else if(i==10){
					System.out.print("*  ");
					}else if(j==1){
						System.out.print("                      ");
						System.out.print("*  ");
					}else if(j==10){
						System.out.print("*  ");
					}else{
						//System.out.println("   ");
					}
			}
			System.out.println();
		}
	}
}
