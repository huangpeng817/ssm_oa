package cn.ssm.oa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.ssm.oa.mapper.DepartmentMapper;
import cn.ssm.oa.po.Department;
import cn.ssm.oa.service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentMapper departmentMapper;
	
	@Override
	public List<Department> findAll() throws Exception {
		List<Department> departments = departmentMapper.selectByExample(null);
		for (Department department : departments) {
			Department parent = departmentMapper.selectByPrimaryKey(department.getParentid());
			department.setParent(parent);
		}
		return departments;
	}
	
}
