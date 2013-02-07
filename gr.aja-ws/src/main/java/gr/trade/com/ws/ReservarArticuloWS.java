package gr.trade.com.ws;

import gr.trade.com.ws.interfaces.IReservarArticulo;

import javax.jws.WebService;

import org.springframework.stereotype.Service;

@WebService(endpointInterface="gr.trade.com.ws.interfaces.IReservarArticulo", 
	serviceName="ReservarArticuloWS")
@Service
public class ReservarArticuloWS implements IReservarArticulo{
	
	
	
	public String reservarArticulo(String codigo)
	{
		return "articulo ha sido reservado";
		
	}
	
}
