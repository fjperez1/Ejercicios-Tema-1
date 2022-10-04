package ejerciciosTema1;

import java.util.Scanner;

public class EjercicioOctavo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaramos las variables que vamos a utilizar
		
		int einfantil, eadulto; //En estas variables vamos a guardar el número de entradas infantiles o para adulto
		double importe; //En esta variable vamosa  guardar el resultado de multiplicar el número de entradas por su precio
		Scanner lectura = new Scanner (System.in); //Iniciamos el scanner

		//Solicitamos al usuario que nos indique el numero de entradas
		
		System.out.println("Introduce el número de entradas infantiles que desea comprar");
		einfantil = lectura.nextInt(); //Guardamos el valor introducido por el usuario en la variable "einfantil"
		System.out.println("Introduce el número de entradas de adulto que desea comprar");
		eadulto = lectura.nextInt(); //Guardamos el valor introducido por el usuario en la variable "eadulto"
		
		//Realizamos los cálculos necesarios
		
		importe =  (einfantil * 15.50)+(eadulto * 20); //Multiplicamos el número de entradas por su precio
		
		//Mostramos el resultado al usuario
		
		System.out.println("El importe total asciende a " + ((importe>=100) ? importe*0.95:importe)+ " euros"); //Comparamos la variable "importe" con 100, y si es mayor o igual a ese valor le aplicamos un descuento del 0.05%
		
		//Cerramos el Scanner
		
		lectura.close();

	}

}

