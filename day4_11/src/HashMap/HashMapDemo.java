package HashMap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*������ʾ:	HashMap���ϼ���Stirngֵ��String�İ���
 * 
 * */
public class HashMapDemo {
	
	public static void main(String[] args) {
		
		//����HashMap����
		HashMap<String, String> hm=new HashMap<String,String>();
		
		// �������ӵ�������ȥ
		hm.put("����", "��Ѱ��");
		hm.put("����", "��������");
		hm.put("����", "��������");
		hm.put("����", "���÷�");
		
		//��ӡ
		//System.out.println(hm);
		
		//System.out.println("====================");
		
		//��һ�ֱ����ķ�ʽͨ��keySet������ȡSet���ϻ�ȡ
		Set<String> keySet = hm.keySet();
		
		System.out.println(keySet);
		
			for(String s: keySet){
			
				String value = hm.get(s);
			System.out.println(s+"---"+value);
			}
			
			System.out.println("====================");
			
			//ͨ��entrySet������
			Set<Entry<String, String>> en = hm.entrySet();
			
			for(Entry<String,String> s1:en){
				
				String key = s1.getKey();
				String value2 = s1.getValue();
				System.out.println(key+"===="+value2);
			}
			
		
	}

}
