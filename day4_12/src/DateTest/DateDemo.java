package DateTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*ͨ���޲εĹ��췽�����Ի�õ�ǰʱ��Date();
 * ��ȡ����ֵ
 * ʵ�ֽ�ʱ��ת����������Ҫ�ĸ�ʽ
 * 
 * 
 */

public class DateDemo {

	public static void main(String[] args) throws ParseException {
		
		//����Date����
		Date d=new Date();
		System.out.println(d);
		//����Date����
		Date d1=new Date();
		System.out.println(d1);
		System.out.println(d.compareTo(d1));
		
		System.out.println(d.getTime());
		System.out.println(d1.getTime());
		
		System.out.println(d.toString());;
		
		SimpleDateFormat sdf=new SimpleDateFormat("yy-MM-dd HH:mm:ss");
		
		System.out.println(sdf.format(d1));
		//System.out.println(sdf.parse());
		System.out.println(sdf.toPattern());;
	}
}
