package gr.trade.com.web;

import gr.trade.com.rest.ReservarArticuloClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/main/reservarArticulo")
public class ReservaArticuloController {
	
	//protected static Logger logger = Logger.getLogger("ReservaArticuloController");
	
	@Autowired
	ReservarArticuloClient reservarArticuloClient; 
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String getAjaxAddPage() {
		//logger.info("Recibida la solicitud para mostrar la página");
		return "ajax-add-page";
	}
	
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public @ResponseBody Integer  add (@RequestParam(value="inputNumber1", required=true) Integer inputNumber1, 
			@RequestParam(value="inputNumber2", required=true) Integer inputNumber2, Model model)
	{
		//Integer resultado = inputNumber1 + inputNumber2;
		Integer resultado = reservarArticuloClient.reservarArticulo(inputNumber1, inputNumber2);
		return resultado;
		
	}
	
}
