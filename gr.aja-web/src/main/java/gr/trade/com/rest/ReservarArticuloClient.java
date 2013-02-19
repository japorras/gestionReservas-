package gr.trade.com.rest;

import gr.trade.com.ws.IReservarArticulo;

import javax.annotation.Resource;


public class ReservarArticuloClient {

	@Resource
	IReservarArticulo reserva; 
	
	public void setReserva(IReservarArticulo reserva) {
		this.reserva = reserva;
	}



	public Integer reservarArticulo (Integer number1, Integer number2)
	{
		
		Integer resultado = reserva.reservarArticulo(number1, number2);
		return resultado;
	}
	
	
}
