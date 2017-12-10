package com.qhit.lh.gr3.liu.sbm.user.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.qhit.lh.gr3.liu.sbm.untils.DBManager;
import com.qhit.lh.gr3.liu.sbm.user.bean.User;
import com.qhit.lh.gr3.liu.sbm.user.dao.UserDao;


/**
 * @author liuwei
 *TODO
 * 2017年12月10日下午9:59:58
 */
public class UserDaoimpl implements UserDao {
	
	private Connection  con = null;
	private PreparedStatement ps = null;
	private User user = null;
	
	public User doLogin(String userName, String userPassword) throws Exception {
		con = DBManager.getConnection();
		String sql = "select * from tb_user where userName = ? and userPassword = ?"; 
			ps  = con .prepareStatement(sql);
			ps.setString(1, userName);
			ps.setString(2, userPassword);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				user = new User(
						rs.getInt("userId"), 
						rs.getString("userName"), 
						rs.getString("userPassword"), 
						rs.getString("userSex"), 
						rs.getInt("userAge"), 
						rs.getString("telephone"), 
						rs.getString("address"), 
						rs.getString("pic"), 
						rs.getInt("type"));
			}
			DBManager.close(ps, con);
		return user;
	}
	public List<User> getAll() throws Exception {
		List<User> users = new ArrayList<>();
		User user = null;
		con = DBManager.getConnection();
		String sql = "select * from tb_user";
		ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			user = new User(
					rs.getInt("userId"), 
					rs.getString("userName"), 
					rs.getString("userPassword"), 
					rs.getString("userSex"), 
					rs.getInt("userAge"), 
					rs.getString("telephone"), 
					rs.getString("address"), 
					rs.getString("pic"), 
					rs.getInt("type"));
			users.add(user);
		}
		return users;
	}
	@Override
	public int addUser(User user) throws Exception {
		con = DBManager.getConnection();
		String sql = "insert into tb_user values (?,?,?,?,?,?,?,?)";
		ps = con.prepareStatement(sql);
		ps.setString(1, user.getUserName());
		ps.setString(2, user.getUserPassword());
		ps.setString(3, user.getUserSex());
		ps.setInt(4, user.getUserAge());
		ps.setString(5, user.getTelephone());
		ps.setString(6, user.getAddress());
		ps.setString(7, user.getPic());
		ps.setInt(8, user.getType());
		return ps.executeUpdate();
	}

}
