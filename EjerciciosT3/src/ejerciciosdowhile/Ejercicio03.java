package ejerciciosdowhile;

import java.util.Scanner;

public class Ejercicio03 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int numero; //para el número que se pedirá
			int veces=0; //para el nº de veces
			
			Scanner all = new Scanner(System.in);
			//Doy el scanner
			
			//Pido al usuario que ponga un número
			
			System.out.print("Introduzca un número");
			
			//numero guardará ese valor.
			
			numero = all.nextInt();
			
			//Por siempre si las veces es menor que el número -1, se sumará uno las veces y se imprimirá "veces"
			
			do {
				veces++;
				System.out.print(veces + " + ");
			}while (veces<(numero -1));
			System.out.print(veces + 1);
		
	//Cierro scanner

	all.close();
	}
}
