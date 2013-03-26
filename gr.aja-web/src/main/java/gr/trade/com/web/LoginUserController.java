package gr.trade.com.web;

import gr.trade.com.rest.LoginUserClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/loginUser")
public class LoginUserController {

	@Autowired
	LoginUserClient logonUserClient;
	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getLogin() {
		//logger.info("Recibida la solicitud para mostrar la página");
		return "login";
	}
	
	@RequestMapping(value = "/failLogin", method = RequestMethod.GET)
	public String failedLogin(ModelMap model) {

	model.addAttribute("error", "true");
	return "login";

	}
	
	@RequestMapping(value = "/logoff", method = RequestMethod.GET)
	public String logoff(ModelMap model) {

		return "login";
	}
	
//	@RequestMapping(value="/add", method = RequestMethod.POST)
//	public @ResponseBody String  add (@RequestParam(value="nombreUsuario", required=true) String nombreUsuario, 
//			@RequestParam(value="password", required=true) String password, Model model)
//	{
//		PersonBean persona = logonUserClient.logonUser(nombreUsuario, password);
//		if(persona != null 
//				&& persona.getNombreUsuario() != null && !persona.getNombreUsuario().equalsIgnoreCase("")
//				&& persona.getPassword() != null && !persona.getPassword().equalsIgnoreCase(""))
//		{
//			return "success";
//		}
//		else
//			return "error"; 
//		
//	}
//	
	
}
