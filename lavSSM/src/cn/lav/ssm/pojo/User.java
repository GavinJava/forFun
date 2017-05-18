package cn.lav.ssm.pojo;

/**
 * 用户实体类 -- 多方(many方)
 * 
 * @author runmu
 *
 */
public class User {
	
	private Long userId;
	private String userName;
	private String userPwd;
	
	private Dept dept;

	public User() {

	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

}
