package mygame;

import java.awt.*;

public class MyGame extends Frame {
	
	//球桌和球桌图片
	Image ball=Toolkit.getDefaultToolkit().getImage("image/ball.png");
	Image desk=Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	
	//桌球的起始位置
	double x=100;
	double y=100;
	
	//桌球移动的初始角度
	double degree=3.14/3;
	
	
	/*绘制一次桌面和桌球
	 */
public void paint(Graphics g){
	//绘制桌球桌面
	System.out.println("窗口被画一次");
	g.drawImage(desk, 0, 0, null);
	g.drawImage(ball, (int)x,(int) y, null);
	//桌球下一次的位置
	x=x+10*Math.cos(degree);
	y=y+10*Math.sin(degree);
	//到了球桌四个边框桌角的变化
	//1.如果到了底部,就要改变角度
	if(y>480-30-40){
		degree=-degree;
		
	}
	if(x>856-30-40){
		degree=3.14-degree;
	}
	if(x<20+20){
		degree=3.14-degree;
	}
	if(y<20+20){
		degree=-degree;
	}
	
}

//绘制多次桌面和桌球4
void launchFrame(){
	//
	setSize(1800,1000);
	setLocation(50,50);
	setTitle("刘凯---的作品");
	setVisible(true);
	//每隔40毫秒绘制一次
	while(true){
		repaint();
		try {
			Thread.sleep(40);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
public static void main(String[] args) {
	
	System.out.println("liukai");
	MyGame bg=new MyGame();
	bg.launchFrame();
}

}


