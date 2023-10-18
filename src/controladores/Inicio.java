package controladores;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		
		final double pi = 3.1416;
		Scanner sc = new Scanner(System.in);
		System.out.println("Vamos a calcular la cirnferencia de un círculo.");
		System.out.print("¿Cuál es el radio del círculo? (cm): ");
		double radio = sc.nextDouble();
		double circunferencia = 2*pi*radio;
		
		System.out.print("La circunferencia del círculo es: " + circunferencia + " cm");
	}

}