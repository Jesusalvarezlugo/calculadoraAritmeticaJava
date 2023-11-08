package servicios;

public class operacionesImplementacion implements operacionesInterfaz {

	@Override
	public void Suma(double num1, double num2) {
		
		double operacion;
		operacion=num1+num2;
		
		System.out.println("La suma es: "+operacion);
		
	}

	@Override
	public void Resta(double num1, double num2) {
		
		double operacion;
		operacion=num1-num2;
		System.out.println("La resta es: "+operacion);
		
	}

	@Override
	public void Multiplicacion(double num1, double num2) {
		double operacion;
		operacion=num1*num2;
		System.out.println("La multiplicacion es: "+operacion);
		
	}

	@Override
	public void Division(double num1, double num2) {
		double operacion;
		operacion=num1/num2;
		System.out.println("La division es: "+operacion);
		
	}

	@Override
	public void Modulo(double num1, double num2) {
		double operacion;
		operacion=num1%num2;
		System.out.println("El modulo es: "+operacion);
		
	}

}
