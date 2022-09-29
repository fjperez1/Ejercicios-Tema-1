package ejerciciosTema1;

import java.util.Scanner;

public class EjercicioSegundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaramos las variables que vamos a utilizar
		
		int numero;
		int resto;
		Scanner lectura = new Scanner (System.in);
		
		//Solicitamos al usuario que nos indique un número entero
		
		System.out.println("Introduce un numero entero para saber qué cantidad es necesario sumarle para que sea múltiplo de 7");
		numero = lectura.nextInt();
		
		//Realizamos los calculos necesarios
		
		resto = numero%7;
		
		//Mostramos el resultado al usuario
		
		System.out.println("Es necesario sumarle " + (7-resto) + " para que sea múltiplo de 7");
		
		//Cerramos el scanner
		
		lectura.close();
	}

}