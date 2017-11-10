package cn.it;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {
	
	public static void main(String[] args) {
		
		//获得连接对象
		Connection conn = Demo.getconn();
		//通过连接对象获取操作对象
		PreparedStatement stat=null;
		ResultSet re=null;
		try {
			stat = conn.prepareStatement("select*from t");
			 re = stat.executeQuery();
			//由结果集对象我们循环遍历出我们的数据
			while(re.next()){
				int int1 = re.getInt("id");
				String string = re.getString(2);
				String string2 = re.getString(3);
				//打印语句
				System.out.println(int1+"\t"+string+"\t"+string2);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		通过操作对象我们获得结果集对象
		
		//调用关闭资源的方法
		Demo.Close(conn, stat, re);
	}

}
