package cn.it;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.sql.DataSource;

/*连接池的创建
 * 
 */

public class DemoBool implements DataSource{
	Connection conn=null;
	List<Connection> list=new ArrayList<Connection>();
	//构造方法
	public DemoBool(){
		//循环创建出连接对象来
		for(int i=1;i<=5;i++){
			//调用方法获得连接对象
			 conn = Demo.getconn();
			 //把我们创建的对象放入到list集合中去
			 list.add(conn);
		}
	}
	//创建一个获得对象的方法
	public Connection getConnection() throws SQLException {
		//进行判断我们的连接池中是否还有对象
		if(list.size()==0){
			//如果没有对象我们就再创建5个对象来候选
			for(int i=1;i<=5;i++){
				//调用方法获得连接对象
				 conn = Demo.getconn();
				 list.add(conn);
			}
		}
		 Connection con = list.remove(0);
		return con;
	}

	//创建一个归还连接对象的方法
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
