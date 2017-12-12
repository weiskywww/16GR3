/**
 * 
 */
package com.qhit.lh.gr3.liu.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.gr3.liu.bean.User;
import com.qhit.lh.gr3.liu.dao.BaseDao;
import com.qhit.lh.gr3.liu.untils.HibernateSessionFactory;

/**
 * @author liuwei
 *TODO
 * 2017年12月11日上午10:16:18
 */
public class BaseDaoImpl implements BaseDao {

	/* (non-Javadoc)
	 * @see com.qhit.lh.gr3.liu.dao.BaseDao#add(java.lang.Object)
	 */
	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		session.save(user);
		tx.commit();
		HibernateSessionFactory.closeSession();
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.gr3.liu.dao.BaseDao#delete(java.lang.Object)
	 */
	@Override
	public void delete(User user) {
		//1,获取session对象
				Session session = HibernateSessionFactory.getSession();
				//2，开启事务
				Transaction ts = session.beginTransaction();
				//3，执行
				session.delete(user);
				//4,提交事务
				ts.commit();
				//5，释放资源
				HibernateSessionFactory.closeSession();
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.gr3.liu.dao.BaseDao#update(java.lang.Object)
	 */
	@Override
	public void update(User user) {
		//1,获取session对象
				Session session = HibernateSessionFactory.getSession();
				//2，开启事务
				Transaction ts = session.beginTransaction();
				//3，执行
				session.update(user);
				//4,提交事务
				ts.commit();
				//5，释放资源
				HibernateSessionFactory.closeSession();
		
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.gr3.liu.dao.BaseDao#getAll()
	 */
	@Override
	public List<User> getAll(String fromObject) {
		List<User> list =null;
		
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		
		Query query = session.createQuery(fromObject);
		list = query.list();
		tx.commit();
		HibernateSessionFactory.closeSession();
		return list;
	}

}
