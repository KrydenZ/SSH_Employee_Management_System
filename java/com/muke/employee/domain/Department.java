package com.muke.employee.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * 部门实体
 */
public class Department {

	// 部门ID
	private Integer did;
	// 部门名称
	private String dname;
	// 部门描述
	private String ddesc;
	// 该部门员工的集合
	private Set<Employee> employees = new HashSet<Employee>();

	public Integer getDid() {
		return did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDdesc() {
		return ddesc;
	}

	public void setDdesc(String ddesc) {
		this.ddesc = ddesc;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

}
