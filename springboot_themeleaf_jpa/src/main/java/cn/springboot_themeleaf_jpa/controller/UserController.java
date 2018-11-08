package cn.springboot_themeleaf_jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import cn.springboot_themeleaf_jpa.entity.User;
import cn.springboot_themeleaf_jpa.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;

	// 去注册页面
	@RequestMapping("/toRegister")
	public String toRegister(Model model) {
		User user=new User();
		model.addAttribute("user", user);
		return "register";
	}

	// 注册，有可能成功，有可能失败
	@RequestMapping("/register")
	public String register(@ModelAttribute User user) {
		
		User user1=userService.saveUser(user);
		System.out.println(user1.getName()+"========================");
		System.out.println(user1.getPwd()+"========================");

		return "redirect:/toLogin";
	}
	
	//注册成功，去登录
	@RequestMapping("/toLogin")
	public String toLogin() {
		return "login";
	}
}
