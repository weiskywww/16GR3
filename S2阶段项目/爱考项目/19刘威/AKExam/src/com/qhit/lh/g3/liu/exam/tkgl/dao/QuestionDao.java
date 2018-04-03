package com.qhit.lh.g3.liu.exam.tkgl.dao;

import java.util.List;
import java.util.Map;

import com.qhit.lh.g3.liu.exam.common.bean.PageBean;
import com.qhit.lh.g3.liu.exam.kmgl.bean.Course;
import com.qhit.lh.g3.liu.exam.tkgl.bean.WrittenQuestion;

public interface QuestionDao {
	/**
	 * 题库管理
	 * @param mjId
	 * @param stage
	 * @return
	 * 题库列表
	 */
	public List<Course> getCourseInfo(Map parameter);
	
	public PageBean<WrittenQuestion> getWrittenList(
			PageBean<WrittenQuestion> pageBean,
			Course course,
			int pageIndex
			);
	
	public int getQuestionsMax(int csId,String qtype,String degree);
	
	public void addWrittenQuestion(WrittenQuestion writtenQuestion);
	
	public WrittenQuestion getWrittenQuestionById(
			WrittenQuestion writtenQuestion);
	
	public void updateWrittenQuestion(WrittenQuestion writtenQuestion);
	
	public void inportWrittenQuestions(List<WrittenQuestion> listWQuestions);
}
