package com.learn.chapter8.pojo;

import java.io.Serializable;
import java.util.Date;

public class RoleBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String roleName;
	private Date createDate;
	private String onte;

	public RoleBean() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getOnte() {
		return onte;
	}

	public void setOnte(String onte) {
		this.onte = onte;
	}
}
