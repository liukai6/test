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
		
		//注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		
		//获得连接对象
		Connection conn=DriverManager.getConnection("jdbc:mysql:///demo", "root", "root");
		
		//数据操作的字符串
		String sql="delete from t where id=?";
		//获得数据库操作对象
		PreparedStatement prp = conn.prepareStatement(sql);
		
//		通过方法将值传递进去
		prp.setInt(1, 2);
		
		//执行
		int up = prp.executeUpdate();
		
		//执行方法看是否更改成功
		if(up>0){
			System.out.println("删除成功");
		}else{
			System.out.println("删除失败");
		}
		//释放资源
		prp.close();
		conn.close();
		
	}
	@Test
	public void InDemo() throws Exception{
		
		//首先我们要注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		
//		获得连接对象
		Connection conn = DriverManager.getConnection("jdbc:mysql:///demo", "root", "root");
		
		//对数据进行的具体操作
		String sql="insert into t values(?,?,?)";
		
		//通过连接对象获取数据库操作对象
		PreparedStatement pstat = conn.prepareStatement(sql);
		
		//通过获得的对象向输送数值
		pstat.setInt(1, 5);
		pstat.setString(2, "tom");
		pstat.setString(3, "159");
		
		//将值传递进去
		int up = pstat.executeUpdate();
		
		//判断是否增加成功
		if(up>0){
			System.out.println("添加成功");
		}else{
			System.out.println("添加失败");
		}
		
		//释放资源
		pstat.close();
		conn.close();
		
	}
	@Test
	public void UpDemo11() throws Exception{
		
		//注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		
		//获得连接数据库对象
		Connection conn = DriverManager.getConnection("jdbc:mysql:///demo", "root", "root");
		
		//通过对象获得操作数据库对象
		PreparedStatement pstat = conn.prepareStatement("update t set password=? where password=?");
		
		//写入要修改的数据
		pstat.setString(1, "123");
		pstat.setString(2, "56464");
		
		//将输入写入数据库中
		int up = pstat.executeUpdate();
		
		//判断是否修改
		if(up>0){
			System.out.println("数据修改了");
		}else{
			System.out.println("数据没有修改");
			
		}
		//释放资源
		pstat.close();
		conn.close();
		
		
		
	}
	@Test
	public void SeDemo() throws Exception{
		
		//注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		
		//获取数据库连接对象
		Connection conn = DriverManager.getConnection("jdbc:mysql:///demo", "root", "root");
		//数据库操作的内容
		String sql="select*from t where id=?";
		//通过连接对象获取操作对象
		PreparedStatement pstat = conn.prepareStatement(sql);
		pstat.setInt(1, 1);
		//将数据传递进去
		ResultSet res = pstat.executeQuery();
//		读取数据
		while(res.next()){
			
			res.getInt(1);
			res.getString(2);
			res.getString(3);
			System.out.println(res.getInt(1)+res.getString(2)+res.getString(3));
		}
//		关闭资源
		res.close();
		pstat.close();
		conn.close();
		
	}
	
	
}
