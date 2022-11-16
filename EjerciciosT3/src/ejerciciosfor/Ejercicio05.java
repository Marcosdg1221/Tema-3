package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		
		Scanner all = new Scanner(System.in);
		//Doy el scanner
		System.out.println("Introduzca un número");
		numero = all.nextInt();
		
		
		for(int veces = 1; veces != 10; veces = veces +  1) {
			System.out.println("Introduzca otro número");
			numero= all.nextInt() + numero;	
		}
		System.out.println("La media es " + (numero / 10));
		//Cierro scanner

		all.close();
		}
}