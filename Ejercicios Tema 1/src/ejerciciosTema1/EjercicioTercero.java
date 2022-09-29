package ejerciciosTema1;

import java.util.Scanner;

public class EjercicioTercero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaramos las variables que vamos a utilizar

		int numero1;
		int numero2;
		int resto;
		Scanner lectura = new Scanner (System.in);
				
		//Solicitamos al usuario que nos indique un número entero
				
		System.out.println("Introduce el primer numero");
		numero1 = lectura.nextInt();
		
		System.out.println("Introduce el segundo numero");
		numero2 = lectura.nextInt();
				
		//Realizamos los calculos necesarios
				
		resto = numero1%numero2;
				
		//Mostramos el resultado al usuario
				
		System.out.println("Es necesario sumarle " + (numero2-resto) + " para que sea múltiplo de " + numero2);
				
		//Cerramos el scanner
				
		lectura.close();
		
	}

}
