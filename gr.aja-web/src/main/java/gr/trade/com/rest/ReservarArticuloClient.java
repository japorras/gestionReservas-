package gr.trade.com.rest;

import gr.trade.com.ws.IReservarArticulo;

import javax.annotation.Resource;


public class ReservarArticuloClient {

	@Resource
	IReservarArticulo reserva;
	
	public void setReserva(IReservarArticulo reserva) {
		this.reserva = reserva;
	}



	public String reservarArticulo (String codigo)
	{
		
		String resultado = reserva.reservarArticulo(codigo);
		return resultado;
	}
	
	
}
