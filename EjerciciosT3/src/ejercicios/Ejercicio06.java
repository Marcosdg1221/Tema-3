package ejercicios;

import java.util.Scanner; //Importamos el java.util que necesitamos

public class Ejercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int sumaedad; //Para la suma
	int media; //Para la media
	int alumnos; //Para la cantidad de alumnos
	int edad; //Para las edades
	int mayor; //Para los mayores de edad
	//Doy el scanner
	Scanner all = new Scanner(System.in);
	
	System.out.println("Escriba la edad de un alumno"); //pido edad de un alumno
	edad=all.nextInt(); //Para poner la edad
	sumaedad=edad; //Fijo la suma a la edad
	alumnos=0; //fijo a 0 los alumnos
	mayor=0; //fijo a 0 los mayores de edad
	
	//Mientras la edad sea mayor igual que 0, se sigue este bucle
	
	while (edad>=0) {
		
		//Pido edad de otro alumno
		System.out.println("Escriba la edad de otro alumno");
		//La edad toma el numero
		edad=all.nextInt();
		//sumo uno los alumnos
		alumnos++;
		//La suma se suma a sí mismo y la edad pedida antes
		sumaedad= edad + sumaedad;
		//Si la edad es mayor a 17, se suma uno los mayores
		if (edad>17) {
			mayor++;
		}
	}
	//Hago la media de la edad y los alumnos
	media = (sumaedad/alumnos);
	//Doy resultado
	System.out.println("La suma de todas las edades es " + sumaedad + " la media de edad es " + media + " los mayores de edad son " + mayor + ", y la cantidad de alumnos es " + alumnos);
	//Cierro scanner
	
	all.close();
	}
}