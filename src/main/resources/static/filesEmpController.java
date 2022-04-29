package kr.or.ddit.emp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/emp")
public class EmpController {
	
	private static final Logger logger = LoggerFactory.getLogger(EmpController.class);
	
	@RequestMapping("/list")
	public String list() {
		return "emp/list";
	}
	
	@RequestMapping("/insert")
	public String insert() {
		return "emp/insert";
	}
	
	@RequestMapping("/update")
	public String update() {
		return "emp/update";
	}
	
	@RequestMapping("/delete")
	public String delete() {
		return "emp/delete";
	}
}
