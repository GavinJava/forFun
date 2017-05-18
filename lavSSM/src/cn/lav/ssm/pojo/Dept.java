package cn.lav.ssm.pojo;

import java.util.ArrayList;
import java.util.List;

/**
 * 部门实体类 -- 一方(one方)
 * 
 * @author runmu
 *
 */
public class Dept {

	private Long deptId;
	private String deptName;

	/* 所关联的"多方"集合 */
	private List<User> users = new ArrayList<>();

	public List<User> getUsers() {
		return users;
	}

	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}
