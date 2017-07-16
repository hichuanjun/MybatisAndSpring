package com.vo;

public class Emp {
	private Integer empno;
	private String ename;
	private String job;
	private Integer mgr;
	private String hireDate;
	private Double sal;
	private Double comm;
	//private Integer deptno;
	private Dept dept;
	
	public Emp() {
		super();
	}
	
	public Emp(Integer empno, String ename, String job, Integer mgr,
			String hireDate, Double sal, Double comm, Dept dept) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hireDate = hireDate;
		this.sal = sal;
		this.comm = comm;
		this.dept = dept;
	}

	public Integer getEmpno() {
		return empno;
	}

	public void setEmpno(Integer empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Integer getMgr() {
		return mgr;
	}

	public void setMgr(Integer mgr) {
		this.mgr = mgr;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	public Double getComm() {
		return comm;
	}

	public void setComm(Double comm) {
		this.comm = comm;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Emp [comm=" + comm + ", dept=" + dept + ", empno=" + empno
				+ ", ename=" + ename + ", hireDate=" + hireDate + ", job="
				+ job + ", mgr=" + mgr + ", sal=" + sal + "]";
	}

}
