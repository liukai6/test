package com.itbool;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * ��ϰ�����ʹ��
 * ����
 * ����һ����
 * ͨ������һ�λ���乹�췽��,��Ա����,��Ա����
 * 
 * @author liuka
 *
 */

public class Demo {
	
	public static void main(String[] args) throws Exception {
		
		//��ȡ����Ҫ��ȡ�ù��췽�����.class����
		Class f = Class.forName("com.itbool.Student");
		
		//ͨ��class�����ȡ���췽��
		Constructor c = f.getConstructor();
		
		System.out.println(c);
		
		//ͨ�����췽�����ô�������
		Object obj = c.newInstance();
		
		//ͨ��class��ȡ��������
	    Method m = f.getDeclaredMethod("fun");
	    
	    m.setAccessible(true);
		
		//ʵ��fun����
        m.invoke(obj);
	}

}
