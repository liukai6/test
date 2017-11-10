package com.itbool1;

import java.awt.Frame;

/**创建窗口来接收我们打出的筛子
 * 
 * 来玩这个筛子游戏
 * 
 * @author liuka
 *
 */

public class PlayGame {
	
	public static void main(String[] args) {
		
		//创建窗口对象
		Frame f=new Frame("MyGame");
		
		//设置可见
		f.setVisible(true);
		
		//设置大小是否可调
		f.setResizable(false);
		
		//设置窗口大小
		f.setBounds(300, 300, 500, 500);
	}

}
