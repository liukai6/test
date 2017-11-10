package cn.com;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

public class Demo1 {
//查询
	@Test
	public void SeDemo() throws Exception{
		
		//注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//获得数据库连接对象
		Connection conn = DriverManager.getConnection("jdbc:mysql:///demo", "root", "root");
		//通过数据库连接对象获取操作对象
		PreparedStatement stat= conn.prepareStatement("select *from t");
		//通过操作对象获取结果集对象
		ResultSet re = stat.executeQuery();
		//循环遍历出我们需要的数据
		while(re.next()){
			int re1 = re.getInt(1);
			String re2 = re.getString(2);
			String re3= re.getString(3);
		
			System.out.println(re1+"\t"+re2+"\t"+re3);

		}
		//关闭资源
		re.close();
		stat.close();
		conn.close();

	}
	//删除
	@Test
	public void DeDemo() throws Exception{
		
		//注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//创建数据库连接对象
		Connection conn = DriverManager.getConnection("jdbc:mysql:///demo", "root","root");
		//通过连接对象获取操作数据库对象
		PreparedStatement stat = conn.prepareStatement("delete from t where id=?");
		//添加数据
		stat.setInt(1, 4);
		//执行
		int eup = stat.executeUpdate();
		//判断是否操作成功
		if(eup>0){
			System.out.println("删除成功");
		}else{
			System.out.println("删除失败");
		}
		//关闭资源
		stat.close();
		conn.close();
	}
//	修改
	@Test
	public void UpDemo() throws Exception{
		
		//注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//创建数据库连接对象
		Connection conn = DriverManager.getConnection("jdbc:mysql:///demo", "root", "root");
		//通过连接对象获取操作对象
		PreparedStatement stat = conn.prepareStatement("update t set username=? where id=?");
		//设置值
		stat.setString(1, "liyonghui");
		stat.setInt(2, 1);
		//进行操作处理
		int up = stat.executeUpdate();
		//回复是否操作成功
		if(up>0){
			System.out.println("修改成功");
		}else{
			System.out.println("修改失败");
		}
//		关闭资源
		stat.close();
		conn.close();
	}
	//增加
	@Test
	public void InDemo() {
		Connection conn=null;
		PreparedStatement  stat=null;
		//注册驱动
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//获取数据库连接对象
			conn = DriverManager.getConnection("jdbc:mysql:///demo", "root", "root");
			//通过连接对象获取操作对象
			stat = conn.prepareStatement("insert into t (id,password) values (?,?)");
			//设置值
			stat.setInt(1,7);
			stat.setString(2, "456789889797979");
			//操作数据库
			int up = stat.executeUpdate();
			//显示是否成功
			if(up>0){
				System.out.println("增加成功");
			}else{
				System.out.println("增加失败");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//关闭资源
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
