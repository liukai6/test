package hashcode;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������϶���
		LinkedHashSet<Student> s=new LinkedHashSet<Student>();
		
		
//		����ѧ������
		Student s1=new Student("����",12	);
		Student s2=new Student("���»�",435);
		Student s3=new Student("����",32);
		Student s4=new Student("���",32);
		Student s5=new Student("��",32);
		Student s6=new Student("��",32);
		Student s7=new Student("����",32);
		
		//�������Ķ���ӵ�����HashSet��
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		s.add(s5);
		s.add(s6);
		s.add(s7);
//		����
		for (Student stu : s) {
			System.out.println(stu.getName()+"=========="+stu.getAge());
		}
	}

}
