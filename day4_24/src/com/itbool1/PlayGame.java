package com.itbool1;

import java.awt.Frame;

/**�����������������Ǵ����ɸ��
 * 
 * �������ɸ����Ϸ
 * 
 * @author liuka
 *
 */

public class PlayGame {
	
	public static void main(String[] args) {
		
		//�������ڶ���
		Frame f=new Frame("MyGame");
		
		//���ÿɼ�
		f.setVisible(true);
		
		//���ô�С�Ƿ�ɵ�
		f.setResizable(false);
		
		//���ô��ڴ�С
		f.setBounds(300, 300, 500, 500);
	}

}
