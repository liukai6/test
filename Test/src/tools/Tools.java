package tools;
/*
 * 1.������Ҫ��ɵĹ���Ϊ��ע���������ӵ�����
 * ����ʹ�����ּ�����HashMap����
 * 2.���������Ϣ�뼯���еıȽ�
 * 
 * 
 */

import java.util.HashMap;

public class Tools {
	
	private String userName;
	private String passWord;
	
	//��userName��passWord��ӵ�������
	HashMap<String, String> hm=new HashMap();
	
	//���Ԫ��
	public void zhuCe(String a,String b){
		
		hm.put(userName, passWord);
		
	}
		
	//��¼
	public boolean	dengLu(String c,String d){
		boolean falg = false;
		if(hm.containsKey(c)){
			
			 falg=hm.get(c).equals(d); 
		}
		return falg;
	}
}
