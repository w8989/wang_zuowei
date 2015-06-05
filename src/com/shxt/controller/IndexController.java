package com.shxt.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
@Scope(value="prototype")
public class IndexController {

	//访问路径
	@RequestMapping(value="shxt")
	public String index(){
		
		//请求转发
		//return "hello";
		//使用重定向 配置的前缀和后缀不好使
		return InternalResourceViewResolver.REDIRECT_URL_PREFIX+"/jsp/hello.jsp";
	}
	@RequestMapping(value="world")
	public ModelAndView index02(){
		System.out.println("___________");
		//请求转发
		ModelAndView modelAndView = new ModelAndView("hello");
		//重定向
		//ModelAndView modelAndView = new ModelAndView(InternalResourceViewResolver.REDIRECT_URL_PREFIX+"/jsp/hello.jsp");
		return modelAndView;
	}
	@RequestMapping(value="user",method=RequestMethod.POST)
	public ModelAndView add(){
		System.out.println("添加");
		ModelAndView modelAndView = new ModelAndView("hello");
		return modelAndView;
	}
	
	@RequestMapping(value="user",method=RequestMethod.GET)
	public ModelAndView sel(){
		System.out.println("查询");
		ModelAndView modelAndView = new ModelAndView("hello");
		return modelAndView;
	}
	
	@RequestMapping(value="user",method=RequestMethod.PUT)
	public ModelAndView update(){
		System.out.println("更新");
		ModelAndView modelAndView = new ModelAndView("hello");
		return modelAndView;
	}
	
	@RequestMapping(value="user",method=RequestMethod.DELETE)
	public ModelAndView delete(){
		System.out.println("删除");
		ModelAndView modelAndView = new ModelAndView("hello");
		return modelAndView;
	}
}
