/**
 * 
 */
package com.qhit.lh.g3.liu.exam.kmgl.service;

import java.util.List;
import java.util.Map;

import com.qhit.lh.g3.liu.exam.kmgl.bean.Course;
import com.qhit.lh.g3.liu.exam.kmgl.dao.CourseDao;
import com.qhit.lh.g3.liu.exam.kmgl.dao.CourseDaoImpl;

/**
 * @author liuwei
 *TODO
 * 2018年1月8日下午10:25:28
 */
public class CourseServiceImpl implements CourseService {
	private CourseDao couserdao = new CourseDaoImpl();
	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.jay.exam.kmgl.dao.CourseDao#getCoursesList(java.util.Map)
	 */
	@Override
	public List<Course> getCoursesList(Map<String, Object> parameter) {
		// TODO Auto-generated method stub
		return couserdao.getCoursesList(parameter);
	}

}
