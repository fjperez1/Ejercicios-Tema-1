package ejerciciosTema1;

import java.util.Locale;
import java.util.Scanner;

public class EjercicioPrimero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaramos las variables que vamos a utilizar
		
		double numero;
		Scanner lectura = new Scanner (System.in);
		
		
		//Solicitamos al usuario que nos indique un numero con decimales
		
		System.out.print("Introduce un numero con decimales");
		numero = lectura.nextDouble();
		
		//Realizamos los calculos necesarios
		
		numero += 0.5;
		
		//Mostramos el resultado al usuario
		
		System.out.print("El resultado es " + (int)numero);
		
		lectura.close();
		
	}

}