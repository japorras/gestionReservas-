package gr.trade.com.ws;


import javax.jws.WebService;
import org.springframework.stereotype.Service;

@WebService(endpointInterface="gr.trade.com.ws.interfaces.IReservarArticulo", 
	serviceName="ReservarArticuloWS")
@Service
public class ReservarArticuloWS{
	
	
	
	public Integer reservarArticulo(Integer number1, Integer number2)
	{
		Integer resultado = number1 + number2;
		return resultado;
		
	}
	
}
