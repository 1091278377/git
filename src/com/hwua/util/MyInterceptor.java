package com.hwua.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MyInterceptor implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		System.out.println("À¹½ØÇ°");
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		System.out.println("À¹½Øºó");
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj) throws Exception {
		String requestURI = request.getRequestURI();
		if(!requestURI.contains("/login")) {
			String SESSION = 
					(String) request.getSession().getAttribute("USER_SESSION");
			if(SESSION == null) {
				response.sendRedirect(request.getContextPath()+"/login.do");
			}
		}
		return true;
	}
	

}
