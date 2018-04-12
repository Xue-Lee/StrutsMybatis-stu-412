package com.icss.dao;

import java.util.List;

import com.icss.entity.StuScore;

public interface StuScoreDao {
	public List<StuScore> findScoreByStu(String stuId);
}
