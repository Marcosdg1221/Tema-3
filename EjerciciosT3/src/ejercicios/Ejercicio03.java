package ejercicios;

import java.util.Scanner; //Importamos el java.util que necesitamos

public class Ejercicio03 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creo las variables necesarias, todas serán int.
		
		int numero; //para el número a pedir
		int veces; //para las veces
		int media; //para las media de los números
		int suma; //para la suma
		
		//Doy el scanner

		Scanner all = new Scanner(System.in);
		
		//Pido al usuario que me ponga números
		
		System.out.println("Introduce un número");
		
		//Lo que introduzca será su valor

		numero = all.nextInt();
		
		suma = numero; //suma se iguala a numero
		
		//Por siempre si el número es mayor igual a 0, pedirá un número y se sumará al siguiente pedido.
		
		//veces se iguala a cero
		
		veces = 0;
		
		//Por siempre si el numero a pedir no es menor que 0, se seguirá un bucle
		
		while (numero >= 0) {
			//veces se sumará a uno
			veces++;
			//Pido que ponga otro número
			System.out.println("Introduce otro número");
			
			//se coge ese valor
			
			numero = all.nextInt();
			
			//Suma se suma a sí mismo y al número pedido
			
			suma = numero + suma;
		}
		
		
		//Se muestra el resultado con la media.
		
		media= (suma/veces);
		
		//Se lo digo al usuario
		
		System.out.println("La media es " + media);
		
	//Cierro scanner
	
	all.close();
	}
}