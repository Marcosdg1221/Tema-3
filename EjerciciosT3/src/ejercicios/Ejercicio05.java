package ejercicios;

import java.util.Scanner; //Importamos el java.util que necesitamos

public class Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int numero; //Para el número a pedir
	int veces; //Para las veces
	int positivo = 0; //Para los positivos
	int negativo = 0; //Para los negativos
	int vecesnegativo = 0; //Para las veces que se dan los negativos
	int cero = 0; //Para los ceros
	//Doy el scanner
	Scanner all = new Scanner(System.in);
	
	veces=0; //Veces se fijan a 0
	
	//Pido número
	
	System.out.println("Escriba un número");
	
	//Se fija valor a ese número
	
	numero=all.nextInt();
	
	//positivo se iguala a numero
	
	positivo =numero;
	
	//Cuando las veces sean 10, se para de seguir al bucle
	
	while (veces < 9) {
		
		//Se suma uno las veces
		
		veces++;
		
		//Si el número es mayor a 0, positivo se suma al numero.
		
		if (numero>0) {
			positivo += numero;
		}
		
		//Si es menor, lo mismo.
		
		else if (numero<0) {
			vecesnegativo++; //Se suma a uno las veces de numeros negativos.
			negativo= negativo + numero;
			negativo = negativo /vecesnegativo; //Negativo se dividen entre las veces
		}
		else {
			cero++; //Se suma a uno los ceros.
		}
		
		//Se pide otro número
		
		System.out.println("Escriba otro número");
		
		//Se fija ese valor
		
		numero = all.nextInt();
	}
	
	//Se muestra el resultado.
	
	System.out.println("La suma de los números positivos es " + positivo + " La media de los números negativos es " + negativo + " Las veces que ha salido 0 es " + cero);
	//Cierro scanner
	
	all.close();
	}
}