/**
 * 
 */
package com.qhit.lh.gr3.liu.service.impl;

import java.util.List;

import com.qhit.lh.gr3.liu.bean.User;
import com.qhit.lh.gr3.liu.dao.BaseDao;
import com.qhit.lh.gr3.liu.dao.impl.BaseDaoImpl;
import com.qhit.lh.gr3.liu.service.BaseService;

/**
 * @author liuwei
 *TODO
 * 2017年12月11日上午10:15:18
 */
public class BaseServiceImpl implements BaseService {
	private BaseDao basedao = new BaseDaoImpl();
	/* (non-Javadoc)
	 * @see com.qhit.lh.gr3.liu.service.BaseService#add(java.lang.Object)
	 */
	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		basedao.add(user);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.gr3.liu.service.BaseService#delete(java.lang.Object)
	 */
	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		basedao.delete(user);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.gr3.liu.service.BaseService#update(java.lang.Object)
	 */
	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		basedao.update(user);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.gr3.liu.service.BaseService#getAll()
	 */
	@Override
	public List<User> getAll(String fromObject) {
		// TODO Auto-generated method stub
		return basedao.getAll(fromObject);
	}

}
