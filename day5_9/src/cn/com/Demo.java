package cn.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import com.mysql.jdbc.Driver;

public class Demo {
	@Test
	public  void DeDemo() throws ClassNotFoundException, SQLException {
		
		//ע������
		Class.forName("com.mysql.jdbc.Driver");
		
		//������Ӷ���
		Connection conn=DriverManager.getConnection("jdbc:mysql:///demo", "root", "root");
		
		//���ݲ������ַ���
		String sql="delete from t where id=?";
		//������ݿ��������
		PreparedStatement prp = conn.prepareStatement(sql);
		
//		ͨ��������ֵ���ݽ�ȥ
		prp.setInt(1, 2);
		
		//ִ��
		int up = prp.executeUpdate();
		
		//ִ�з������Ƿ���ĳɹ�
		if(up>0){
			System.out.println("ɾ���ɹ�");
		}else{
			System.out.println("ɾ��ʧ��");
		}
		//�ͷ���Դ
		prp.close();
		conn.close();
		
	}
	@Test
	public void InDemo() throws Exception{
		
		//��������Ҫע������
		Class.forName("com.mysql.jdbc.Driver");
		
//		������Ӷ���
		Connection conn = DriverManager.getConnection("jdbc:mysql:///demo", "root", "root");
		
		//�����ݽ��еľ������
		String sql="insert into t values(?,?,?)";
		
		//ͨ�����Ӷ����ȡ���ݿ��������
		PreparedStatement pstat = conn.prepareStatement(sql);
		
		//ͨ����õĶ�����������ֵ
		pstat.setInt(1, 5);
		pstat.setString(2, "tom");
		pstat.setString(3, "159");
		
		//��ֵ���ݽ�ȥ
		int up = pstat.executeUpdate();
		
		//�ж��Ƿ����ӳɹ�
		if(up>0){
			System.out.println("��ӳɹ�");
		}else{
			System.out.println("���ʧ��");
		}
		
		//�ͷ���Դ
		pstat.close();
		conn.close();
		
	}
	@Test
	public void UpDemo11() throws Exception{
		
		//ע������
		Class.forName("com.mysql.jdbc.Driver");
		
		//����������ݿ����
		Connection conn = DriverManager.getConnection("jdbc:mysql:///demo", "root", "root");
		
		//ͨ�������ò������ݿ����
		PreparedStatement pstat = conn.prepareStatement("update t set password=? where password=?");
		
		//д��Ҫ�޸ĵ�����
		pstat.setString(1, "123");
		pstat.setString(2, "56464");
		
		//������д�����ݿ���
		int up = pstat.executeUpdate();
		
		//�ж��Ƿ��޸�
		if(up>0){
			System.out.println("�����޸���");
		}else{
			System.out.println("����û���޸�");
			
		}
		//�ͷ���Դ
		pstat.close();
		conn.close();
		
		
		
	}
	@Test
	public void SeDemo() throws Exception{
		
		//ע������
		Class.forName("com.mysql.jdbc.Driver");
		
		//��ȡ���ݿ����Ӷ���
		Connection conn = DriverManager.getConnection("jdbc:mysql:///demo", "root", "root");
		//���ݿ����������
		String sql="select*from t where id=?";
		//ͨ�����Ӷ����ȡ��������
		PreparedStatement pstat = conn.prepareStatement(sql);
		pstat.setInt(1, 1);
		//�����ݴ��ݽ�ȥ
		ResultSet res = pstat.executeQuery();
//		��ȡ����
		while(res.next()){
			
			res.getInt(1);
			res.getString(2);
			res.getString(3);
			System.out.println(res.getInt(1)+res.getString(2)+res.getString(3));
		}
//		�ر���Դ
		res.close();
		pstat.close();
		conn.close();
		
	}
	
	
}
