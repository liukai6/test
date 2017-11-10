package day4_16;

import java.util.Arrays;

/*小伙伴们，请根据所学知识，编写一个 JAVA 程序，实现输出考试成绩的前三名
要求：
1、 考试成绩已保存在数组 scores 中，数组元素依次为 89 , -23 , 64 , 91 , 119 , 52 , 73
2、 要求通过自定义方法来实现成绩排名并输出操作，将成绩数组作为参数传入
3、 要求判断成绩的有效性（ 0—100 ），如果成绩无效，则忽略此成绩
运行效果：
*/
public class Test1 {
	
	public static void main(String[] args) {
		
		//定义一个数组来存需要的元素
		int[] scores={89,-23,64,91,119,52,73};
		
		chang(scores);
	}

	public static void chang(int[] scores) {
		
		//给数组进行排序
		Arrays.sort(scores);
		//首先反向遍历数组
		for (int i = scores.length-1;  i>=0; i--) {
			
			//判断成绩是否为为合理范围
			if(scores[i]>=0&&scores[i]<=100){
				
				//打印
				System.out.println(scores[i]);
			}
		}
	}

}
