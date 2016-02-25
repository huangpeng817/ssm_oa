package cn.ssm.oa.util;

import java.util.ArrayList;
import java.util.List;


import cn.ssm.oa.po.Department;

public class DepartmentUtils {
	
	public static List<Department> getAllDepartments(List<Department> topList) throws Exception {
		List<Department> list = new ArrayList<Department>();
		walkDepartmentTreeList(topList, "├", list);
		return list;
	}

	private static void walkDepartmentTreeList(List<Department> topList, String prefix, List<Department> list) throws Exception {
		for (Department top : topList) {
			top.setName(prefix + top.getName());
			list.add(top);
			walkDepartmentTreeList(top.getChildren(), "　" + prefix, list);
		}
	}
	
}
