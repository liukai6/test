package TreeSet;

import java.util.TreeSet;

/*
 * 
###17.18_���Ͽ��(TreeSet�洢�Զ�����󲢱�����ϰ2)(����)

	A:������ʾ:	TreeSet�洢�Զ�����󲢱�����ϰ2
		���������ĳ��Ƚ�������
		��Ҫ�����������ĳ���
		Ȼ��������
		Ȼ��������

 * 
 * */

public class TreeSetTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����Ƚ�������
		AgeComparable ac=new AgeComparable();
		//��������
		TreeSet	<Student> t=new TreeSet<Student>(ac);
		
//		����ѧ������
		Student s1=new Student("wadawd",18);
		Student s2=new Student("asdf",120);
		Student s3=new Student("asgf",18);
		Student s4=new Student("fdghfgf",34);
		Student s5=new Student("fgdfg",56);
		
		//��ӵ�������
		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);
		t.add(s5);
		
		
		//����
		for (Student s : t) {
			System.out.println(s);
		}
		
	}

}
