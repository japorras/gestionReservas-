package gr.trade.com.ws;

import gr.trade.com.interfaces.crud.PersonaRepository;
import gr.trade.com.model.Persona;
import gr.trade.com.ws.exception.LogonUserException;
import gr.trade.com.ws.response.bean.PersonBean;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@WebService(endpointInterface="gr.trade.com.ws.interfaces.ILogonUser", 
serviceName="LogonUserWS")
@Service
public class LogonUserWS {
	
	@Autowired(required=true)
	PersonaRepository personRepository;
	
	public PersonBean checkLogin(String nombreUsuario,	String password) throws LogonUserException 
	{
		PersonBean personBean = null;
		
		try
		{
			Persona person = personRepository.findByUserNamePassword(nombreUsuario);
			personBean = new PersonBean(person);
		}
		catch(Exception ex)
		{
			throw new LogonUserException(1, ex.getMessage());
		}
		return personBean; 
		
	}
}
