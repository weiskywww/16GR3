/**
 * 
 */
package com.qhit.lh.gr3.liu.hb.servcie;

import java.util.List;
/**
 * @author liuwei
 *TODO
 * 2017年12月12日下午7:00:56
 */
public interface BaseService {
	/**
	 * @param obj
	 * 增
	 */
	public void add(Object obj);
	
	/**
	 * @param obj
	 * 删
	 */
	public void delete(Object obj);
	
	/**
	 * @param obj
	 * 改
	 */
	public void update(Object obj);
	
	/**
	 * 查
	 */
	public List<Object> getAll(String fromObject);
	
	public Object getObjectById(Object obj, int id);
}
