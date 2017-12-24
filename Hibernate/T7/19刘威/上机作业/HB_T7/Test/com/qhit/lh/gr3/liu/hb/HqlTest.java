/**
 * 
 */
package com.qhit.lh.gr3.liu.hb;

import java.util.List;

import org.junit.Test;

import com.qhit.lh.gr3.liu.hb.bean.User;
import com.qhit.lh.gr3.liu.hb.servcie.BaseService;
import com.qhit.lh.gr3.liu.hb.servcie.impl.BaseServiceImpl;

/**
 * @author liuwei
 *TODO
 * 2017年12月24日下午8:51:53
 */
public class HqlTest {   
	
	private BaseService baseser = new BaseServiceImpl();
	@Test    
	public void hql(){
		List<User> list =  baseser.getEmpByName( "from User" );
			for (Object object : list) {
			User user = (User) object;
			System.out.println(user.toString());
	}

	}
}
