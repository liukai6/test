package cn.it;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.sql.DataSource;

/*���ӳصĴ���
 * 
 */

public class DemoBool implements DataSource{
	Connection conn=null;
	List<Connection> list=new ArrayList<Connection>();
	//���췽��
	public DemoBool(){
		//ѭ�����������Ӷ�����
		for(int i=1;i<=5;i++){
			//���÷���������Ӷ���
			 conn = Demo.getconn();
			 //�����Ǵ����Ķ�����뵽list������ȥ
			 list.add(conn);
		}
	}
	//����һ����ö���ķ���
	public Connection getConnection() throws SQLException {
		//�����ж����ǵ����ӳ����Ƿ��ж���
		if(list.size()==0){
			//���û�ж������Ǿ��ٴ���5����������ѡ
			for(int i=1;i<=5;i++){
				//���÷���������Ӷ���
				 conn = Demo.getconn();
				 list.add(conn);
			}
		}
		 Connection con = list.remove(0);
		return con;
	}

	//����һ���黹���Ӷ���ķ���
	public void Return(Connection c){
		
		list.add(c);
		
	}
	public PrintWriter getLogWriter() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	public void setLogWriter(PrintWriter out) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	public void setLoginTimeout(int seconds) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	public int getLoginTimeout() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}
	public <T> T unwrap(Class<T> iface) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}
	public Connection getConnection(String username, String password) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
