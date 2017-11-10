package HashMap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*案例演示:	HashMap集合键是Stirng值是String的案例
 * 
 * */
public class HashMapDemo {
	
	public static void main(String[] args) {
		
		//创建HashMap集合
		HashMap<String, String> hm=new HashMap<String,String>();
		
		// 将赎金添加到集合中去
		hm.put("黎明", "李寻欢");
		hm.put("明白", "呼呼哈哈");
		hm.put("开行", "就这样呢");
		hm.put("黎明", "而得分");
		
		//打印
		//System.out.println(hm);
		
		//System.out.println("====================");
		
		//第一种遍历的方式通过keySet方法获取Set集合获取
		Set<String> keySet = hm.keySet();
		
		System.out.println(keySet);
		
			for(String s: keySet){
			
				String value = hm.get(s);
			System.out.println(s+"---"+value);
			}
			
			System.out.println("====================");
			
			//通过entrySet来遍历
			Set<Entry<String, String>> en = hm.entrySet();
			
			for(Entry<String,String> s1:en){
				
				String key = s1.getKey();
				String value2 = s1.getValue();
				System.out.println(key+"===="+value2);
			}
			
		
	}

}
