package ejercicios;

import java.util.Scanner; //Importamos el java.util que necesitamos

public class Ejercicio08 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	//Creo las variables necesarias, todas serán int.
	
			int altura; //para ver si el intento es igual al numero generado
			int comparar; //para que guarde el número más alto siempre
			int alto; //Para guardar la medida más alta
			
			Scanner all = new Scanner(System.in); //pongo scanner
			
			//Pido al usuario que me ponga la altura de un árbol
			
			System.out.println("Introduzca una altura de árbol, se te pedirán alturas hasta que se introduzca -1");
					
			altura = all.nextInt();

			//Lo que introduzca será su valor y fijo alto a ese número
			alto = altura;
			
			//Mientras altura sea mayor igual que 0, se sigue el siguiente bucle. 
			
			while (altura>=0) {
				
				//Pido la altura del árbol.
				
				System.out.println("Introduzca la altura de otro árbol");
				
				//Fijo la altura a ese árbol.
				
				altura = all.nextInt();
				
				//Si la altura es mayor que alto, alto tomará ese valor
				
				if (altura>alto) {
					alto = altura;
				}
				
			}
			// Muestro al usuario el resultado
			
			System.out.println("El tamaño del árbol más alto es " + alto);

			//Cierro scanner
			
			all.close();
			}
		}