package com.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.inter.DeptMapper;
import com.vo.Dept;
//将deptDao纳入管理
@Controller
public class DeptDao {
	@Resource(name="deptMapper")
	DeptMapper deptMapper;
	//根据前台传过来的方法名找到相应的方法
	@RequestMapping("query")
	public String query(Map map){
		List<Dept> list=deptMapper.queryDept();
		map.put("list", list);
		return "showDept";
	}
	//普通风格 @RequestMapping:方法的名字;@RequestParam:获取参数
	@RequestMapping("delete")
	public String delete(@RequestParam("deptno") int deptno){
		deptMapper.deleteDeptByDeptno(deptno);
		return  "redirect:query";
	}
	//rest风格
	/*@RequestMapping("delete/{deptno}")
	public String delete(@PathVariable int deptno){
		deptMapper.deleteDeptByDeptno(deptno);
		return  "redirect:/query";	
	}*/
	@RequestMapping(value="control/{method}",method=RequestMethod.GET)
	public String control(@PathVariable("method") String method,Map<String, Object> map){
		
		return  "addDept";
		
	}
	@RequestMapping(value="add",method=RequestMethod.POST)
	public String add(Dept dept){
		deptMapper.addDept(dept);
		return  "redirect:/query";
		
	}
	//点击修改之后，根据deptno来查询所有数据，来显示在修改页面
	@RequestMapping(value="select/{deptno}",method=RequestMethod.GET)
	public String select(@PathVariable("deptno") int deptno,Map<String, Object> map){
		Dept dept=deptMapper.getDeptByDeptno(deptno);
		map.put("dept", dept);
		map.put("olddeptno",deptno);
		map.put("method", "update");
		return  "addDept";
	}
	//将修改后的数据传入
	@RequestMapping(value="update",method=RequestMethod.POST)
	public String update(Dept dept,int oldDeptno){
		Map<String, Object> map=new HashMap<String,Object>();
		map.put("dept", dept);
		map.put("oldDeptno",oldDeptno);
		deptMapper.updateDeptByDeptno(map);
		return  "redirect:/query";
		
	}
}
