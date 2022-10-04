package ejerciciosTema1;

import java.util.Scanner;

public class EjercicioNoveno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaramos las variables que vamos a utilizar
		
		int numero1, numero2; //Vamos a guardar el primer número en la variable "numero1", y el segundo en "numero2"
		Scanner lectura = new Scanner (System.in); //Iniciamos el scanner
		
		//Solicitamos al usuario que introduzca los dos números
		
		System.out.println("Introduce el primer número");
		numero1 = lectura.nextInt(); //Guardamos el primer valor introducido por el usuario en la variable "numero1"
		System.out.println("Introduce el segundo número");
		numero2 = lectura.nextInt(); //Guardamos el segundo valor introducido por el usuario en la variable "numero2"
		
		//Mostramos el resultado al usuario
		
		System.out.println("¿Los dos números son iguales? : " + (numero1==numero2)); //Comparamos el "numero1" con el "numero2; si es verdadero, la función devuelve "true", y "false" si es falso
		
		//Cerramos el Scanner
		
		lectura.close();

	}

}