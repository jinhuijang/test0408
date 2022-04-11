package com.spring.ex02;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class UserController extends MultiActionController{
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String userID = "";
		String passwd = "";
		
		
		ModelAndView mav = new ModelAndView();
		
		userID = request.getParameter("userID");
		passwd = request.getParameter("passwd");
		
		mav.addObject("userID", userID);
		mav.addObject("passwd", passwd);
		mav.setViewName("result");
		
		return mav;
	}
	
	public ModelAndView loginForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("loginForm");
		return mav;
	}
	
	public ModelAndView memberInfo(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("userID", request.getParameter("userID"));
		mav.addObject("passwd", request.getParameter("passwd"));
		mav.addObject("name", request.getParameter("name"));
		mav.addObject("email", request.getParameter("email"));
		mav.setViewName("memberInfo");
		
		return mav;
	}
	
	public ModelAndView memberForm(HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("memberForm");

		return mav;
	}
	
	private String getViewName(HttpServletRequest request) throws Exception {
		
		String viewName = "";
		
		String uri = request.getRequestURI();
		int startIdx = uri.lastIndexOf("/");
//		request.getPathInfo();
//		request.getQueryString();
		
		return viewName;
	}
}
