package ejerciciosdowhile;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = (int) ((double)Math.random()*100); //para el número que se pedirá
		int intento; //para el nº de veces
		int resultado; //Para el resultado de una multiplicación
		int notwo = 0; //Para que no se repita una frase al adivinar de primera
		
		
		Scanner all = new Scanner(System.in);
		//Doy el scanner
		
		System.out.println("¿El número es " + numero + "? introduzca 1 para sí, introduzca 2 si es mayor y 3 si es menor" );
		intento = all.nextInt();
		
		
		//Por siempre si notwo es 0 e intento es mayor que uno, y si el intento es igual a 2, se genera otro número sumando al número un nº al azar, o se resta si es 3.
		//Cuando el usuario ponga 1, el programa se saldrá del bucle y notwo se fija a 1; por lo que no se repetirá una vez más.
		
			do {
			if (intento == 2) {
				numero =(int) ((double)numero + Math.random()*99);
				System.out.println("¿El número es " + numero + "? introduzca 1 para sí, introduzca 2 si es mayor y 3 si es menor" );
				intento = all.nextInt();
			}
			else if (intento == 3) {
				numero =(int) ((double)numero - Math.random()*99);
			System.out.println("¿El número es " + numero + "? introduzca 1 para sí, introduzca 2 si es mayor y 3 si es menor" );
			intento = all.nextInt();
			}
			else {
				System.out.print(" :) " );
				notwo = 1;
			}
			}
			while (intento > 1 && notwo == 0); 
		if (intento == 1 && notwo == 0) {
			System.out.print(" :) " );
			}
		
		}
	}
		
