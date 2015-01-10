package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class SpringController {

	
	/*@InitBinder
	public void initBinder(WebDataBinder binder)
	{
		binder.setDisallowedFields(new String[] {"mobno"});
		
	}*/
	
	@RequestMapping(value = "/register.html", method = RequestMethod.GET)
	public ModelAndView Register(Model model)
	{
		ModelAndView modelAndView = new ModelAndView("register");
		return modelAndView;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(Model model)
	{
		ModelAndView modelAndView = new ModelAndView("home");
		return modelAndView;
	}
/*	
	@RequestMapping(value="/submituserdata.html" , method= RequestMethod.POST)
	public ModelAndView handleuserdata(@RequestParam("email") String email ,
			@RequestParam("password") String password 
			,@RequestParam("mobno") String mobno
			,@RequestParam("address")String address)
	{
		
		
		ModelAndView modelAndView = new ModelAndView("usersuccess");
		modelAndView.addObject("msg", "i have received these values from user"+email+password);
		return modelAndView;
	}*/
	
	/*@RequestMapping(value = "/Day9_SpringMVCForm/submitregister.html", method = RequestMethod.POST)
	public ModelAndView doRegister(@RequestParam("email") String email ,
			@RequestParam("password") String password
			,@RequestParam("mobno") String mobno
			,@RequestParam("address") String address)
	{
		
		ModelAndView modelAndView = new ModelAndView("success");
		return modelAndView;
	}*/
	
	/*@RequestMapping(value = "/submitregister.html", method = RequestMethod.POST)
	public ModelAndView doRegister(@RequestParam("email") String email ,
			@RequestParam("password") String password
			,@RequestParam("mobno") String mobno
			,@RequestParam("address") String address)
	{
		Student student1= new Student();
		student1.setAddress(address);
		student1.setPassword(password);
		student1.setEmail(email);
		student1.setMobno(mobno);
		ModelAndView modelAndView = new ModelAndView("success");
		modelAndView.addObject("student1", student1);
		return modelAndView;
	}*/
	
/*	
	@RequestMapping(value = "/submitregister.html", method = RequestMethod.POST)
	public ModelAndView submitregister(@ModelAttribute("student1") Student student ,Model model)
	{
		ModelAndView modelAndView = new ModelAndView("success");
		return modelAndView;
	}
	*/
	@ModelAttribute
	public void commonmessage(Model model)
	{
		
		model.addAttribute("commonmessage", "i am a spring developer");
	}
	
/*	@RequestMapping(value = "/submitregister.html", method = RequestMethod.POST)
	public ModelAndView submitregister(@ModelAttribute("student1") Student student ,Model model)
	{
		ModelAndView modelAndView = new ModelAndView("success");
		return modelAndView;
	}*/
	
	
	@RequestMapping(value = "/submitregister.html", method = RequestMethod.POST)
	public ModelAndView submitregister( @ModelAttribute("student1") Student student ,BindingResult result )
	{
		
		if(result.hasErrors())
		{
			ModelAndView modelAndView = new ModelAndView("register");
			return modelAndView;
		}
		ModelAndView modelAndView = new ModelAndView("success");
		return modelAndView;
	}
	

}
