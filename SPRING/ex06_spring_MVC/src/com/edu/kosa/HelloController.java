package com.edu.kosa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

// Controller 역할
// Spring 제공하는 
public class HelloController implements Controller {

	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		logger.info("Welcome hello.jsp page move");
		
//		1. Model And View 사용하는 방법, 변수로 처리하는 방법
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("name", "yeji"); // data save. "yeji"라는 데이터를 name에 저장.
//		mav.addObject("age", 24);
//		mav.setViewName("/views/hello.jsp");

//		2.
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "이건 스프링 mvc ");
		mav.setViewName("list"); // view 이름 설정
		return mav;
		// web을 하면 요청객체 하나, 응답객체 하나 꼭 있어야함. 리턴은 ModelAndView타입으로
	}

}
