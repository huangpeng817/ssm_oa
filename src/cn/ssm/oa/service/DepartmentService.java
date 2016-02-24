package cn.ssm.oa.service;

import java.util.List;

import cn.ssm.oa.po.Department;

public interface DepartmentService {

	List<Department> findAll() throws Exception;
}
