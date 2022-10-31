package ejercicios;

import java.util.Scanner; //Importamos el java.util que necesitamos

public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creo las variables necesarias, solo es un int.
		
		int numero; //para el número a pedir
		
		//Doy el scanner

		Scanner all = new Scanner(System.in);
		
		//Pido al usuario que me ponga números
		
		System.out.println("Introduce un número");
		
		//Lo que introduzca será su valor

		numero = all.nextInt();
		
		//Si el modulo del numero entre dos da 0, es par, si no, es impar, se lo muestro al usuario.
		
		if(numero % 2 == 0) {
		
			System.out.println("El numero es par");
			
		}
		else {
			System.out.println("El numero es impar");
		}
		
		//Por siempre si el número es diferente a 0, sumará a uno las veces y pedirá un número.
		
		while (numero != 0) {
			
			//Pido otro número
			
			System.out.println("Introduce otro número");
			
			//se coge ese valor
			
			numero = all.nextInt();
			
			//Si el modulo del numero entre dos da 0, es par, si no, es impar, se lo muestro al usuario.
			
			if(numero % 2 == 0) {
				
				System.out.println("El numero es par");
				
			}
			else {
				System.out.println("El numero es impar");
			}

		}
		
	//Cierro scanner
	
	all.close();
	}
}
