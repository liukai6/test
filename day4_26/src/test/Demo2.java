package test;

import java.util.Random;

/*
 * 根据随机生成的月份打印出该月份的天数
 * 
//首先考虑使用switch语句,同事使用case穿透可以很好的解决本题
 * 
 */
public class Demo2 {
	
	public static void main(String[] args) {

		//生成1到12的随机数字
		Random r=new Random();
		int a=1+r.nextInt(11);
//		int a=(int)(1+Math.random()*11);
		System.out.println(a);
		
		//然后利用switch进行比较打印月份
		switch(a){
		
		case 2:
			System.out.println("本月天数28天");
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8 :
		case 10 :
		case 12:
			System.out.println("本月天数31天");
			break;
		default:
			System.out.println("本月天数30天");
			
		
		
		
		}
		
	}
}
