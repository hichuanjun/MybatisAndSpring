package com.test;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.inter.DeptMapper;
import com.vo.Dept;
import com.vo.Emp;

public class Test {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		DeptMapper deptMapper = (DeptMapper)ac.getBean("deptMapper");
		//Dept dept =deptMapper.getDept(20);
		List<Dept> list= deptMapper.queryDept();
		System.out.println(list.toString());
	}

}
