package com.qhit.lh.gr3.liu.hb.bean;

/**
 * @author liuwei
 *TODO
 * 2017年12月11日上午9:38:58
 */
public class User {
	private int uid;
	private String uname;
	private String upassword;
	private String birthday;
	private String sex;
	private int enable;
	
	private Type type;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public User(int uid, String uname, String upassword, String birthday, String sex, int enable, Type type) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upassword = upassword;
		this.birthday = birthday;
		this.sex = sex;
		this.enable = enable;
		this.type = type;
	}


	public User(int uid, String uname, String upassword, String birthday, String sex, int enable) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upassword = upassword;
		this.birthday = birthday;
		this.sex = sex;
		this.enable = enable;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getEnable() {
		return enable;
	}
	public void setEnable(int enable) {
		this.enable = enable;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	
	
	 
}
