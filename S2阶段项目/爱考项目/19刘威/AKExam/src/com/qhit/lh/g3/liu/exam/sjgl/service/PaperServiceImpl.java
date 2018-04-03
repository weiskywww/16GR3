/**
 * 
 */
package com.qhit.lh.g3.liu.exam.sjgl.service;

import java.util.Map;

import com.qhit.lh.g3.liu.exam.common.bean.PageBean;
import com.qhit.lh.g3.liu.exam.sjgl.bean.Paper;
import com.qhit.lh.g3.liu.exam.sjgl.dao.PaperDao;
import com.qhit.lh.g3.liu.exam.sjgl.dao.PaperDaoImpl;

/**
 * @author liuwei
 *TODO
 * 2018年3月9日下午3:40:34
 */
public class PaperServiceImpl implements PaperService {
	private PaperDao paperDao = new PaperDaoImpl();
	/* (non-Javadoc)
	 * @see com.qhit.lh.g3.liu.exam.sjgl.dao.PaperDao#getPaperList(com.qhit.lh.g3.liu.exam.common.bean.PageBean, java.util.Map, int)
	 */
	@Override
	public PageBean<Paper> getPaperList(PageBean<Paper> pageBean, Map<String, Object> parameter, int pageIndex) {
		// TODO Auto-generated method stub
		return paperDao.getPaperList(pageBean, parameter, pageIndex);
	}

}
