package entrega5;

public abstract class Equipo {
	private String nombre;
	private String universidad;
	private String lenguajeP;
	private int tamanoEquipo;

	public Equipo(String nombre, String universidad, String lenguajeP, int tamanioEquipo) {
		this.nombre = nombre;
		this.universidad = universidad;
		this.lenguajeP = lenguajeP;
		this.tamanoEquipo = tamanioEquipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUniversidad() {
		return universidad;
	}

	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}

	public String getLenguajeP() {
		return lenguajeP;
	}

	public void setLenguajeP(String lenguajeP) {
		this.lenguajeP = lenguajeP;
	}

	public int getTamanoEquipo() {
		return tamanoEquipo;
	}

	public void setTamanioEquipo(int tamanioEquipo) {
		this.tamanoEquipo = tamanioEquipo;
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", universidad=" + universidad + ", lenguajeP=" + lenguajeP
				+ ", tamanioEquipo=" + tamanoEquipo + "]";
	}

}
