package ejerciciosdowhile;

import java.util.Scanner;

public class Ejercicio02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = 1; //para el número que se irá sumando
		
		Scanner all = new Scanner(System.in);
		//Doy el scanner
		
		//Mientras el numero sea menor a 201, y si el modulo 2 de numero es 0, se imprimirá ese número.
		
		do {
			if (numero%2 == 0) {
			System.out.println(numero);
			}
			numero++;
		}
		while(numero<201);
	
//Cierro scanner

all.close();
}
	
}
