/**
 * 
 */
package com.qhit.lh.g3.liu.exam.kmgl.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.lh.g3.liu.exam.kmgl.bean.Course;
import com.qhit.lh.g3.liu.exam.kmgl.service.CourseService;
import com.qhit.lh.g3.liu.exam.kmgl.service.CourseServiceImpl;
/**
 * @author liuwei
 *TODO
 * 2018年1月8日下午10:24:07
 */
public class CourseAction extends ActionSupport {
	private static final long serialVersionUID = 5352074026213567264L;
	private CourseService courseService = new CourseServiceImpl();
	private List<Course> listCourses = new ArrayList<>();
	private Course course;//课程
	public String getCourses2Json(){
		Map<String, Object> parameter = new HashMap<>();
		if(course != null){
			parameter.put("major", course.getMajor());
			parameter.put("stage", course.getStage());
		}
		listCourses = courseService.getCoursesList(parameter);
		System.out.println("异步请求:"+listCourses.size());
		return "listCourseJson";
	}
	public List<Course> getListCourses() {
		return listCourses;
	}
	public void setListCourses(List<Course> listCourses) {
		this.listCourses = listCourses;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
	
}
