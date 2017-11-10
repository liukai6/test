package demo;

//导入java.util.Arrays;
/*
	 * 功能：创建指定长度的int型数组，并生成100以内随机数为数组中的每个元素赋值
	 * 定义一个带参带返回值的方法，通过参数传入数组的长度，返回赋值后的数组
	 */
class Demo{
	
	public static void main(String[] args) {
		
//		首先定义一个指定长度的的int型数组
		int length=10;
		
//		调用方法生成arr里的数字
		int[] arr=randomMath(length);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
	}

	private static int[] randomMath(int length) {
		int [] arr=new int[length];
		for(int i=0;i<length;i++){
			
			arr[i]=(int)(Math.random()*100);
			
		}
		return arr;
	}
	
	
	
}