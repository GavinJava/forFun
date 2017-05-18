package cn.lav.ssm.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.lav.ssm.mapper.DeptMapper;
import cn.lav.ssm.mapper.UserMapper;
import cn.lav.ssm.pojo.Dept;
import cn.lav.ssm.pojo.User;
import cn.lav.ssm.service.UserService;

@Transactional(propagation=Propagation.REQUIRED)
@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private DeptMapper deptMapper;

	@Transactional(propagation=Propagation.SUPPORTS)
	@Override
	public User login(String userName, String userPwd) throws Exception {
		Map<String, Object> map = new HashMap<>();
		map.put("userName", userName);
		map.put("userPwd", userPwd);
		return userMapper.login(map);
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	@Override
	public List<Dept> getAllDepts() throws Exception {
		return deptMapper.getAllDepts();
	}

	@Transactional(rollbackFor=Exception.class)
	@Override
	public int addUser(String userName, String userPwd, Dept dept) throws Exception {
		Map<String, Object> map = new HashMap<>();
		map.put("userName", userName);
		map.put("userPwd", userPwd);
		map.put("dept", dept);
		return userMapper.addUser(map);
	}

	@Override
	public int deleteUserById(int userId) throws Exception {
		return userMapper.deleteUserById(userId);
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	@Override
	public User getUserById(int userId) throws Exception {
		return userMapper.getUserById(userId);
	}

	@Override
	public List<User> getAllUsers() throws Exception {
		return userMapper.getAllUsers();
	}

	@Override
	public int updateUser(String userName, String userPwd, int userId,int deptId) throws Exception {
		Map<String, Object> map = new HashMap<>();
		map.put("userId", userId);
		map.put("userName", userName);
		map.put("userPwd", userPwd);
		map.put("deptId", deptId);
		return userMapper.updateUser(map);
	}

}
