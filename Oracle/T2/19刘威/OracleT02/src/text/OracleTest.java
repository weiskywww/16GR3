package text;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import com.liu.oracle.bean.Dept;
import com.liu.oracle.untils.DBmanager;

public class OracleTest {
	
	
	@Test
	public void Select(){
	 Connection  con = DBmanager.getConnection();
	 Dept dept = null;
	 String sql = "select * from dept";
	 try {
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			dept = new Dept(
			rs.getInt("did"),
			rs.getString("dname"),
			rs.getString("tel"),
			rs.getString("ress")
			);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 System.out.println(dept);
	}

}	
