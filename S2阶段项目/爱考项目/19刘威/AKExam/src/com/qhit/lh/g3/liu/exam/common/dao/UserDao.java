/**
 * 
 */
package com.qhit.lh.g3.liu.exam.common.dao;

import com.qhit.lh.g3.liu.exam.common.bean.User;

/**
 * @author liuwei
 *TODO
 * 2018年1月5日下午9:00:07
 */
public interface UserDao {
	/**
	 * @param user
	 * @return
	 * 登录
	 */
	public User login(User user);
}
