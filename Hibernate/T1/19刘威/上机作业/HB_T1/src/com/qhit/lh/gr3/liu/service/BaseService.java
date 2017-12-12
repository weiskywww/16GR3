/**
 * 
 */
package com.qhit.lh.gr3.liu.service;

import java.util.List;

import com.qhit.lh.gr3.liu.bean.User;

/**
 * @author liuwei
 *TODO
 * 2017年12月11日上午10:14:37
 */
public interface BaseService {
	public void delete(User user);
	public void update(User user);
	public List<User> getAll(String fromObjects);
	public void add(User user);
	
}
