package itbool.user.dao;

import itbool.user.domain.User;

public interface GongNeng {
	
	//定义注册的功能接口
	public abstract void ZhuCe(User user);
	
	//定义登陆的功能接口
	public abstract void DengLu(String Name,String PassWord);
	

}
