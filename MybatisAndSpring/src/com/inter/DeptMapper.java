package com.inter;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

import com.vo.Dept;

public interface DeptMapper {
	
	//@Select("select * from dept where deptno=#{deptno}")
	Dept getDeptByDeptno(Integer deptno);
	List<Dept> queryDept();
	void deleteDeptByDeptno(Integer deptno);
	void updateDept(Dept dept,Integer deptno);
	void addDept(Dept dept);
	void updateDeptByDeptno(Map<String, Object> map);
}
