package demo;

import java.util.Arrays;

/*提示：
1、 定义一个成绩数组 scores ，保存预定的考试成绩 89 , -23 , 64 , 91 , 119 , 52 , 73
2、 调用自定义方法，传入成绩数组，完成功能*/

public class Demo1 {

	public static void main(String[] args) {
		
		//定义一个数组
		int [] arr={89,-23,64,91,119,52,73};
		
		//定义排序的方法
		System.out.println(change(arr));
	}

	private static int change(int[] arr) {
		// TODO Auto-generated method stub
		//先将传入进来的值进行排序
		Arrays.sort(arr);
		int x = 0;
		//遍历数组
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<=0&&arr[i]>=100){
				
			}else{
				 x=arr[i];
			}
		}
		
		return x;
	}
}
