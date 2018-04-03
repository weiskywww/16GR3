package com.qhit.lh.g3.liu.exam.tkgl.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.lh.g3.liu.exam.common.bean.PageBean;
import com.qhit.lh.g3.liu.exam.kmgl.bean.Course;
import com.qhit.lh.g3.liu.exam.tkgl.bean.WrittenQuestion;
import com.qhit.lh.g3.liu.exam.tkgl.service.QuestionService;
import com.qhit.lh.g3.liu.exam.tkgl.service.QuestionServiceImpl;

public class QuestionAction extends ActionSupport {
	private QuestionService questionService = new QuestionServiceImpl();
	private Course course;
	private String major;//专业方向
	private String stage;//阶段
	private WrittenQuestion writtenQuestion;//笔试题对象
	private int pageIndex = 1;//指定页,初始化为1
	private List<Course> listCourses = new ArrayList<>();
	private PageBean<WrittenQuestion> pageBean = new PageBean<>();
	private List<WrittenQuestion> listWQuestions = new ArrayList<>();
	private int radioEasyMax,radioNormalMax,radioDiffMax,cbEasyMax,cbNormalMax,cbDiffMax;
	public String getCourseInfo(){
		//设置参数
		Map<String, String> parameter = new HashMap<>();
		if(major != null && !"".equals(major)){
			parameter.put("major", major);
		}
		if(stage != null && !"".equals(stage)){
			parameter.put("stage", stage);
		}
		//查询题库列表数据
		listCourses = questionService.getCourseInfo(parameter);
		System.out.println(listCourses.size());
		return "listCourse";
	}
	
	public String getQuestionMax(){
		radioEasyMax = questionService.getQuestionsMax(writtenQuestion.getCsId(), "单选", "简单");
		radioNormalMax = questionService.getQuestionsMax(writtenQuestion.getCsId(), "单选", "一般");
		radioDiffMax = questionService.getQuestionsMax(writtenQuestion.getCsId(), "单选", "困难");
		cbEasyMax = questionService.getQuestionsMax(writtenQuestion.getCsId(), "多选", "简单");
		cbNormalMax = questionService.getQuestionsMax(writtenQuestion.getCsId(), "多选", "一般");
		cbDiffMax = questionService.getQuestionsMax(writtenQuestion.getCsId(), "多选", "困难");
		
		return "getQuestionMax";
	}
	/**
	 * @return
	 * 获取试题列表
	 */
		public String getWrittenList(){
			pageBean = questionService.getWrittenList(pageBean, course, pageIndex);
			System.out.println("数据大小:"+pageBean.getItems().size());
			return "listWritten";
		}
		
		/**
		 * @return
		 * 添加笔试题
		 */
		public String addWrittenQuestion(){
			System.out.println(writtenQuestion.getCsId());
			//设置课程试题的关联
			writtenQuestion.setCourse(course);
			
			questionService.addWrittenQuestion(writtenQuestion);
			return "addWrittenQuestion";
		}
		/**
		 * @return
		 * 根据试题编号查询试题对象
		 */
		public String getWrittenQuestionById(){
			writtenQuestion = questionService.getWrittenQuestionById(writtenQuestion);
			return "getWrittenQuestionById";
		}
		
		public String updateWrittenQuestion(){
			//设置关联
			writtenQuestion.setCourse(course);
			
			questionService.updateWrittenQuestion(writtenQuestion);
			return "updateWrittenQuestion";
		}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}



	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public List<Course> getListCourses() {
		return listCourses;
	}

	public void setListCourses(List<Course> listCourses) {
		this.listCourses = listCourses;
	}

	public WrittenQuestion getWrittenQuestion() {
		return writtenQuestion;
	}

	public void setWrittenQuestion(WrittenQuestion writtenQuestion) {
		this.writtenQuestion = writtenQuestion;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public PageBean<WrittenQuestion> getPageBean() {
		return pageBean;
	}

	public void setPageBean(PageBean<WrittenQuestion> pageBean) {
		this.pageBean = pageBean;
	}

	public int getRadioEasyMax() {
		return radioEasyMax;
	}

	public void setRadioEasyMax(int radioEasyMax) {
		this.radioEasyMax = radioEasyMax;
	}

	public int getRadioNormalMax() {
		return radioNormalMax;
	}

	public void setRadioNormalMax(int radioNormalMax) {
		this.radioNormalMax = radioNormalMax;
	}

	public int getRadioDiffMax() {
		return radioDiffMax;
	}

	public void setRadioDiffMax(int radioDiffMax) {
		this.radioDiffMax = radioDiffMax;
	}

	public int getCbEasyMax() {
		return cbEasyMax;
	}

	public void setCbEasyMax(int cbEasyMax) {
		this.cbEasyMax = cbEasyMax;
	}

	public int getCbNormalMax() {
		return cbNormalMax;
	}

	public void setCbNormalMax(int cbNormalMax) {
		this.cbNormalMax = cbNormalMax;
	}

	public int getCbDiffMax() {
		return cbDiffMax;
	}

	public void setCbDiffMax(int cbDiffMax) {
		this.cbDiffMax = cbDiffMax;
	}

	public List<WrittenQuestion> getListWQuestions() {
		return listWQuestions;
	}

	public void setListWQuestions(List<WrittenQuestion> listWQuestions) {
		this.listWQuestions = listWQuestions;
	}
}
