package com.itbool1;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/*练习switch语句来做筛子的小游戏
 * 
 */
public class Test {
	
	public static void main(String[] args) {
		
		//首先生成一个随机1到6的数字
		int math=1+(int)(Math.random()*6);
		
		System.out.println(math);
		
		//用switch语句进行判断
		switch(math){
			
		case 6:
						
		case 5:
			
		case 4:
			
			System.out.println("运气太棒了,大点数");
			
			break;
		
		case 3:
			
		case 2:
			
		case 1:
			
			System.out.println("您打了个小点数");
		break;
		}
		
		}
	}
	

