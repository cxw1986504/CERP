package cn.itcast.erp.auth.emp.business.ebi;

import org.springframework.transaction.annotation.Transactional;

import cn.itcast.erp.auth.emp.vo.EmpModel;

//Enterprice Business Interface
@Transactional
public interface EmpEbi {
	/**
	 * 用戶登陸
	 * @param username	用户名
	 * @param pwd	密码
	 * @return 返回登录用户信息，如果返回为null，则登录失败
	 */
	public EmpModel login(String username, String pwd);
	

}
