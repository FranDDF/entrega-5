package entrega5;

public class ExcepPerso extends Exception {
	private String mensaje;
	
	
	
	public ExcepPerso(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	@Override
	public String getMessage() {
		return getMensaje();
	}
	
}
