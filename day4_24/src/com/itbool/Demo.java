package com.itbool;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 练习反射的使用
 * 步骤
 * 创建一个类
 * 通过反射一次获得其构造方法,成员变量,成员方法
 * 
 * @author liuka
 *
 */

public class Demo {
	
	public static void main(String[] args) throws Exception {
		
		//获取我们要的取得构造方法类的.class对象
		Class f = Class.forName("com.itbool.Student");
		
		//通过class对象获取构造方法
		Constructor c = f.getConstructor();
		
		System.out.println(c);
		
		//通过构造方法调用创建对象
		Object obj = c.newInstance();
		
		//通过class获取方法对象
	    Method m = f.getDeclaredMethod("fun");
	    
	    m.setAccessible(true);
		
		//实现fun方法
        m.invoke(obj);
	}

}
