package ejerciciosTema1;

import java.util.Scanner;

public class EjercicioTercero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaramos las variables que vamos a utilizar

		int numero1; //Esta variable va a guardar el primer número que introduzca el usuario por consola
		int numero2; //Esta variable va a guardar el segundo número que introduzca el usuario por consola
		int resto; //En esta variable vamos a guardar el resto de dividir el número1 entre el número2
		Scanner lectura = new Scanner (System.in); //Iniciamos el scanner
				
		//Solicitamos al usuario que nos indique un número entero
				
		System.out.println("Introduce el primer numero");
		numero1 = lectura.nextInt(); //Guardamos el número que ha introducido en la variable "número1"
		
		System.out.println("Introduce el segundo numero");
		numero2 = lectura.nextInt(); //Guardamos el número que ha introducido en la variable "número2"
				
		//Realizamos los calculos necesarios
				
		resto = numero1%numero2; //Vamos a calcular el resto de dividir el número1 entre el número2
				
		//Mostramos el resultado al usuario
				
		System.out.println("Es necesario sumarle " + (numero2-resto) + " para que sea múltiplo de " + numero2); //Lo que hacemos en este scanner es decir que, para que el segundo número introducido sea múltiplo del primero, será necesario sumarle 7 - el resto que calculamos anteriormente.
				
		//Cerramos el scanner
				
		lectura.close();
		
	}

}
