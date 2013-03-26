package gr.trade.com.ws.response.bean;

import gr.trade.com.model.Persona;

import java.io.Serializable;

public class PersonBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long id;
	
	private String nombreUsuario;
	
	private String password;
	
	private String nombre;
	
	private String apellidos;
		
	private String direccion;
	
	private String codPostal;
	
	private String poblacion;
	
	private String provincia;
	
	private String rol;
	

	public PersonBean() {
		super();
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public PersonBean (Persona persona)
	{
		
		this.id = persona.getId();
		this.nombreUsuario = persona.getNombreusuario();
		this.nombre = persona.getNombre();
		this.apellidos = persona.getApellidos();
		this.direccion = persona.getDireccion();
		this.codPostal = persona.getCodPostal();
		this.password = persona.getPassword();
		this.poblacion = persona.getPoblacion();
		this.provincia = persona.getProvincia();
		this.rol = persona.getRole().getRole();
	}
	
}
