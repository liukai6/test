package tools;
/*
 * 1.此类中要完成的功能为将注册的内容添加到集合
 * 分析使用哪种集合用HashMap集合
 * 2.拿输入的信息与集合中的比较
 * 
 * 
 */

import java.util.HashMap;

public class Tools {
	
	private String userName;
	private String passWord;
	
	//将userName和passWord添加到集合中
	HashMap<String, String> hm=new HashMap();
	
	//添加元素
	public void zhuCe(String a,String b){
		
		hm.put(userName, passWord);
		
	}
		
	//登录
	public boolean	dengLu(String c,String d){
		boolean falg = false;
		if(hm.containsKey(c)){
			
			 falg=hm.get(c).equals(d); 
		}
		return falg;
	}
}
