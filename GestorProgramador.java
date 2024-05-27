package entrega5;

import java.util.ArrayList;
import java.util.List;

public class GestorProgramador extends Equipo implements IMinMax {
	private List<Programador> programador;

	public GestorProgramador(String nombre, String universidad, String lenguajeP, int tamanoEquipo) {
		super(nombre, universidad, lenguajeP, tamanoEquipo);
		this.programador = new ArrayList<>();
	}

	@Override
	public boolean equipoCompleto() {
		return getTamanoEquipo() >= MAX_P;
	}

	public void anadirProgramador(Programador programador) throws ExcepPerso {
		if (equipoCompleto()) {
			throw new ExcepPerso("El equipo está completo, no es posible agregar al programador.");
		} else {
			this.programador.add(programador);
		}
	}
	
	public void imprimir(List<Programador> programadores) {
	    for (Programador p : programadores) {
	        System.out.println(p);
	    }
	}
	
	public void validadorTexto(String texto) throws ExcepPerso{
		 if(!texto.matches("[a-zA-Z]+")) {
			 throw new ExcepPerso("Ingrese solo letras.");
		 }
	}

	
	

}
