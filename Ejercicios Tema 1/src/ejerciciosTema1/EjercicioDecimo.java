package ejerciciosTema1;

import java.util.Scanner;

public class EjercicioDecimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaramos las variables que vamos a utilizar
		
		double dlanzamiento; //En esta variable vamos a guardar la distancia introducida por el usuario en consola
		Scanner lectura = new Scanner (System.in); //Iniciamos el scanner
		
		//Solicitamos al usuario que introduzca la cantidad de metros
		
		System.out.println("Introduce la distancia en metros");
		dlanzamiento = lectura.nextDouble(); //Guardamos el valor introducido por el usuario en la variable "dlanzamiento"
		
		//Realizamos los cálculos necesarios en el mismo println y mostramos el resultado al usuario
		
		System.out.println("La cantidad introducida se corresponde con " + (int)(dlanzamiento*100) + (" cm")); //Mostramos únicamente la parte entera (int) del resultado de multiplicar la variable "dlanzamiento" por 100.
		
		//Cerramos el Scanner
		
		lectura.close();

	}

}
