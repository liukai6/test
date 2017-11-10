package hashcode;

import java.util.HashSet;

/*
 * 测试类
 * 
 * */
public class HashSetTest {

	public static void main(String[] args) {
		
		//创建集合HashSet
		HashSet<Student> s=new HashSet<Student>();
		
//		创建学生对象
		Student s1=new Student("黎明",12	);
		Student s2=new Student("刘德华",435);
		Student s3=new Student("明白",32);
		Student s4=new Student("礼拜",32);
		Student s5=new Student("伦",32);
		Student s6=new Student("周",32);
		Student s7=new Student("坏人",32);
		
		//讲创建的对象加到集合HashSet中
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		s.add(s5);
		s.add(s6);
		s.add(s7);
		//利用增强的for循环来遍历集合
		for (Student stu : s) {
			System.out.println(stu.getAge()+"========"+stu.getName());
		}
	}
}
