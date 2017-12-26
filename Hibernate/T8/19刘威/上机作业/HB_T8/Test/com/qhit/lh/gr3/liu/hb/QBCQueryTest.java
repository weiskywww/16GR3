/**
 * 
 */
package com.qhit.lh.gr3.liu.hb;


import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.util.net.SSLSupport.CipherData;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;

import com.qhit.lh.gr3.liu.hb.bean.User;
import com.qhit.lh.gr3.liu.hb.untils.HibernateSessionFactory;

/**
 * @author liuwei
 *TODO
 * 2017年12月25日下午9:03:55
 */
public class QBCQueryTest {
	@Test
	public void query(){
		Session session = HibernateSessionFactory.getSession();
		Criteria criteria = session.createCriteria(User.class)
										.add(Restrictions.like("uname", "%z%"));
		ProjectionList projectionList = Projections.projectionList()
										.add(Projections.property("sex"))
										.add(Projections.property("brithday"))
										.add(Projections.property("uname"));
		criteria.setProjection(projectionList);
		List<User> list = criteria.list();
		for(User u: list){
			System.out.println(u.getUname()+u.getBirthday()+u.getSex());
		}
	}
	@Test
	 	public void login() {
	 		 //1，获取session对象
	 	Session session = HibernateSessionFactory.getSession();
	 		//2，通过session对象创建criteria条件查询器
	 		Criteria criteria = session.createCriteria(User.class)
	 			 .add(Restrictions.eq("uname", "zhangli"))
	 			 .add(Restrictions.eq("upassword","123456"));
	 		//3，通过criteria条件查询器进行查询
	 		List<User> list = criteria.list();
	 		//4，遍历输出
	 		if(list != null && list.size() > 0){
	 			System.out.println("登录成功");
	 		}else{
	 			System.out.println("登陆失败");
	 		}
	 	}
}
