package cn.ssm.oa.service;

import java.util.List;

import cn.ssm.oa.po.Department;

public interface DepartmentService {

	List<Department> findAll() throws Exception;

	void save(Department department) throws Exception;

	void delete(Long id) throws Exception;

	Department getById(Long id) throws Exception;

	void update(Department department) throws Exception;

	List<Department> findTopList() throws Exception;

	List<Department> findChildren(Long parentId) throws Exception;
}
