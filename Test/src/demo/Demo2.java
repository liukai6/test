package demo;
//дһ�����ֲ��ҵĺ���
public class Demo2 {

	public static void main(String[] args) {
		
		//����һ�����������
		int [] arr={13,15,25,58,89,111,258,366,3696,15852};
		
		//����һ���������һ�����ĽǱ꣬���ö��ֲ���
		int b=getMath(arr,345);
		
		System.out.println(b);
	}

	public static int getMath(int[] arr,int a) {
		
		//��������Ҫ�������Ǳ����СС��
		int max=arr.length-1;
		int min=0;
		int mid=(max+min)>>1;
		
		//����ѭ���ж���������������Ƿ���ڴ��ݽ�����a
		while(arr[mid]!=a){
			
			//���arr[]����a
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
