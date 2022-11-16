package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creo la variable terminar
		
		int terminar;
		
		Scanner all = new Scanner(System.in);
		//Doy el scanner
		System.out.println("Introduzca un número");
		
		//Pido un número y lo que ponga el usuario sera su valor
		
		terminar = all.nextInt();
		
		//Se formará un bucle que crea una variable con valor a 3 que 
		//incrementará en 3 con cada vuelta y terminará cuando el numero sea menor que terminar
		
		for(int numero = 3; numero <= terminar; numero = numero + 3) {
		System.out.println(numero);
		}
		
		//Cierro scanner

		all.close();
		}
	}