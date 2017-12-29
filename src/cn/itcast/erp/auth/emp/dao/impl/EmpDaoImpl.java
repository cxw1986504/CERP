package cn.itcast.erp.auth.emp.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.erp.auth.emp.dao.dao.EmpDao;
import cn.itcast.erp.auth.emp.vo.EmpModel;

public class EmpDaoImpl extends HibernateDaoSupport implements EmpDao {

	@Override
	public EmpModel getByUsernameAndPwd(String username, String pwd) {
		String hql = "from EmpModel where username = ? and pwd = ?";
		List<EmpModel> lists = this.getHibernateTemplate().find(hql,username,pwd);
		return lists.size()>0 ? lists.get(0):null;
	}
	
	
	
}
