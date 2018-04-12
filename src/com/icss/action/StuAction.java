package com.icss.action;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.struts2.ServletActionContext;

import com.icss.dao.StuScoreDao;
import com.icss.dao.StudentDao;
import com.icss.entity.StuScore;
import com.icss.entity.Student;
import com.icss.util.MybatisUtil;

public class StuAction {

	private SqlSession sqlsession;
	private Object stu;
	private String stuId;
	private String stuName;
	private List<StuScore> scoreList;
	
	public Object getStu() {
		return stu;
	}
	
	public void setScoreList(List<StuScore> scoreList) {
		this.scoreList = scoreList;
	}

	public List<StuScore> getScoreList() {
		return scoreList;
	}
	
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String execute(){
		System.out.println("--------------stuAction--------------");
		return "success";
	}
	public String stuLogin(){
		sqlsession=MybatisUtil.getSqlSession();
		StudentDao dao=sqlsession.getMapper(StudentDao.class);
		stu = dao.login(stuId, stuName);
		if(stu!=null){
			ServletActionContext.getRequest().getSession().setAttribute("student", stu);
			return "loginSuccess";
		}else{
			return "loginError";
		}
	}
	public String stuIndex(){
		System.out.println("stuIndex。。。。。。。。。。。。。。。。。");
		sqlsession=MybatisUtil.getSqlSession();
		StuScoreDao dao=sqlsession.getMapper(StuScoreDao.class);
		scoreList=dao.findScoreByStu(stuId);
		return "stuIndex";
	}
}
