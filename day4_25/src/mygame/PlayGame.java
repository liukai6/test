package mygame;

public class PlayGame {
	
	public static void main(String[] args) {
		
		//首先生成一个1-6的随机数字
		int math=1+(int)(6*Math.random());
		
		//打印点数
		System.out.println(math);
		//然后用switch语句和穿透对我们的大小进行判断
		switch(math){
		
		case 6:
			
		case 5:
		
		case 4:
		
			System.out.println("你掷了大点");
			break;
		case 3:
			
		case 2:
			
		case 1:
			
			System.out.println("你掷了小点");
			break;
	
		}
	}
}
