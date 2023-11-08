package controladores;

import java.util.Scanner;

import servicios.menuImplementacion;
import servicios.menuInterfaz;
import servicios.operacionesImplementacion;
import servicios.operacionesInterfaz;

public class principal {

	public static void main(String[] args) {
		
		int opcionS;
		double operador1=0;
		double operador2=0;
		Scanner sc=new Scanner(System.in);
		boolean cerrarMenu=false;
		menuInterfaz mi=new menuImplementacion();
		operacionesInterfaz oi=new operacionesImplementacion();
		
		while(!cerrarMenu) {
			
			opcionS=mi.MostrarMenu(sc);
			
			if(opcionS>0) {
				
				operador1=mi.PedirNumero();
				operador2=mi.PedirNumero();
			}
			switch(opcionS) {
			
			
			case 0:
				cerrarMenu=true;
				break;
				
			case 1:
				oi.Suma(operador1, operador2);
				break;
				
			case 2:
				oi.Resta(operador1, operador2);
				break;
				
			case 3:
				oi.Multiplicacion(operador1, operador2);
				break;
				
			case 4:
				oi.Division(operador1, operador2);
				break;
				
			case 5:
				oi.Modulo(operador1, operador2);
				break;
				
			default:
				System.out.println("[ERROR] opcion introducida no valida");
				break;
			}
		}

	}

}
