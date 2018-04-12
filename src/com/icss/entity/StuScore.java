package com.icss.entity;

public class StuScore {
	private Integer scoreId;
	private String stuid;
	private String courseid;
	private Integer val;
	private String courseName;
	private Integer courseTimes;
	private Integer courseGrade;
	
	public Integer getScoreId() {
		return scoreId;
	}
	public void setScoreId(Integer scoreId) {
		this.scoreId = scoreId;
	}
	public String getStuid() {
		return stuid;
	}
	public void setStuid(String stuid) {
		this.stuid = stuid;
	}
	public String getCourseid() {
		return courseid;
	}
	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}
	public Integer getVal() {
		return val;
	}
	public void setVal(Integer val) {
		this.val = val;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Integer getCourseTimes() {
		return courseTimes;
	}
	public void setCourseTimes(Integer courseTimes) {
		this.courseTimes = courseTimes;
	}
	public Integer getCourseGrade() {
		return courseGrade;
	}
	public void setCourseGrade(Integer courseGrade) {
		this.courseGrade = courseGrade;
	}
	
}
