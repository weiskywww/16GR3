/**
 * 
 */
package com.qhit.lh.gr3.liu.hb.bean;

/**
 * @author liuwei
 *TODO
 * 2017年12月12日下午8:30:00
 */
public class Type {
	private int uid;
	private String type;
	private String number;
	
	private User user;
	
	public Type(int uid, String type, String number) {
		super();
		this.uid = uid;
		this.type = type;
		this.number = number;
	}
	public Type() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
}
