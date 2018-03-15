package com.liu.oracle.bean;

public class Dept {
	private int did;
	private String dname;
	private String tel;
	private String ress;
	
	public Dept(int did, String dname, String tel, String ress) {
		super();
		this.did = did;
		this.dname = dname;
		this.tel = tel;
		this.ress = ress;
	}
	
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getRess() {
		return ress;
	}
	public void setRess(String ress) {
		this.ress = ress;
	}

	@Override
	public String toString() {
		return "Dept [did=" + did + ", dname=" + dname + ", tel=" + tel + ", ress=" + ress + "]";
	}
	
	
}
