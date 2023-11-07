package servicios;

import java.util.Scanner;

public class menuImplementacion implements menuInterfaz {

	@Override
	public void MensajeBienvenida() {
		
		System.out.println("Bienvenido a la calculadora aritmetica");
		
	}

	@Override
	public int MostrarMenu(Scanner scM) {
		
		int opcion;
		
		System.out.println("#########################");
		System.out.println("0. Cerrar");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicacion");
		System.out.println("4. Division");
		System.out.println("5. Modulo");
		System.out.println("###########################");
		System.out.println("Elija una opcion: ");
		
		opcion=scM.nextInt();
		
		return opcion;
		
		
	}

	
	

}
