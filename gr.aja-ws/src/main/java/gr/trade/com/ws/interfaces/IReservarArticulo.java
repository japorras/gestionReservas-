package gr.trade.com.ws.interfaces;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService
@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL)
public interface IReservarArticulo {
	
	@WebMethod
	public Integer reservarArticulo(@WebParam(name="number1") Integer number1,
			@WebParam(name="number2")Integer number2);
	
}
