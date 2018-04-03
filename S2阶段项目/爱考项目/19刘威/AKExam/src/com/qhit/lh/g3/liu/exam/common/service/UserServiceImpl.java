/**
 * 
 */
package com.qhit.lh.g3.liu.exam.common.service;

import com.qhit.lh.g3.liu.exam.common.bean.User;
import com.qhit.lh.g3.liu.exam.common.dao.UserDao;
import com.qhit.lh.g3.liu.exam.common.dao.UserDaoImpl;

/**
 * @author liuwei
 *TODO
 * 2018年1月5日下午9:00:07
 */
public class UserServiceImpl implements UserService {
	private UserDao userDao = new UserDaoImpl();

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return userDao.login(user);
	}

}
