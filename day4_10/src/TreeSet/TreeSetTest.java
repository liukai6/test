package TreeSet;

import java.util.TreeSet;

/*
 * 
###17.18_集合框架(TreeSet存储自定义对象并遍历练习2)(掌握)

	A:案例演示:	TreeSet存储自定义对象并遍历练习2
		按照姓名的长度进行排序
		主要条件是姓名的长度
		然后是姓名
		然后是年龄

 * 
 * */

public class TreeSetTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建比较器对象
		AgeComparable ac=new AgeComparable();
		//创建集合
		TreeSet	<Student> t=new TreeSet<Student>(ac);
		
//		创建学生对象
		Student s1=new Student("wadawd",18);
		Student s2=new Student("asdf",120);
		Student s3=new Student("asgf",18);
		Student s4=new Student("fdghfgf",34);
		Student s5=new Student("fgdfg",56);
		
		//添加到集合中
		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);
		t.add(s5);
		
		
		//遍历
		for (Student s : t) {
			System.out.println(s);
		}
		
	}

}
