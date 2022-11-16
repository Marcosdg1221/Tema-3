package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nota = 0; //El número a pedir que cambiará de forma constante
		int suspenso = 0;

		
		Scanner all = new Scanner(System.in);
		//Doy el scanner
		
		for (int numero = 0; numero <5; numero++) {
		System.out.println("Introduzca la nota del alumno");
		nota = all.nextInt();
		
		if (nota< 5) {
			suspenso++;
		}}
		System.out.println("Hay " + suspenso + " suspensos");
	}	
	
}
