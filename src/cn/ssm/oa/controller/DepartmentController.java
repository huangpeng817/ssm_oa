package cn.ssm.oa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.ssm.oa.po.Department;
import cn.ssm.oa.service.DepartmentService;

@Controller
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	@RequestMapping("/list")
	public ModelAndView list() throws Exception {
		List<Department> departmentList = departmentService.findAll();
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("departmentList", departmentList);
		mv.setViewName("department/list");
		return mv;
	}
}
