package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		boolean primo = true;
		int primon = 0;
		
		Scanner all = new Scanner(System.in);
		//Doy el scanner
		
		System.out.println("Introduzca un número positivo y se dirá si es primo");
		numero = all.nextInt();
		for (;numero > 0; numero = numero - 1) {
	if (numero>0) {
	for (int i=2;i<numero;i++) {
		if (numero % i != 0) {
			System.out.println(i);
			break;
		}
	}
	if (primo && numero!=1) {
		primon=1;
	}
	else {
	primon=0;
		}
	}
	}
	}
	}
