/**
 * 
 */
package com.qhit.lh.gr3.liu.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author liuwei
 * TODO
 *2017年12月6日上午8:44:12
 */
class UserAction extends ActionSupport {
	private User user;
	
	
	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#validate()
	 */
	@Override
	public void validate() {
		// TODO Auto-generated method stub
		if("".equals(user.getUsername())){
			addFieldError("user.username", getText("username.required"));
		}
		if("".equals(user.getPassword())){
			addFieldError("user.password", getText("password.required"));
		}
	}

	public String login(){
		return SUCCESS;
	}
	
	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
	
	
}
