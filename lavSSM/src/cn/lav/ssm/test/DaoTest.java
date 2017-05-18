package cn.lav.ssm.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.lav.ssm.pojo.Dept;
import cn.lav.ssm.pojo.User;
import cn.lav.ssm.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:ApplicationBeans.xml")
public class DaoTest {
	
	@Autowired
	private UserService userService;

	@Test
	public void testName() throws Exception {
		User user = userService.login("alex", "123");
		System.out.println(user.getUserName());
	}
	
	@Test
	public void testName2() throws Exception {
		List<Dept> allDepts = userService.getAllDepts();
		for (Dept dept : allDepts) {
			System.out.println(dept.getDeptName());
		}
	}
	
	@Test
	public void testName3() throws Exception {
		Dept dept = new Dept();
		dept.setDeptId(1l);
		dept.setDeptName("teach");
		int addUser = userService.addUser("Ciriiiiiii", "657", dept);
		System.out.println(addUser);
	}
	
	@Test
	public void testNam4e() throws Exception {
		int deleteUser = userService.deleteUserById(3);
		System.out.println(deleteUser);
	}
	
	@Test
	public void testName5() throws Exception {
		User userById = userService.getUserById(2);
		System.out.println(userById.getUserName()+userById.getDept().getDeptName());
	}
	
	@Test
	public void testName6() throws Exception {
		List<User> allUsers = userService.getAllUsers();
		for (User user : allUsers) {
			System.out.println(user.getDept().getDeptName());
		}
	}
	
	/*@Test
	public void testName7() throws Exception {
		int updateUser = userService.updateUser("KIKI", "775777", 2);
		System.out.println(updateUser);
	}*/
	
	@Test
	public void testName88() throws Exception {
		
	}
}
