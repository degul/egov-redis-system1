package egovframework.example.cmmn;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import egovframework.example.sample.web.EgovSampleController;

public class CommonDataInterceptor implements HandlerInterceptor, Serializable {
	
	private static final Logger logger = LoggerFactory.getLogger(EgovSampleController.class);
	
	private static final long serialVersionUID = 1L;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		logger.debug("preHandle!!");
		
		
		return HandlerInterceptor.super.preHandle(request, response, handler);
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		logger.debug("postHandle!!");
		
		
		
		
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

		logger.debug("afterCompletion!!");
		
		
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}

}
