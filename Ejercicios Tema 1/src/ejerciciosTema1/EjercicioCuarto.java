package ejerciciosTema1;

import java.util.Scanner;

public class EjercicioCuarto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaramos las variables que vamos a utilizar
		
		double base;
		double altura;
		double area;
		Scanner lectura = new Scanner (System.in);
		
		//Solicitamos al usuario que nos indique las medidas del triángulo
		
		System.out.println("Introduce la base del triángulo en cm");
		base = lectura.nextDouble();
		
		System.out.println("Introduce la altura del triángulo en cm");
		altura = lectura.nextDouble();
		
		//Realizamos los cálculos necesarios
		
		area = ((base*altura)/2);
		
		//Mostramos el resultado al usuario
		
		System.out.println("El area del triángulo es " + area + " cm");
		
		//Cerramos el Scanner
		
		lectura.close();
	}

}