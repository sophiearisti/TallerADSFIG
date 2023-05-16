package modelo;

public class StringExceptionBro extends Exception {
	
	private String mensaje; 
	public StringExceptionBro(String mensaje) {
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
