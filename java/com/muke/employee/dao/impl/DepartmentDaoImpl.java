package com.muke.employee.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.muke.employee.dao.DepartmentDao;
import com.muke.employee.domain.Department;

public class DepartmentDaoImpl extends HibernateDaoSupport implements DepartmentDao {

	@Override
	public int findCount() {
		// 注意from的是实体类，而不是表名
		String hql = "select count(*) from Department";
		List<Long> list = this.getHibernateTemplate().find(hql);
		if (list.size() > 0) {
			return list.get(0).intValue();
		} else {
			return 0;
		}
	}

	@Override
	public List<Department> findByPage(int begin, int pageSize) {
		DetachedCriteria criteria = DetachedCriteria.forClass(Department.class);
		List<Department> list = this.getHibernateTemplate().findByCriteria(criteria, begin, pageSize);
		return list;
	}

	@Override
	public void save(Department department) {
		this.getHibernateTemplate().save(department);
	}

	@Override
	public Department findById(Integer did) {
		return this.getHibernateTemplate().get(Department.class, did);
	}

	@Override
	public void update(Department department) {
		this.getHibernateTemplate().update(department);
	}

	@Override
	public void delete(Department department) {
		this.getHibernateTemplate().delete(department);
	}

	@Override
	public List<Department> findAll() {
		return this.getHibernateTemplate().find("select * from Department");
	}

}
