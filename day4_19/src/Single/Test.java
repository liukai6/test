package Single;

/*
 * ����ʽ
 * 
 */
public class Test {
	
//	˽�л����췽��
	private Test(){
		
	}

//	����һ������
	private static Test t;
	
	//����һ�����Ի�ȡ����ķ���
	public static Test getTest(){
		
		//�����жϵ�û�ж���ʱ����һ������
		if(t==null){
			
			t=new Test();
			
		}
		return t;
	}
}
