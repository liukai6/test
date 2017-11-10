package itbool01;

import java.awt.Frame;

/*
 * 联系基本数据类型与转换为字符串的三种方法
 * 
 */
public class Demo {

	public static void main(String[] args) {
		
		//定义一个基本数据类型
		int n=99;
		
//		将其中转为字符串通过包装类的toString方法
		String string = Integer.toString(n);
		
		//通过tostring的valueOf方法
		String string2 = String.valueOf(n);
		
		//通过与空字符串拼接得到字符串类型
		String string3=n+"";
		
		Frame f=new Frame();
		
		f.setVisible(true);
		
		f.setSize(500, 500);
		
		f.setLocation(400, 300);
		
		f.setTitle("我的窗口");
		
		f.set
	}
}
