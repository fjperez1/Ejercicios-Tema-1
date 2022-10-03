package ejerciciosTema1;

import java.util.Scanner;

public class EjercicioDecimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaramos las variables que vamos a utilizar
		
		double dlanzamiento;
		Scanner lectura = new Scanner (System.in);
		
		//Solicitamos al usuario que introduzca la cantidad de metros
		
		System.out.println("Introduce la distancia en metros");
		dlanzamiento = lectura.nextDouble();
		
		//Realizamos los cálculos necesarios en el mismo println y mostramos el resultado al usuario
		
		System.out.println("La cantidad introducida se corresponde con " + (int)(dlanzamiento*100) + (" cm"));
		
		//Cerramos el Scanner
		
		lectura.close();

	}

}
