package HashMap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 案例演示:	HashMap集合键是Student值是String的案例
 * */
public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		创建HashMap集合
		HashMap<Student, String> hm=new HashMap<Student,String>();
		
		//创建学生对象
		Student s1=new Student("刘亦菲",54);
		Student s2=new Student("犯病",45);
		Student s3=new Student("伙计",23);
		Student s4=new Student("默默",23);
		
		hm.put(s1, "黑我和");
		hm.put(s2, "我的我的");
		hm.put(s3, "awdkwdj");
		hm.put(s4,"李吴大伟");
		
		//遍历集合
		Set<Student> keySet = hm.keySet();
		for (Student stu : keySet) {
			String str = hm.get(stu);
			System.out.println(stu.getName()+"---"+stu.getAge()+"---"+str);
		}
		
		//遍历集合
		Set<Entry<Student, String>> entrySet = hm.entrySet();
		for(Entry<Student, String> en:entrySet){
			Student key = en.getKey();
			String value = en.getValue();
			System.out.println(key.getName()+"-----"+key.getAge()+"----"+value);
			
			
		}
		
		
	}

}
