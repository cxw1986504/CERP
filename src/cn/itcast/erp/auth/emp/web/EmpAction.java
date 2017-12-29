package cn.itcast.erp.auth.emp.web;

import cn.itcast.erp.auth.emp.business.ebi.EmpEbi;
import cn.itcast.erp.auth.emp.vo.EmpModel;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class EmpAction extends ActionSupport{
	
	public EmpModel em = new EmpModel();
	
	//注入business
	private EmpEbi empEbi;

	public void setEmpEbi(EmpEbi empEbi) {
		this.empEbi = empEbi;
	}
	//用户登录
	public String login(){
		//System.out.println(em.getUsername()+":"+em.getPwd());
		//1、获取页面上面的登录信息封装到em对象中
		//2、将登录信息传到业务层
		//3、调用dao层方法获取到数据库中EmpModel数据
		//4、将获取到的EmpModel传到web层，
		//5、判断回传结果，如果是空，则登录失败
		ActionContext act = ActionContext.getContext();
		EmpModel loginem = empEbi.login(em.getUsername(),em.getPwd());
		if(loginem == null){
			//登录失败
			act.put("res", "帐号或者密码错误");
			return "LoginFailed";
		}
		else{
			//登录成功
			act.getSession().put(EmpModel.EMP_LOGIN_USER_NAME, loginem);
			return "LoginSuccess";
		}
	}
	
}
