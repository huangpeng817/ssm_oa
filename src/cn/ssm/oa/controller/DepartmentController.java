package cn.ssm.oa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@RequestMapping("/addUI")
	public String addUI(Model model) throws Exception {
		List<Department> departmentList = departmentService.findAll();
		model.addAttribute("departmentList", departmentList);
		return "department/saveUI";
	}
	
	@RequestMapping("/add")
	public String add(Department department, @RequestParam("parentId") Long parentid) throws Exception {
		department.setParentid(parentid);
		departmentService.save(department);
		return "forward:list.action";
	}
	
	@RequestMapping("/delete")
	public String delete(Long id) throws Exception {
		departmentService.delete(id);
		return "forward:list.action";
	}
	
	@RequestMapping("/editUI")
	public String editUI(Model model, Long id) throws Exception {
		List<Department> departmentList = departmentService.findAll();
		model.addAttribute("departmentList", departmentList);
		Department department = departmentService.getById(id);
		model.addAttribute("editDept", department);
		return "department/saveUI";
	}
	
	@RequestMapping("/edit")
	public String edit(Department department, Long parentId) throws Exception {
		department.setParentid(parentId);
		departmentService.update(department);
		return "forward:list.action";
	}
}
