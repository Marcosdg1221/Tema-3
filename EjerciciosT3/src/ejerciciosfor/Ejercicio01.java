package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int terminar; //Genero una variable para termina
		
		Scanner all = new Scanner(System.in);
		//Doy el scanner
		System.out.println("Introduzca un número"); //Pido un número y lo que ponga será su valor
		terminar = all.nextInt();
		
		//Se formará un bucle que crea una variable con valor a uno que incrementará con cada vuelta y terminará cuando el numero sea mayor a terminar
		for(int numero = 1; numero <= terminar; numero++) {
		System.out.println(numero);
		}
		
		//Cierro scanner

		all.close();
		}
	}