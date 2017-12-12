/**
 * 
 */
package com.qhit.lh.gr3.liu.hb;

import org.junit.Test;

import com.qhit.lh.gr3.liu.hb.bean.Type;
import com.qhit.lh.gr3.liu.hb.bean.User;
import com.qhit.lh.gr3.liu.hb.servcie.BaseService;
import com.qhit.lh.gr3.liu.hb.servcie.impl.BaseServiceImpl;

/**
 * @author liuwei
 *TODO
 * 2017年12月12日下午8:06:19
 */
public class text {
	private BaseService baseser = new BaseServiceImpl();
	@Test
	public void add() {
		User user = new User();
		
		user.setUname("dage");
		user.setUpassword("12345");
		user.setBirthday("2013-09-07");
		user.setSex("m");
		user.setEnable(0);
		
		Type type = new Type();
		type.setType("leibie");
		type.setNumber("12345");
		
		user.setType(type);
		type.setUser(user);
		baseser.add(user);
	}
	public void delete(){
		
		User user = new User();
		user.setUid(1);
		baseser.delete(user);;
		
	}
	public void update(){
		User user = new User();
		user.setUid(1);
		user.setUname("1`11");
		user.setUpassword("12312");
		
		user.setBirthday("1997-06-08");
		user.setSex("s");
		
		baseser.update(user);
	}
}
