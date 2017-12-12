/**
 * 
 */
package com.qhit.lh.gr3.liu.dao;

import java.util.List;

import com.qhit.lh.gr3.liu.bean.User;


/**
 * @author liuwei
 *TODO
 * 2017年12月11日上午10:15:46
 */
public interface BaseDao {
	public void add(User user);
	public void delete(User user);
	public void update(User user);
	public List<User> getAll(String fromObject);
}
