package ejerciciosTema1;

import java.util.Scanner;

public class EjercicioOctavo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaramos las variables que vamos a utilizar
		
		int einfantil, eadulto;
		double importe;
		Scanner lectura = new Scanner (System.in);

		//Solicitamos al usuario que nos indique el numero de entradas
		
		System.out.println("Introduce el número de entradas infantiles que desea comprar");
		einfantil = lectura.nextInt();
		System.out.println("Introduce el número de entradas de adulto que desea comprar");
		eadulto = lectura.nextInt();
		
		//Realizamos los cálculos necesarios
		
		importe =  (einfantil * 15.50)+(eadulto * 20);
		
		//Mostramos el resultado al usuario
		
		System.out.println("El importe total asciende a " + ((importe>=100) ? importe*0.95:importe)+ " euros");


	}

}

