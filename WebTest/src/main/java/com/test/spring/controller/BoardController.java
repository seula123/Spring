package com.test.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/board")
public class BoardController {

	//- "/spring/guest/list.do"
	//- "/spring/board/add.do"
	//- "/spring/board/addok.do"
	//- "/spring/board/view.do"
	
	
	//- doGet() 역할
	@RequestMapping(value="/list.do", method=RequestMethod.GET)
	public String list() {
		
		//WEB-INF/views/board/list.jsp
		return "board/list";
		
	}
	
	
	//- doGet() 역할
	@RequestMapping(value="/add.do", method= {RequestMethod.GET, RequestMethod.POST})
	public String add() {
		
		return "board/add";
	}

	//- doPost() 역할
	@RequestMapping(value="/addok.do", method=RequestMethod.POST)
	public String addok() {
		
		return "board/addok";
	}
	
	
	//- doGet() 역할
	@RequestMapping(value="/view.do", method=RequestMethod.GET)
	public String view() {
		
		return "board/view";
	}
}

