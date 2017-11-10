package TreeSet;

import java.util.TreeSet;

/*	案例演示:	TreeSet存储Integer类型的元素并遍历
		存储下列元素:  20 , 18 , 23 , 22 , 17 , 24, 19 , 18 , 24

 * 
 * */

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		//定义集合
		TreeSet<Integer> ts=new TreeSet<Integer>();
		
		//将我们的Integer对象添加到集合中
		ts.add(20);
		ts.add(18);
		ts.add(18);
		ts.add(74);
		ts.add(75);
		ts.add(45);
		ts.add(45);
		ts.add(45);
		
		//遍历集合
		for(Integer i: ts){
			
			System.out.println(i);
		}
		
		
	}

}
