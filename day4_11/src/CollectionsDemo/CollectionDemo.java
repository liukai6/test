package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*��ϵCollections���ߵķ���
 * 
 * */

public class CollectionDemo {

	public static void main(String[] args) {
		
		//����һ��Collections����
		ArrayList<Integer> c=new ArrayList<>();
		
		//��Integer������ӵ�ArrayList�ļ�����ȥ
		c.add(12);
		c.add(45);
		c.add(75);
		c.add(52);
		c.add(44);
		
		//����Collections�������еľ�̬�����Լ��Ͻ��в���
		//����sort()��������������
		Collections.sort(c);
		System.out.println(c);
		
		//���ֲ���
		int binarySearch = Collections.binarySearch(c, 52);
		System.out.println(binarySearch);
		
		//�������ֵ
		System.out.println(Collections.max(c));
		
		//��ת
		Collections.reverse(c);
		System.out.println(c);
		
		//����
		Collections.shuffle(c);
		System.out.println(c);
		
	}
}
