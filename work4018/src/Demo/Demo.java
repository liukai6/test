package Demo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class   Demo{
	
	public static void main(String[] args) throws Exception {
			
		
		//�������ܵĶ���
		DatagramSocket ds=new DatagramSocket(9527);
		while(true){
		//��������
		byte [] buf=new byte[1024];
		int length=buf.length;
		//�����������ݵı�����
		DatagramPacket dp=new DatagramPacket(buf, length);
		//��������
		ds.receive(dp);
		byte [] b=dp.getData();
		System.out.println(new String(b));
		}
	}

}
