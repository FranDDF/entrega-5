package entrega5;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		try {
			System.out.println("Indique el nombre del equipo: ");
			String nombreEquipo = teclado.nextLine();
			
			System.out.println("Indique el nombre de la universidad: ");
			String nombreUni = teclado.nextLine();
			
			System.out.println("Indique el lenguaje de programación a utilizar: ");
			String lenguajeP = teclado.nextLine();
			
			System.out.println("Indique el tamaño del equipo: ");
			int tamanioEquipo = teclado.nextInt();
			
			GestorProgramador equipo = new GestorProgramador(nombreEquipo, nombreUni, lenguajeP, tamanioEquipo);
			Programador programador = new Programador();
			
			System.out.println("Indique el nombre del programador: ");
			String nombreP = teclado.nextLine();
			equipo.validadorTexto(nombreP);
			
			
			System.out.println("Indique el apellido del programador: ");
			String apellidoP = teclado.nextLine();
			equipo.validadorTexto(apellidoP);
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
