package com.ncs.test.member.model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ncs.test.member.model.service.MemberService;

@Controller
public class MemberController {
	@Autowired
	private MemberService memberservice;
	
	@PostMapping("/login")
	public ModelAndView 
	
	
}
