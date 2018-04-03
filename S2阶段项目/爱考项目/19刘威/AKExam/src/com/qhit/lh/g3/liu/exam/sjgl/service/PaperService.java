/**
 * 
 */
package com.qhit.lh.g3.liu.exam.sjgl.service;

import java.util.Map;

import com.qhit.lh.g3.liu.exam.common.bean.PageBean;
import com.qhit.lh.g3.liu.exam.sjgl.bean.Paper;

/**
 * @author liuwei
 *TODO
 * 2018年3月9日下午3:39:56
 */
public interface PaperService {
	public PageBean<Paper> getPaperList(PageBean<Paper> pageBean, Map<String, Object> parameter, int pageIndex);
}
