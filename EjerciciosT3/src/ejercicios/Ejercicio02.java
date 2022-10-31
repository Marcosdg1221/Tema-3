package ejercicios;

import java.util.Scanner; //Importamos el java.util que necesitamos

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creo las variables necesarias, todas serán int.
		
		int numero; //para el número a pedir
		int veces; //para las veces que se entra en el bucle
		
		//Doy el scanner

		Scanner all = new Scanner(System.in);
		
		//Pido al usuario que me ponga números
		
		System.out.println("Introduce un número");
		
		//Lo que introduzca será su valor

		numero = all.nextInt();
		
		//Fijo las veces a 0
		
		veces = 0;
		
		//Por siempre si el número es mayor igual a 0, sumará a uno las veces y pedirá un número.
		
		while (numero >= 0) {
			
			veces++;
			
			System.out.println("Introduce otro número");
			
			//se coge ese valor
			
			numero = all.nextInt();
		}
		
		
		//Se muestra el resultado.
		
		System.out.println("Las veces pedidos de números positivos es " + veces);
		
	//Cierro scanner
	
	all.close();
	}
}