package ejerciciosdowhile;

import java.util.Scanner; //Importamos el java.util que necesitamos

public class Ejercicio01 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = 1; //para el número que se irá sumando
		
		Scanner all = new Scanner(System.in);
		//Doy el scanner
		
		
		//Mientras nº < 21, el numero se sumara a uno
		
		do {
			System.out.println(numero);
			numero++;
		}
		while(numero<21);
	
//Cierro scanner

all.close();
}
	
}