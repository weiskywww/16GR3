package com.qhit.lh.gr3.liu.sbm.user.dao;


import java.util.List;

import com.qhit.lh.gr3.liu.sbm.user.bean.User;

/**
 * @author liuwei
 *TODO
 * 2017年12月10日下午9:59:52
 */
public interface UserDao {
	
	public User doLogin(String userName,String passWord) throws Exception;
	public List<User> getAll() throws Exception;
	public int addUser(User user) throws Exception;
}
