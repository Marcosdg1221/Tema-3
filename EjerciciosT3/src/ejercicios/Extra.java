package ejercicios;

import java.util.Scanner; //Importamos el java.util que necesitamos

public class Extra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creo las variables necesarias, todas serán int.
		
		int yt = (int) ((double)Math.random()*20); //para generar un número al azar
		int intento;
		int sound = (int) ((double)Math.random()*20); //para generar un número al azar
		int guion = (int) ((double)Math.random()*20); //para generar un número al azar
		int beha = (int) ((double)Math.random()*20); //para generar un número al azar
		int puntos=0; //para que no se genere un bucle cuando el usuario se rinda
		
		Scanner all = new Scanner(System.in); //pongo scanner

		
		//Pido al usuario que me ponga un número
		
		System.out.println("Ponga un número para el apartado gráfico");
				
		intento = all.nextInt();
		
		if (yt<=5) {
			System.out.println("Has fichado a Lil para el apartado gráfico");
			puntos = 3;
		}
		if (yt<=10 && yt >5) {
			System.out.println("Has fichado a Cat para el apartado gráfico");
			puntos = 5;
		}
		if (yt<=15  && yt >10) {
			System.out.println("Has fichado a Kira para el apartado gráfico");
			puntos = 7;
		}
		if (yt<19  && yt >15) {
			System.out.println("Has fichado a Cif para el apartado gráfico");
			puntos = 10;
		}
		else if (yt >=19) {
			System.out.println("Has fichado a Vil para el apartado gráfico"); 
			puntos = 40;
		}
		
		System.out.println("Ponga un número para el apartado de sonido");
		
		intento = all.nextInt();
		
		if (sound>=5) {
			System.out.println("Has fichado a Lil para el apartado sonoro");
			puntos= puntos + 0;
		}
		if (sound<=10 && sound >5) {
			System.out.println("Has fichado a Cat para el apartado sonoro");
			puntos= puntos + 30;
		}
		if (sound<=15  && sound >10) {
			System.out.println("Has fichado a Kira para el apartado sonoro");
			puntos= puntos + 10;
		}
		if (sound<=18  && sound >15) {
			System.out.println("Has fichado a Cif para el apartado sonoro");
			puntos = puntos + 15;
		}
		else if (sound >= 19){
			System.out.println("Has fichado a Vil para el apartado sonoro"); 
			puntos = puntos + 30;
		}
		
		System.out.println("Ponga un número para el apartado de guión");
		
		intento = all.nextInt();
		
		if (guion>=5) {
			System.out.println("Has fichado a Lil para el apartado de guión");
			puntos= puntos + 5;
		}
		if (guion<=10 && guion >5) {
			System.out.println("Has fichado a Cat para el apartado de guión");
			puntos= puntos + 3;
		}
		if (guion<=15 && guion >10) {
			System.out.println("Has fichado a Kira para el apartado de guión");
			puntos= puntos + 2;
		}
		if (guion<=18  && guion >15) {
			System.out.println("Has fichado a Cif para el apartado de guión");
			puntos = puntos + 3;
		}
		else if (guion >= 19) {
			System.out.println("Has fichado a Vil para el apartado de guión"); 
			puntos = puntos + 30;
		}
		
		System.out.println("Ponga un número para el apartado de comportamiento");
		
		intento = all.nextInt();
		
		if (beha>=5) {
			System.out.println("Has fichado a Lil para el apartado de comportamiento");
			puntos= puntos -10;
		}
		if (beha<=10 && beha >5) {
			System.out.println("Has fichado a Cat para el apartado de comportamiento");
			puntos= puntos + 30;
		}
		if (beha<=15 && beha >10) {
			System.out.println("Has fichado a Kira para el apartado de comportamiento");
			puntos= puntos + 15;
		}
		if (beha<=18  && beha >15) {
			System.out.println("Has fichado a Cif para el apartado de comportamiento");
			puntos = puntos + 10;
		}
		else if (beha >=19) {
			System.out.println("Has fichado a Vil para el apartado de comportamiento"); 
			puntos = puntos + 10;
		}

		System.out.println("Tus puntos totales son " + puntos); 
		
		}
	}