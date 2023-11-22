package com.test.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

//서블릿(X) > 서블릿 > 컨트롤러 역할(O) == <bean>
public class Ex01Controller implements Controller {

	
	//http://localhost:8090/spring/WEB-INF/classes/com/test/spring/controller/Ex01Controller.java
	
	//http://localhost:8090/spring/ex01.do
	
	
	//doGet/doPost == handleRequest
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		
		//업무 진행..
		
		//뷰 호출(JSP)
		//- RequestDispatcher > forward()
		
		//- ModelAndView 사용
		//	- Model > 데이터 전송
		//	- View > JSP
		
		
		//[/WEB-INF/views/WEB-INF/views/ex01.jsp.jsp]을(를) 찾을 수 없습니다.
		ModelAndView mv = new ModelAndView();
		//mv.setViewName("/WEB-INF/views/ex01.jsp");
		mv.setViewName("ex01");
		
		
		request.setAttribute("name", "홍길동");
		mv.addObject("age", 20); //권장
		
		
		return mv; //foward()
	}

}

























