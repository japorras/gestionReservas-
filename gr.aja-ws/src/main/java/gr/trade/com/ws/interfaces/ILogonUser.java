package gr.trade.com.ws.interfaces;

import gr.trade.com.ws.response.bean.PersonBean;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService
@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL)
public interface ILogonUser {
	
	@WebMethod
	public PersonBean checkLogin(@WebParam(name="nombreUsuario") String nombreUsuario,
			@WebParam(name="password")String password);
	
	
	
}	
