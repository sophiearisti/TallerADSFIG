package modelo;

public class StringException extends Exception {
	
	private String mensaje; 
	public StringException(String mensaje) {
		super(mensaje);
		this.mensaje = mensaje;
	}
	

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}
