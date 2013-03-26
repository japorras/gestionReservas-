package gr.trade.com.rest;

import gr.trade.com.ws.ILogonUser;
import gr.trade.com.ws.interfaces.PersonBean;

import javax.annotation.Resource;

public class LoginUserClient {
	
	
	@Resource
	ILogonUser logonuser; 
	
	public void setLogonuser(ILogonUser logonuser) {
		this.logonuser = logonuser;
	}



	public PersonBean logonUser (String usuario, String password)
	{
		
		PersonBean persona = logonuser.checkLogin(usuario, password);
		return persona;
	}
	
	
}
