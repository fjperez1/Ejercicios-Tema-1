package ejerciciosTema1;

import java.util.Scanner;

public class EjercicioQuinto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaramos las variables que vamos a utilizar
		
		double a, b, c, x, y;
		Scanner lectura = new Scanner (System.in);
		
		//Mostramos el polinomio que vamos a resolver
		
		System.out.println("Vamos a resolver el polinomio y=ax2+bx+c");
		
		System.out.println("Introduce el coeficiente a");
		a = lectura.nextDouble();
		System.out.println("Introduce el coeficiente b");
		b = lectura.nextDouble();
		System.out.println("Introduce el coeficiente c");
		c = lectura.nextDouble();
		System.out.println("Introduce el valor de x");
		x = lectura.nextDouble();
		
		//Realizamos los cálculos necesarios
		
		y=(a*(x*x))+(b*x)+c;
		
		//Mostramos el resultado en consola al usuario
		
		System.out.println("El resultado del polinomio es y= " + y);
		
		//Cerramos el scanner
		
		lectura.close();
		
	}

}