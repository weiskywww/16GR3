package com.qhit.lh.g3.liu.exam.tkgl.service;

import java.util.List;
import java.util.Map;

import com.qhit.lh.g3.liu.exam.common.bean.PageBean;
import com.qhit.lh.g3.liu.exam.kmgl.bean.Course;
import com.qhit.lh.g3.liu.exam.tkgl.bean.WrittenQuestion;
import com.qhit.lh.g3.liu.exam.tkgl.dao.QuestionDao;
import com.qhit.lh.g3.liu.exam.tkgl.dao.QuestionDaoImpl;

public class QuestionServiceImpl implements QuestionService {
	private QuestionDao questionDao = new QuestionDaoImpl();

	@Override
	public List<Course> getCourseInfo(Map parameter) {
		// TODO Auto-generated method stub
		return questionDao.getCourseInfo(parameter);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g3.liu.exam.tkgl.service.QuestionService#getQuestionsMax(int, java.lang.String, java.lang.String)
	 */
	@Override
	public int getQuestionsMax(int csId, String qtype, String degree) {
		// TODO Auto-generated method stub
		return questionDao.getQuestionsMax(csId, qtype, degree);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g3.liu.exam.tkgl.service.QuestionService#getWrittenList(com.qhit.lh.g3.liu.exam.common.bean.PageBean, com.qhit.lh.g3.liu.exam.kmgl.bean.Course, int)
	 */
	@Override
	public PageBean<WrittenQuestion> getWrittenList(PageBean<WrittenQuestion> pageBean, Course course, int pageIndex) {
		// TODO Auto-generated method stub
		return questionDao.getWrittenList(pageBean, course, pageIndex);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g3.liu.exam.tkgl.service.QuestionService#addWrittenQuestion(com.qhit.lh.g3.liu.exam.tkgl.bean.WrittenQuestion)
	 */
	@Override
	public void addWrittenQuestion(WrittenQuestion writtenQuestion) {
		// TODO Auto-generated method stub
		questionDao.addWrittenQuestion(writtenQuestion);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g3.liu.exam.tkgl.service.QuestionService#getWrittenQuestionById(com.qhit.lh.g3.liu.exam.tkgl.bean.WrittenQuestion)
	 */
	@Override
	public WrittenQuestion getWrittenQuestionById(WrittenQuestion writtenQuestion) {
		// TODO Auto-generated method stub
		return questionDao.getWrittenQuestionById(writtenQuestion);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g3.liu.exam.tkgl.service.QuestionService#updateWrittenQuestion(com.qhit.lh.g3.liu.exam.tkgl.bean.WrittenQuestion)
	 */
	@Override
	public void updateWrittenQuestion(WrittenQuestion writtenQuestion) {
		// TODO Auto-generated method stub
		questionDao.updateWrittenQuestion(writtenQuestion);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g3.liu.exam.tkgl.service.QuestionService#inportWrittenQuestions(java.util.List)
	 */
	@Override
	public void inportWrittenQuestions(List<WrittenQuestion> listWQuestions) {
		// TODO Auto-generated method stub
		questionDao.inportWrittenQuestions(listWQuestions);
	}
	
}
