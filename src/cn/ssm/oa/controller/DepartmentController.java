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
import cn.ssm.oa.util.DepartmentUtils;

@Controller
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	@RequestMapping("/list")
	public ModelAndView list(Long parentId) throws Exception {
		List<Department> departmentList = null;
		Department parent = null;
		if (parentId == null || parentId == 0) { // 顶级部门列表(默认加载顶级部门列表)
			departmentList = departmentService.findTopList();
		} else { // 当前部门的子部门
			parent = departmentService.getById(parentId);
			departmentList = departmentService.findChildren(parentId);
		}
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("parent", parent);
		mv.addObject("departmentList", departmentList);
		mv.setViewName("department/list");
		return mv;
	}
	
	@RequestMapping("/addUI")
	public String addUI(Model model, Long pId) throws Exception {
		List<Department> topList = departmentService.findTopList();  
		List<Department> departmentList = DepartmentUtils.getAllDepartments(topList);  

		model.addAttribute("departmentList", departmentList);
		Department parent = departmentService.getById(pId);
		model.addAttribute("parent", parent);
		return "department/saveUI";
	}
	
	@RequestMapping("/add")
	public String add(Department department, Long parentId) throws Exception {
		if (parentId != null && parentId != 0) {
			department.setParentid(parentId);
		}
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
		List<Department> topList = departmentService.findTopList();  
		List<Department> departmentList = DepartmentUtils.getAllDepartments(topList);  
		model.addAttribute("departmentList", departmentList);
		Department department = departmentService.getById(id);
		model.addAttribute("editDept", department);
		return "department/saveUI";
	}
	
	@RequestMapping("/edit")
	public String edit(Department department, Long parentId) throws Exception {
		if (parentId != null && parentId != 0) {
			department.setParentid(parentId);
		}
		departmentService.update(department);
		return "forward:list.action";
	}
}
