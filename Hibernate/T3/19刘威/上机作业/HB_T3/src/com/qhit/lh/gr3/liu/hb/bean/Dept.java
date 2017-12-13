/**
 * 
 */
package com.qhit.lh.gr3.liu.hb.bean;

/**
 * @author liuwei
 *TODO
 * 2017年12月13日上午10:17:39
 */
public class Dept {
	private int oid;
	private String deptname;
	private String address;
	
	private User user;

	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dept(int oid, String deptname, String address, User user) {
		super();
		this.oid = oid;
		this.deptname = deptname;
		this.address = address;
		this.user = user;
	}

	public Dept(int oid, String deptname, String address) {
		super();
		this.oid = oid;
		this.deptname = deptname;
		this.address = address;
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
