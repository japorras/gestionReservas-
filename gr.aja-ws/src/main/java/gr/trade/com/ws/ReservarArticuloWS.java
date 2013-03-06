package gr.trade.com.ws;


import gr.trade.com.interfaces.crud.WorkerRepository;
import gr.trade.com.model.Worker;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@WebService(endpointInterface="gr.trade.com.ws.interfaces.IReservarArticulo", 
	serviceName="ReservarArticuloWS")
@Service
public class ReservarArticuloWS{
	
	@Autowired(required=true)
	WorkerRepository wkRepository;
	
	
	public Integer reservarArticulo(Integer number1, Integer number2)
	{

		Worker work = wkRepository.findOne(new Long(number1));
		System.out.println("work: " + work.getName());
		Integer resultado = number1 + number2;
		return resultado;
		
	}
	
}
