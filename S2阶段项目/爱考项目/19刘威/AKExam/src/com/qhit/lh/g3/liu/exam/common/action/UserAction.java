/**
 * 
 */
package com.qhit.lh.g3.liu.exam.common.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.lh.g3.liu.exam.common.bean.User;
import com.qhit.lh.g3.liu.exam.common.service.UserService;
import com.qhit.lh.g3.liu.exam.common.service.UserServiceImpl;


/**
 * @author liuwei
 *TODO
 * 2018年1月7日下午8:59:50
 */
public class UserAction extends ActionSupport {
	private UserService userService = new UserServiceImpl();
	
	private User user;
	
	/**
	 * @return
	 * 登录
	 */
	public String login(){ 
		user = userService.login(user);
		if(user != null){
			//登录成功
			System.out.println(user.toString());
			ServletActionContext.getRequest().getSession().setAttribute("user", user);
			return "loginSuccess";
		}else{
			super.addActionError("登录失败！用户名密码错误!");
			return "loginFail";
		}
	}
	
	/**
	 * @return
	 * 退出
	 */
	public String logout(){
		//获取session对象，并销毁
		ServletActionContext.getRequest().getSession().invalidate();
		return "logout";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
		
}
