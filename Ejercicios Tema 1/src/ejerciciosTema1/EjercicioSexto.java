package ejerciciosTema1;

import java.util.Scanner;

public class EjercicioSexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaramos las variables que vamos a utilizar
		
		int seg, min, hor; //Vamos a usar 3 variables, "seg" para guardar los segundos que introduzca el usuario, "min" para los minutos, y "hor" para las horas
		Scanner lectura = new Scanner (System.in); //Iniciamos el scanner
		
		//Solicitamos al usuario que introduzca los segundos
		
		System.out.println("Introduce la cantidad de segundos");
		seg = lectura.nextInt(); //Guardamos el valor que introduzca el usuario en la variable "seg"
		
		//Realizamos los cálculos necesarios
		
		hor = seg/3600; //Cada hora tiene 3600 segundos; hacemos una simple división para calcular las horas
		min = (seg-hor*3600)/60; //Calculamos los minutos con los segundos que "sobran" de la operación anterior
		seg = (seg-(hor*3600+min*60)); //Guardamos los segundos que "sobran" de las operaciones anteriores en la variable "seg"
		
		//Mostramos el resultado al usuario
		
		System.out.println("La cantidad de segundos que has introducido se corresponde con " + hor + " horas " + min + " minutos " + seg + " segundos");

		//Cerramos el Scanner
		
		lectura.close();
	}

}