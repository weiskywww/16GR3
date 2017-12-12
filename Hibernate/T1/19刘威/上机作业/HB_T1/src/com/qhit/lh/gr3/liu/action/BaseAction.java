/**
 * 
 */
package com.qhit.lh.gr3.liu.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.lh.gr3.liu.bean.User;
import com.qhit.lh.gr3.liu.service.BaseService;
import com.qhit.lh.gr3.liu.service.impl.BaseServiceImpl;

/**
 * @author liuwei
 *TODO
 * 2017年12月11日上午11:04:49
 */
public class BaseAction extends ActionSupport {
	private User user;
	private List<User> users;
	
	private BaseService  baseser = new BaseServiceImpl();
	public String add(){
		baseser.add(user);
		return "adduser";
	}
	public String getAll(String fromObjects){
		users = baseser.getAll(fromObjects);
		return "listuser";
	}
	
	public String update(){
		baseser.update(user);
		return null;
	}
	public String delete(){
		baseser.delete(user);
		return null;
		
	}
	
	
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
}
