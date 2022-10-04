package ejerciciosTema1;

import java.util.Scanner;

public class EjercicioQuinto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaramos las variables que vamos a utilizar
		
		double a, b, c, x, y; //Cada variable es una incognita del polinomio que vamos a resolver
		Scanner lectura = new Scanner (System.in); //Iniciamos el scanner
		
		//Mostramos el polinomio que vamos a resolver
		
		System.out.println("Vamos a resolver el polinomio y=ax2+bx+c");
		
		System.out.println("Introduce el coeficiente a"); //Le decimos al usuario que nos indique la primera incognita
		a = lectura.nextDouble(); //Guardamos la primera incognita en la variable "a"
		System.out.println("Introduce el coeficiente b"); //Le decimos al usuario que nos indique la segunda incognita
		b = lectura.nextDouble(); //Guardamos la segunda incognita en la variable "b"
		System.out.println("Introduce el coeficiente c"); //Le decimos al usuario que nos indique la tercera incognita
		c = lectura.nextDouble(); //Guardamos la tercera incognita en la variable "c"
		System.out.println("Introduce el valor de x"); //Le decimos al usuario que nos indique la cuarta incognita
		x = lectura.nextDouble(); //Guardamos la cuarta incognita en la variable "a"
		
		//Realizamos los cálculos necesarios
		
		y=(a*(x*x))+(b*x)+c; //Resolvemos el polinomio de segundo grado
		
		//Mostramos el resultado en consola al usuario
		
		System.out.println("El resultado del polinomio es y= " + y);
		
		//Cerramos el scanner
		
		lectura.close();
		
	}

}