package mygame;

import java.awt.*;

public class MyGame extends Frame {
	
	//����������ͼƬ
	Image ball=Toolkit.getDefaultToolkit().getImage("image/ball.png");
	Image desk=Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	
	//�������ʼλ��
	double x=100;
	double y=100;
	
	//�����ƶ��ĳ�ʼ�Ƕ�
	double degree=3.14/3;
	
	
	/*����һ�����������
	 */
public void paint(Graphics g){
	//������������
	System.out.println("���ڱ���һ��");
	g.drawImage(desk, 0, 0, null);
	g.drawImage(ball, (int)x,(int) y, null);
	//������һ�ε�λ��
	x=x+10*Math.cos(degree);
	y=y+10*Math.sin(degree);
	//���������ĸ��߿����ǵı仯
	//1.������˵ײ�,��Ҫ�ı�Ƕ�
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

//���ƶ�����������4
void launchFrame(){
	//
	setSize(1800,1000);
	setLocation(50,50);
	setTitle("����---����Ʒ");
	setVisible(true);
	//ÿ��40�������һ��
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


