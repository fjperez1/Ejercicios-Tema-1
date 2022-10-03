package ejerciciosTema1;

import java.util.Scanner;

public class EjercicioSexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaramos las variables que vamos a utilizar
		
		int seg, min, hor;
		Scanner lectura = new Scanner (System.in);
		
		//Solicitamos al usuario que introduzca los segundos
		
		System.out.println("Introduce la cantidad de segundos");
		seg = lectura.nextInt();
		
		//Realizamos los cálculos necesarios
		
		hor = seg/3600;
		min = (seg-hor*3600)/60;
		seg = (seg-(hor*3600+min*60));
		
		//Mostramos el resultado al usuario
		
		System.out.println("La cantidad de segundos que has introducido se corresponde con " + hor + " horas " + min + " minutos " + seg + " segundos");

		//Cerramos el Scanner
		
		lectura.close();
	}

}