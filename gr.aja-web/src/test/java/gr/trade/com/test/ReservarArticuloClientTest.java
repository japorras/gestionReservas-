package gr.trade.com.test;

import static org.mockito.Mockito.when;
import gr.trade.com.rest.ReservarArticuloClient;
//import gr.trade.com.ws.IReservarArticulo;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class ReservarArticuloClientTest {

	private ReservarArticuloClient reservarArticuloClient;
	
	@Before
	public void instructMock() {
		reservarArticuloClient = org.mockito.Mockito.mock(ReservarArticuloClient.class);
		//ReservarArticuloResponse response = new ReservarArticuloResponse();
		//response.setReturn("articulo ha sido reservado");
		when(reservarArticuloClient.reservarArticulo(new Integer(1), new Integer(2))).thenReturn(new Integer(3));
		
	}
	
	@Test
	public void test() {
		
		Assert.assertEquals(new Integer(3), reservarArticuloClient.reservarArticulo(new Integer("1"),
				new Integer(2)));
	}

}
