package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*联系Collections工具的方法
 * 
 * */

public class CollectionDemo {

	public static void main(String[] args) {
		
		//定义一个Collections集合
		ArrayList<Integer> c=new ArrayList<>();
		
		//将Integer的数添加到ArrayList的集合中去
		c.add(12);
		c.add(45);
		c.add(75);
		c.add(52);
		c.add(44);
		
		//利用Collections工具类中的静态方法对集合进行操作
		//利用sort()方法将集合排序
		Collections.sort(c);
		System.out.println(c);
		
		//二分查找
		int binarySearch = Collections.binarySearch(c, 52);
		System.out.println(binarySearch);
		
		//查找最大值
		System.out.println(Collections.max(c));
		
		//反转
		Collections.reverse(c);
		System.out.println(c);
		
		//打乱
		Collections.shuffle(c);
		System.out.println(c);
		
	}
}
