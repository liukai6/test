package demo;
//写一个二分查找的函数
public class Demo2 {

	public static void main(String[] args) {
		
		//定义一个有序的数组
		int [] arr={13,15,25,58,89,111,258,366,3696,15852};
		
		//定义一个方法求出一个数的角标，利用二分查找
		int b=getMath(arr,345);
		
		System.out.println(b);
	}

	public static int getMath(int[] arr,int a) {
		
		//首先我们要定义最大角标和最小小标
		int max=arr.length-1;
		int min=0;
		int mid=(max+min)>>1;
		
		//进行循环判断我们数组里的数是否等于传递进来的a
		while(arr[mid]!=a){
			
			//如果arr[]大于a
			if(arr[mid]<a){
				min=mid+1;
			}else if(arr[mid]>a){
				max=mid-1;
			}else if(min>max){
				return -1;
			}
			mid=(max+min)>>1;
		}
		
		return mid;
	}
}
