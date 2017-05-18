package cn.lav.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cn.lav.ssm.pojo.Dept;
import cn.lav.ssm.pojo.User;
import cn.lav.ssm.service.UserService;

@Controller
public class IndexController {
	
	@Autowired
	private UserService UserService;
	
	@RequestMapping("/goIndex")
	public ModelAndView getAllUser(){
		try {
			return new ModelAndView("index").addObject("allUsers", UserService.getAllUsers());
		} catch (Exception e) {
			e.printStackTrace();
			return new ModelAndView("index").addObject("errorMessage" , "hehehehehehe");
		}
	}

	@RequestMapping(value="/goDelete",method=RequestMethod.GET)
	public ModelAndView deleteUserById(@RequestParam String userId){
		System.out.println(userId);
		try {
			UserService.deleteUserById(Integer.parseInt(userId));
			return new ModelAndView("index").addObject("allUsers", UserService.getAllUsers());
		}catch (Exception e) {
			e.printStackTrace();
			return new ModelAndView("index").addObject("errorMessage" , "hehehehehehe");
		}
	}
	
	@RequestMapping(value="/goUpdate",method=RequestMethod.GET)
	public ModelAndView getUserInfo(@RequestParam String userId){
		try {
			List<Dept> allDepts = UserService.getAllDepts();
			User user = UserService.getUserById(Integer.parseInt(userId));
			return new ModelAndView("update").addObject("user", user).addObject("allDepts",allDepts);
		} catch (Exception e) {
			e.printStackTrace();
			return new ModelAndView("update").addObject("errorMessage", "no!");
		}
	}
	
	@RequestMapping("goFinish")
	public ModelAndView updateInfo(@RequestParam String userId,@RequestParam String userName,@RequestParam String userPwd,@RequestParam String deptId){
		try {
			UserService.updateUser(userName, userPwd, Integer.parseInt(userId), Integer.parseInt(deptId));
			return getAllUser();
		} catch (Exception e) {
			e.printStackTrace();
			return new ModelAndView("update").addObject("errorMessage", "no!");
		}
	}
}
