package com.fruit.user.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fruit.user.service.UserService;
import com.fruit.user.vo.User;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;
	/**
	 * 注册用户
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/adduser")
	@ResponseBody
	public Map<String, Object> adduser(User user){
		userService.addUser(user);
		return null;
	}
}
