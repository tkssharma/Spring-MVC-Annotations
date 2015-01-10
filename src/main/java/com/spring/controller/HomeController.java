package com.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HomeController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		ModelAndView modelAndView = new ModelAndView("home");

		modelAndView.addObject("msg","Spring helps development teams everywhere build simple, portable, fast and flexible JVM-based systems and applications. ");
		return modelAndView;
	}

}
