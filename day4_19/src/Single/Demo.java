package Single;
/*
 * ��һ�ֶ�����
 */
public class Demo {

	
	private  static Demo d=new Demo();
	//˽�л����췽��
	private Demo(){}
	
	//�ṩһ����ȡ���췽���ķ���
	
	public static Demo getDemo(){
		
		return d;
	}
	
	
}
