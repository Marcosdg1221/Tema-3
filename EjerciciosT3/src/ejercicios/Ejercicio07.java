package ejercicios;

import java.util.Scanner; //Importamos el java.util que necesitamos

public class Ejercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creo las variables necesarias, todas serán int.
		
		int numero = (int) ((double)Math.random()*100); //para generar un número al azar
		int intento; //para ver si el intento es igual al numero generado
		int nobucle=0; //para que no se genere un bucle cuando el usuario se rinda
		
		Scanner all = new Scanner(System.in); //pongo scanner

		
		//Pido al usuario que me ponga un número
		
		System.out.println("Se ha generado un número del uno al 100, intente adivinar cuál es, cuando quieras rendirte, de -1");
				
		intento = all.nextInt();

		//Lo que introduzca será su valor
		
		//Siempre que el numero generado sea diferente al numero introducido, se seguira el bucle.
		
		while (numero != intento) {
			
			//Si el intento es igual a -1, y el nobucle es igual a 0, se muestra el número, y se fija el nobucle a 1 para que no se repita el bucle.
			
			if (intento == -1 && nobucle ==0) {
				System.out.println("El número generado es " + numero);
				nobucle=1;
			}
			
			//Si el numero es menor que el intento y no bucle es igual a 0, se avisará al usuario.
			
		else if (numero < intento && nobucle == 0) {
			System.out.println("El número es menor, inténtelo de nuevo");
			intento = all.nextInt();
		}
			
			//Si el numero es mayor que el intento y no bucle es igual a 0, se avisará al usuario.
			
		else if (numero > intento  && nobucle == 0) {
			System.out.println("El número es mayor, inténtelo de nuevo");
			intento = all.nextInt();
		}
			
		//Si el usuario acertó y nobucle es igual a 0, se avisará al usuario.
			
		}
		if (numero == intento  && nobucle == 0) {
			System.out.println("Acertaste");
		}
		
		//Cierro scanner
		
		all.close();
		}
	}
