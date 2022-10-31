package ejercicios;

import java.util.Scanner; //Importamos el java.util que necesitamos

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creo las variables necesarias, todas serán int.
		
		int numero; //para el número a pedir
		int suma; //para la suma de todos los números positivos
		int veces; //para las veces que se entra en el bucle
		
		//Doy el scanner

		Scanner all = new Scanner(System.in);
		
		//Pido al usuario que me ponga números
		
		System.out.println("Introduce un número");
		
		//Lo que introduzca será su valor

		numero = all.nextInt();
		
		//Fijo las veces a 0
		
		veces = 0;
		
		//La suma equivaldrá al número
		
		suma = numero;
		
		//Por siempre si el número es mayor igual a 0, sumará a uno las veces y pedirá un número.
		
		while (numero >= 0) {
			
			veces++;
			
			System.out.println("Introduce otro número");
			
			//se coge ese valor
			
			numero = all.nextInt();
			
			//Si las veces entradas al bucle superan a 0, y si el número no es negativo, la suma
			//se sumará por el número.
			
			if (veces > 0) {
				if (numero >= 0) {
			suma = suma+numero;
			}
			}
		}
		
		//Se muestra el resultado.
		
		System.out.println("La suma es; " + suma);
		
	//Cierro scanner
	
	all.close();
	}
}
