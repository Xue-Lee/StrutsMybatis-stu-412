package com.icss.action;

import java.io.IOException;
import java.sql.SQLException;

public class TestAction {
	
	private Integer cnt;
	public void setCnt(Integer cnt) {
		this.cnt = cnt;
	}
	
	public Integer getCnt() {
		return cnt;
	}

	public String execute() {
		return "sorry";
	}
	public String welcome() {
		return "welcome";
	}
	
	public String exp() throws SQLException, IOException{
		System.out.println("test---------------exception");
		if(cnt<5){
			System.out.println("ok---------------");
		}else{
			if(cnt<10){
				throw new SQLException("hello sql exception");
			}else{
				throw new IOException("hello IO exception");
			}
		}
		return "success";
	}
}
