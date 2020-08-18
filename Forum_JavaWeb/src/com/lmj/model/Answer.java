package com.lmj.model;

public class Answer {
	
	private String id;
	private String acontent;
	private String atime;
	private String d_id;
	private String u_id;
	private User user;
	
	
	public String getAtime() {
		return atime;
	}
	public void setAtime(String atime) {
		this.atime = atime;
	}
	public String getAcontent() {
		return acontent;
	}
	public void setAcontent(String acontent) {
		this.acontent = acontent;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getD_id() {
		return d_id;
	}
	public void setD_id(String d_id) {
		this.d_id = d_id;
	}
	public String getU_id() {
		return u_id;
	}
	public void setU_id(String u_id) {
		this.u_id = u_id;
	}
	@Override
	public String toString() {
		return "Answer [id=" + id + ", acontent=" + acontent + ", atime=" + atime + ", d_id=" + d_id + ", u_id=" + u_id
				+ ", user=" + user + "]";
	}
	
	
}
