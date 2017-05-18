package cn.lav.ssm.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import cn.lav.ssm.pojo.User;

@Repository("userMapper")
public interface UserMapper {

	/**
	 * 登录方法
	 * @param userName
	 * @param userPwd
	 * @return
	 * @throws Exception
	 */
	User login(Map<String, Object> map) throws Exception;
	
	/**
	 * 根据用户名，密码，部门，添加用户
	 * @param userName
	 * @param userPwd
	 * @param dept
	 * @return
	 * @throws Exception
	 */
	int addUser(Map<String, Object> map) throws Exception;
	
	/**
	 * 根据用户ID删除用户
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	int deleteUserById(int userId) throws Exception;
	
	User getUserById(int userId) throws Exception;
	
	int updateUser(Map<String, Object> map) throws Exception;
	
	List<User> getAllUsers() throws Exception;

}
