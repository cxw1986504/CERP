package cn.itcast.erp.auth.emp.vo;

public class EmpModel {
	public static final String EMP_LOGIN_USER_NAME = "loginem";
	
	private long uuid;
	private String username;
	private String pwd;
	private String name;
	public long getUuid() {
		return uuid;
	}
	public void setUuid(long uuid) {
		this.uuid = uuid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
