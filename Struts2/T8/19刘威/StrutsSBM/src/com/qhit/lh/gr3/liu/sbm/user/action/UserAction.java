package com.qhit.lh.gr3.liu.sbm.user.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.lh.gr3.liu.sbm.user.bean.User;
import com.qhit.lh.gr3.liu.sbm.user.service.UserService;
import com.qhit.lh.gr3.liu.sbm.user.service.impl.UserServiceimpl;

/**
 * @author liuwei
 *TODO
 * 2017年12月10日下午9:59:37
 */
public class UserAction extends ActionSupport {
	private User user;
	private List<User> users = new ArrayList<>();
	
	private File userPhoto;
	private String userPhotoFileName;
	private String userPhotoContentType;	
	
	public UserService userser = new UserServiceimpl();
	
	public String login(){
		try {
			user = userser.doLogin(user.getUserName(), user.getUserPassword());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return SUCCESS;
	}
	public String getAll() throws Exception{
			users = userser.getAll();
			System.out.println("users"+users);
		return "listUser";
	}
	public String Add() throws Exception{
		int row = userser.addUser(user);
		if(row == 0){
			super.addFieldError("addFail", "用户添加失败!");
			return "addFile";
		}
		if(userPhoto!=null){
			try {
				InputStream is = new FileInputStream(userPhoto);
				String path = ServletActionContext.getServletContext().getRealPath("/")+"upload";
				//头像的相对路径
				String pic = "upload/"+userPhotoFileName;
				//设置到user对象中，方便添加用户的时候插入数据
				user.setPic(pic);
				File file = new File(path);
				if(!file.exists()){
					file.mkdirs();
				}
				OutputStream os = new FileOutputStream(path+"/"+userPhotoFileName);
				byte[] b = new byte[8096];
				int len=0;
				try {
					while((len=is.read(b))!=-1){
						os.write(b, 0, len);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					os.flush();
					os.close();
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		return "adduser";
	}
	
	
	public File getUserPhoto() {
		return userPhoto;
	}
	public void setUserPhoto(File userPhoto) {
		this.userPhoto = userPhoto;
	}
	public String getUserPhotoFileName() {
		return userPhotoFileName;
	}
	public void setUserPhotoFileName(String userPhotoFileName) {
		this.userPhotoFileName = userPhotoFileName;
	}
	public String getUserPhotoContentType() {
		return userPhotoContentType;
	}
	public void setUserPhotoContentType(String userPhotoContentType) {
		this.userPhotoContentType = userPhotoContentType;
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
