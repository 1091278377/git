package com.hwua.util;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.hwua.pojo.MessegeException;

public class ExceptionResolver implements HandlerExceptionResolver{
    private static Logger logger = Logger.getLogger(ExceptionResolver.class);
	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object obj,
			Exception exc) {
		// 系统有异常跳转到这里进行处理
		ModelAndView modelAndView = new ModelAndView();
		if(exc instanceof MessegeException) {
			MessegeException  msg = (MessegeException) exc;
			logger.error(msg);
			modelAndView.addObject("error", msg.getMsg());
		}
		modelAndView.setViewName("error");
		return modelAndView;
	}

}
