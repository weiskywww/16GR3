package com.qhit.lh.gr3.liu.sbm.user.service.impl;

import java.util.List;

import com.qhit.lh.gr3.liu.sbm.user.bean.User;
import com.qhit.lh.gr3.liu.sbm.user.dao.UserDao;
import com.qhit.lh.gr3.liu.sbm.user.dao.impl.UserDaoimpl;
import com.qhit.lh.gr3.liu.sbm.user.service.UserService;

/**
 * @author liuwei
 *TODO
 * 2017年12月10日下午10:00:13
 */
public class UserServiceimpl implements UserService {
	private UserDao udao = new UserDaoimpl();
	@Override
	public User doLogin(String userName, String userPassword) throws Exception {
		// TODO Auto-generated method stub
		return udao.doLogin(userName, userPassword);
	}
	@Override
	public List<User> getAll() throws Exception {
		// TODO Auto-generated method stub
		return udao.getAll();
	}
	@Override
	public int addUser(User user) throws Exception {
		// TODO Auto-generated method stub
		return udao.addUser(user);
	}
	 
}
