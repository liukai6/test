package TreeSet;

import java.util.TreeSet;

/*	������ʾ:	TreeSet�洢Integer���͵�Ԫ�ز�����
		�洢����Ԫ��:  20 , 18 , 23 , 22 , 17 , 24, 19 , 18 , 24

 * 
 * */

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		//���弯��
		TreeSet<Integer> ts=new TreeSet<Integer>();
		
		//�����ǵ�Integer������ӵ�������
		ts.add(20);
		ts.add(18);
		ts.add(18);
		ts.add(74);
		ts.add(75);
		ts.add(45);
		ts.add(45);
		ts.add(45);
		
		//��������
		for(Integer i: ts){
			
			System.out.println(i);
		}
		
		
	}

}
