package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numM;
		int numm;
		
		Scanner all = new Scanner(System.in);
		//Doy el scanner
		
		System.out.println("Introduca un número");
		numM = all.nextInt();
		System.out.println("Introduca un número menor al anterior");
		numm = all.nextInt();
		numm=numm + 1;
		System.out.println("Los números entre medio son; ");
		for (;numM>numm;numm++) {
			System.out.println(numm);
		}
		}
		}
