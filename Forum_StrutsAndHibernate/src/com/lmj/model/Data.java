package com.lmj.model;

import java.util.HashSet;
import java.util.Set;

public class Data {
	
	private String id;
	private String dtime;
	private String title;
	private String dcontent;
	private Integer ansnum;
	private String u_id;
	
	private User user;
	private Set<Answer> answerSet = new HashSet<Answer>();
	
	public String getDtime() {
		return dtime;
	}

	public void setDtime(String dtime) {
		this.dtime = dtime;
	}

	public String getDcontent() {
		return dcontent;
	}

	public void setDcontent(String dcontent) {
		this.dcontent = dcontent;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<Answer> getAnswerSet() {
		return answerSet;
	}

	public void setAnswerSet(Set<Answer> answerSet) {
		this.answerSet = answerSet;
	}

	public Integer getAnsnum() {
		return ansnum;
	}

	public void setAnsnum(Integer ansnum) {
		this.ansnum = ansnum;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getU_id() {
		return u_id;
	}

	public void setU_id(String u_id) {
		this.u_id = u_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Data [id=" + id + ", dtime=" + dtime + ", title=" + title + ", dcontent=" + dcontent + ", ansnum="
				+ ansnum + ", u_id=" + u_id + ", user=" + user + "]";
	}
	
}
