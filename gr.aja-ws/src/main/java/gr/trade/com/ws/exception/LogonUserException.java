package gr.trade.com.ws.exception;

import javax.xml.ws.WebFault;

@WebFault(name = "LogonUserException", targetNamespace = "http://ws.com.trade.gr/")
public class LogonUserException extends Exception{
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * Java type that goes as soapenv:Fault detail element.
     */
    private int codError;
    
    private String descError;


    public LogonUserException(int codError, String message) {
        super(message);
        this.descError = message;
        this.codError = codError;
    }

    public LogonUserException(String message, int codError, Throwable cause) {
        super(message, cause);
        this.descError = message;
        this.codError = codError;
    }

    public LogonUserException getFaultInfo() {
        return this;
    }

	public int getCodError() {
		return codError;
	}

	public void setCodError(int codError) {
		this.codError = codError;
	}

	public String getDescError() {
		return descError;
	}

	public void setDescError(String descError) {
		this.descError = descError;
	}
	
    
	
}
