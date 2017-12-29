package cn.itcast.erp.auth.emp.dao.dao;

import cn.itcast.erp.auth.emp.vo.EmpModel;

public interface EmpDao {
	
	/**
	 * 根据用户名密码获取用户信息
	 * @param username
	 * @param pwd
	 * @return
	 */
	public EmpModel getByUsernameAndPwd(String username, String pwd);


}
