package ejerciciosTema1;

import java.util.Scanner;

public class EjercicioSegundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaramos las variables que vamos a utilizar
		
		int numero; //Esta variable va a guardar el número que introduzca el usuario por consola
		int resto; //En esta variable vamos a guardar el resto de dividir el número anterior entre 7
		Scanner lectura = new Scanner (System.in); //Iniciamos el scanner
		
		//Solicitamos al usuario que nos indique un número entero
		
		System.out.println("Introduce un numero entero para saber qué cantidad es necesario sumarle para que sea múltiplo de 7");
		numero = lectura.nextInt(); //Guardamos el número que ha introducido en la variable "número"
		
		//Realizamos los calculos necesarios
		
		resto = numero%7; //Vamos a calcular el resto de dividir el número guardado entre 7
		
		//Mostramos el resultado al usuario
		
		System.out.println("Es necesario sumarle " + (7-resto) + " para que sea múltiplo de 7"); //Para mostrar al usuario qué numero es necesario suamrle para que sea múltiplo de 7, hacemos la siguiente operación: 7 - resto (lo que hemos calculado antes)
		
		//Cerramos el scanner
		
		lectura.close();
	}

}