package com.vo;

import java.util.Set;


public class Dept {
	private Integer deptno;
	private String dname;
	private String loc;
	private Set<Emp> empSet;
	public Dept() {
		super();
	}
	
	public Dept(Integer deptno, String dname, String loc, Set<Emp> empSet) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
		this.empSet = empSet;
	}

	public Integer getDeptno() {
		return deptno;
	}

	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public Set<Emp> getEmpSet() {
		return empSet;
	}

	public void setEmpSet(Set<Emp> empSet) {
		this.empSet = empSet;
	}

	@Override
	public String toString() {
		String str="{\'deptno\':" +deptno+
				",\'dname\':\'" +dname+
				"\',\'loc\':\'" +loc+
				"\'}";
		return str;
	}
	
	
}
