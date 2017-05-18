package cn.lav.ssm.service;

import java.util.List;

import cn.lav.ssm.pojo.Dept;
import cn.lav.ssm.pojo.User;

public interface UserService {

	User login(String userName, String userPwd) throws Exception;
	
	/**
	 * 获取所有的部门
	 * @return
	 * @throws Exception
	 */
	List<Dept> getAllDepts() throws Exception;
	
	/**
	 * 根据用户名，密码，部门，添加用户
	 * @param userName
	 * @param userPwd
	 * @param dept
	 * @return
	 * @throws Exception
	 */
	int addUser(String userName,String userPwd,Dept dept) throws Exception;
	
	int deleteUserById(int userId) throws Exception;
	
	User getUserById(int userId) throws Exception;
	
	int updateUser(String userName, String userPwd, int userId,int deptId) throws Exception;
	
	List<User> getAllUsers() throws Exception;

}
