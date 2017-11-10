package Demo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Test {
	
	public static void main(String[] args) throws Exception {
		
		//创建客户端对象
		DatagramSocket ds=new DatagramSocket();
		
		//创建传输的字节数组
		String str="你好";
		byte [] buf=str.getBytes();
		int length=buf.length;
		InetAddress address = InetAddress.getByName("192.168.0.255");
		//创建发送数据的文件包对象
		DatagramPacket dp=new DatagramPacket(buf, length, address, 9527);
		//发送数据
		ds.send(dp);
		
		//关闭资源
		ds.close();
	}
}
