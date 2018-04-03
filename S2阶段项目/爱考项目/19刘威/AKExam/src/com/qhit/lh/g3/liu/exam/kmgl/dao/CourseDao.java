/**
 * 
 */
package com.qhit.lh.g3.liu.exam.kmgl.dao;

import java.util.List;
import java.util.Map;

import com.qhit.lh.g3.liu.exam.kmgl.bean.Course;


/**
 * @author liuwei
 *TODO
 * 2018年1月8日下午10:24:23
 */
public interface CourseDao {
	public List<Course> getCoursesList(Map<String, Object> parameter);
}
