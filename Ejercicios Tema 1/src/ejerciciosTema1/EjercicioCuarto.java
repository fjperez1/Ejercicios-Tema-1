package ejerciciosTema1;

import java.util.Scanner;

public class EjercicioCuarto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaramos las variables que vamos a utilizar
		
		double base; //En esta variable vamos a guardar la medida en cm de la base del triángulo
		double altura; //En esta variable vamos a guardar la altura en cm del triángulo
		double area; //El esta variable vamos a guardar el resultado de calcular el área del triángulo
		Scanner lectura = new Scanner (System.in); //Iniciamos el scanner
		
		//Solicitamos al usuario que nos indique las medidas del triángulo
		
		System.out.println("Introduce la base del triángulo en cm");
		base = lectura.nextDouble(); //Guardamos el valor introducido por el usuario en la variable "base"
		
		System.out.println("Introduce la altura del triángulo en cm");
		altura = lectura.nextDouble(); //Guardamos el valor introducido por el usuario en la variable "altura"
		
		//Realizamos los cálculos necesarios
		
		area = ((base*altura)/2); //Usamos la fórmula para calcular el área de un triángulo
		
		//Mostramos el resultado al usuario
		
		System.out.println("El area del triángulo es " + area + " cm");
		
		//Cerramos el Scanner
		
		lectura.close();
	}

}