package hashcode;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建集合对象
		LinkedHashSet<Student> s=new LinkedHashSet<Student>();
		
		
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
//		遍历
		for (Student stu : s) {
			System.out.println(stu.getName()+"=========="+stu.getAge());
		}
	}

}
