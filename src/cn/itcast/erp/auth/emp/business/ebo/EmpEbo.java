package cn.itcast.erp.auth.emp.business.ebo;

import cn.itcast.erp.auth.emp.business.ebi.EmpEbi;
import cn.itcast.erp.auth.emp.dao.dao.EmpDao;
import cn.itcast.erp.auth.emp.vo.EmpModel;
import cn.itcast.erp.utils.format.MD5Utils;

//Enterprice Business Object
public class EmpEbo implements EmpEbi{

	private EmpDao empDao;

	public void setEmpDao(EmpDao empDao) {
		this.empDao = empDao;
	}

	@Override
	public EmpModel login(String username, String pwd) {
		pwd = MD5Utils.md5(pwd);
		EmpModel em = empDao.getByUsernameAndPwd(username,pwd);
		return em;
	}

	
	
}
