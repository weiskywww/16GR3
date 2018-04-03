/**
 * 
 */
package com.qhit.lh.g3.liu.exam.common.dao;

import org.hibernate.Session;

import com.qhit.lh.g3.liu.exam.common.utils.HibernateSessionFactory;


/**
 * @author liuwei
 *TODO
 * 2018年1月5日下午9:00:07
 */
public class BaseDao {

	public Session getSession(){
		return HibernateSessionFactory.getSession();
	}
}
