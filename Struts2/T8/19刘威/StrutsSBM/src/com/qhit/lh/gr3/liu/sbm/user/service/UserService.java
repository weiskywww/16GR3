package com.qhit.lh.gr3.liu.sbm.user.service;

import java.util.List;

import com.qhit.lh.gr3.liu.sbm.user.bean.User;

/**
 * @author liuwei
 *TODO
 * 2017年12月10日下午10:00:07
 */
public interface UserService {
 
	public User doLogin(String userName,String userPassword) throws Exception;
	public List<User> getAll() throws Exception; 
	public int addUser(User user) throws Exception;
}
