package ejerciciosdowhile;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero; //para el número que se pedirá
		int veces=0; //para el nº de veces
		int resultado; //Para el resultado de una multiplicación
		
		Scanner all = new Scanner(System.in);
		//Doy el scanner
		
		//Pido al usuario que ponga un número
		
		System.out.print("Introduzca un número, se mostrará su tabla de multiplicación");
		
		//respuesta guardará ese valor.
		
		numero = all.nextInt();
		
		//Por siempre si las veces es menor que diez, sumar uno las veces y el resultado será la multiplicación del nº por las veces, y se imprime
		
		do {
			veces++;
			resultado = (numero * veces);
			System.out.println(numero +  " x " + veces + " = " + resultado);
		}while (veces<10);
	
//Cierro scanner

all.close();
}
}
