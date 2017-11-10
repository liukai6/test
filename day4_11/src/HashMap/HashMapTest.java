package HashMap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 * ������ʾ:	HashMap���ϼ���Studentֵ��String�İ���
 * */
public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		����HashMap����
		HashMap<Student, String> hm=new HashMap<Student,String>();
		
		//����ѧ������
		Student s1=new Student("�����",54);
		Student s2=new Student("����",45);
		Student s3=new Student("���",23);
		Student s4=new Student("ĬĬ",23);
		
		hm.put(s1, "���Һ�");
		hm.put(s2, "�ҵ��ҵ�");
		hm.put(s3, "awdkwdj");
		hm.put(s4,"�����ΰ");
		
		//��������
		Set<Student> keySet = hm.keySet();
		for (Student stu : keySet) {
			String str = hm.get(stu);
			System.out.println(stu.getName()+"---"+stu.getAge()+"---"+str);
		}
		
		//��������
		Set<Entry<Student, String>> entrySet = hm.entrySet();
		for(Entry<Student, String> en:entrySet){
			Student key = en.getKey();
			String value = en.getValue();
			System.out.println(key.getName()+"-----"+key.getAge()+"----"+value);
			
			
		}
		
		
	}

}
