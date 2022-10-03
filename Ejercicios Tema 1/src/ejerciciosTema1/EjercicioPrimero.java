package ejerciciosTema1;

import java.util.Locale;
import java.util.Scanner;

public class EjercicioPrimero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaramos las variables que vamos a utilizar
		
		double numero; //La primera variable será el numero que introduce el usuario
		Scanner lectura = new Scanner (System.in); //Iniciamos el scanner para poder guardar el número que introduzca el usuario
		
		
		//Solicitamos al usuario que nos indique un numero con decimales
		
		System.out.print("Introduce un numero con decimales");
		numero = lectura.nextDouble(); //Guardamos el número que ha introducido el usuario en la variable "número"
		
		//Realizamos los calculos necesarios
		
		numero += 0.5; //Le sumamos 0.5 para comprobar si podemos redondear el número al siguiente entero
		
		//Mostramos el resultado al usuario
		
		System.out.print("El resultado es " + (int)numero); //Mostramos únicamente la parte entera del número
		
		//Cerramos el Scanner
		
		lectura.close();
		
	}

}