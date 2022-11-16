package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio07 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero; //El número a pedir que cambiará de forma constante
		int multi; //Guardará el número que escribió el usuario
		
		Scanner all = new Scanner(System.in);
		//Doy el scanner
		
		System.out.println("Introduzca un número");
		numero = all.nextInt();
		multi = numero;
		System.out.print(numero);
		for(; numero > 1; numero= (numero - 1)) {
			System.out.print( " * " + (numero - 1));
		}
		numero = multi;
		for(;numero > 1; numero=(numero - 1)) {
			multi=multi * (numero - 1);
		}
		System.out.print( " = " +  multi);
	}			
}
