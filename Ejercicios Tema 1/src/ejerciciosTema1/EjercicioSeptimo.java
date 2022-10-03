package ejerciciosTema1;

import java.util.Scanner;

public class EjercicioSeptimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaramos las variables que vamos a utilizarç
		
		int distancia1, distancia2, distancia3;
		Scanner lectura = new Scanner (System.in);
		
		//Solicitamos al usuario que nos indique las distancias
		
		System.out.println("Introduce la primera distancia (en mm)");
		distancia1 = lectura.nextInt();
		System.out.println("Introduce la segunda distancia (en cm)");
		distancia2 = lectura.nextInt();
		System.out.println("Introduce la tercera distancia (en metros)");
		distancia3 = lectura.nextInt();
		
		//Mostramos el resultado al usuario
		
		System.out.println("La cantidad que has introducido se corresponde con " + ((distancia1/10) + distancia2 + (distancia3 * 100)) + " centimetros");


	}

}