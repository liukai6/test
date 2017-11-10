package DateTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*通过无参的构造方法可以获得当前时间Date();
 * 获取毫秒值
 * 实现将时间转换成我们需要的格式
 * 
 * 
 */

public class DateDemo {

	public static void main(String[] args) throws ParseException {
		
		//创建Date对象
		Date d=new Date();
		System.out.println(d);
		//创建Date对象
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
