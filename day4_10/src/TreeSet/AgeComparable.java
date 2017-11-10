package TreeSet;

import java.util.Comparator;

public class AgeComparable implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		int num=o1.getAge()-o2.getAge();
		
		int num1=(num==0) ? o2.getAge()-o1.getAge():num;
		
	int num2=(int) ((num1==0) ? o1.getName().compareTo(o2.getName()) :num1);
		
		
		return num2;
	}

}
