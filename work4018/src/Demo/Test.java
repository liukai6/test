package Demo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Test {
	
	public static void main(String[] args) throws Exception {
		
		//�����ͻ��˶���
		DatagramSocket ds=new DatagramSocket();
		
		//����������ֽ�����
		String str="���";
		byte [] buf=str.getBytes();
		int length=buf.length;
		InetAddress address = InetAddress.getByName("192.168.0.255");
		//�����������ݵ��ļ�������
		DatagramPacket dp=new DatagramPacket(buf, length, address, 9527);
		//��������
		ds.send(dp);
		
		//�ر���Դ
		ds.close();
	}
}
