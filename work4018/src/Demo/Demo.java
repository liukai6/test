package Demo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class   Demo{
	
	public static void main(String[] args) throws Exception {
			
		
		//创建接受的对象
		DatagramSocket ds=new DatagramSocket(9527);
		while(true){
		//创建数组
		byte [] buf=new byte[1024];
		int length=buf.length;
		//创建接受数据的保对象
		DatagramPacket dp=new DatagramPacket(buf, length);
		//接受数据
		ds.receive(dp);
		byte [] b=dp.getData();
		System.out.println(new String(b));
		}
	}

}
