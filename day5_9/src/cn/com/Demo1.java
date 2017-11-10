package cn.com;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

public class Demo1 {
//��ѯ
	@Test
	public void SeDemo() throws Exception{
		
		//ע������
		Class.forName("com.mysql.jdbc.Driver");
		//������ݿ����Ӷ���
		Connection conn = DriverManager.getConnection("jdbc:mysql:///demo", "root", "root");
		//ͨ�����ݿ����Ӷ����ȡ��������
		PreparedStatement stat= conn.prepareStatement("select *from t");
		//ͨ�����������ȡ���������
		ResultSet re = stat.executeQuery();
		//ѭ��������������Ҫ������
		while(re.next()){
			int re1 = re.getInt(1);
			String re2 = re.getString(2);
			String re3= re.getString(3);
		
			System.out.println(re1+"\t"+re2+"\t"+re3);

		}
		//�ر���Դ
		re.close();
		stat.close();
		conn.close();

	}
	//ɾ��
	@Test
	public void DeDemo() throws Exception{
		
		//ע������
		Class.forName("com.mysql.jdbc.Driver");
		//�������ݿ����Ӷ���
		Connection conn = DriverManager.getConnection("jdbc:mysql:///demo", "root","root");
		//ͨ�����Ӷ����ȡ�������ݿ����
		PreparedStatement stat = conn.prepareStatement("delete from t where id=?");
		//�������
		stat.setInt(1, 4);
		//ִ��
		int eup = stat.executeUpdate();
		//�ж��Ƿ�����ɹ�
		if(eup>0){
			System.out.println("ɾ���ɹ�");
		}else{
			System.out.println("ɾ��ʧ��");
		}
		//�ر���Դ
		stat.close();
		conn.close();
	}
//	�޸�
	@Test
	public void UpDemo() throws Exception{
		
		//ע������
		Class.forName("com.mysql.jdbc.Driver");
		//�������ݿ����Ӷ���
		Connection conn = DriverManager.getConnection("jdbc:mysql:///demo", "root", "root");
		//ͨ�����Ӷ����ȡ��������
		PreparedStatement stat = conn.prepareStatement("update t set username=? where id=?");
		//����ֵ
		stat.setString(1, "liyonghui");
		stat.setInt(2, 1);
		//���в�������
		int up = stat.executeUpdate();
		//�ظ��Ƿ�����ɹ�
		if(up>0){
			System.out.println("�޸ĳɹ�");
		}else{
			System.out.println("�޸�ʧ��");
		}
//		�ر���Դ
		stat.close();
		conn.close();
	}
	//����
	@Test
	public void InDemo() {
		Connection conn=null;
		PreparedStatement  stat=null;
		//ע������
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//��ȡ���ݿ����Ӷ���
			conn = DriverManager.getConnection("jdbc:mysql:///demo", "root", "root");
			//ͨ�����Ӷ����ȡ��������
			stat = conn.prepareStatement("insert into t (id,password) values (?,?)");
			//����ֵ
			stat.setInt(1,7);
			stat.setString(2, "456789889797979");
			//�������ݿ�
			int up = stat.executeUpdate();
			//��ʾ�Ƿ�ɹ�
			if(up>0){
				System.out.println("���ӳɹ�");
			}else{
				System.out.println("����ʧ��");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//�ر���Դ
			if(stat!=null){
				try {
					stat.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
			if(conn!=null){
				
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		}
	
	
		
	}
}
