package com.hqhp.maven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hqhp.maven.model.User;


@Controller
@RequestMapping("/userController")
public class UserController {
	/*@RequestMapping(value="/helloWorld/{userId}" , method = RequestMethod.GET)
	public ModelAndView helloWorld(@PathVariable("userId")  String userId , @MatrixVariable int year) {
		String message = "Hello World, Spring 3.0!";
		System.out.println("userId:"+userId);
		System.out.println("year:"+year);
		System.out.println(message);
		return new ModelAndView("helloWorld", "message", message);
	}*/
	
	
	@RequestMapping(value="/helloWorld" , method = RequestMethod.POST)
	@ResponseBody
	public User helloWorld(@RequestBody User user) {
		System.out.println("user login...");
		user.setId("asdfiwelfv3234");
		System.out.println("user:"+user);
		return user;
	}
	
	public void testGit(){
		
	}
}
