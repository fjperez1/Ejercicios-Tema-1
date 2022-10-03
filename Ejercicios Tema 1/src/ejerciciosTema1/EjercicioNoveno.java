package ejerciciosTema1;

import java.util.Scanner;

public class EjercicioNoveno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaramos las variables que vamos a utilizar
		
		int numero1, numero2;
		Scanner lectura = new Scanner (System.in);
		
		//Solicitamos al usuario que introduzca los dos números
		
		System.out.println("Introduce el primer número");
		numero1 = lectura.nextInt();
		System.out.println("Introduce el segundo número");
		numero2 = lectura.nextInt();
		
		//Mostramos el resultado al usuario
		
		System.out.println("¿Los dos números son iguales? : " + (numero1==numero2));
		
		//Cerramos el Scanner
		
		lectura.close();

	}

}