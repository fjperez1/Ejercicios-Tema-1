package ejerciciosTema1;

import java.util.Scanner;

public class EjercicioSeptimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaramos las variables que vamos a utilizarç
		
		int distancia1, distancia2, distancia3; //Vamos a crear una variable para cada distancia que introduzca el usuario
		Scanner lectura = new Scanner (System.in); //Iniciamos el scanner
		
		//Solicitamos al usuario que nos indique las distancias
		
		System.out.println("Introduce la primera distancia (en mm)");
		distancia1 = lectura.nextInt(); //Guardamos el primer valor introducido por el usuario en la variable "distancia1"
		System.out.println("Introduce la segunda distancia (en cm)");
		distancia2 = lectura.nextInt(); //Guardamos el segundo valor introducido por el usuario en la variable "distancia2"
		System.out.println("Introduce la tercera distancia (en metros)");
		distancia3 = lectura.nextInt(); //Guardamos el tercer valor introducido por el usuario en la variable "distancia3"
		
		//Mostramos el resultado al usuario
		
		System.out.println("La cantidad que has introducido se corresponde con " + ((distancia1/10) + distancia2 + (distancia3 * 100)) + " centimetros"); //Será necesario convertir la distancia1 y la distancia3 a cm

		//Cerramos el Scanner
		
		lectura.close();
	}

}