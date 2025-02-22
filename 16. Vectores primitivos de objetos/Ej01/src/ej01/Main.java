package ej01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Cuantos coches vas a meter: ");
		int n = in.nextInt();
		Coche[] coches = new Coche[n];
		// rellenar todos los coches
		for (int i = 0; i < coches.length; i++) {
			coches[i] = new Coche();
			coches[i].rellenar();
		}
		// visualizar todos los datos del concesionario
		for (int i = 0; i < coches.length; i++) {
			System.out.println("COCHE " + (i + 1) + ": ");
			coches[i].visualizar();
		}
		// mostrar cantidad de la misma marca
		in.nextLine();
		System.out.print("Que marca quieres saber cuantas veces est�: ");
		String marca = in.nextLine();
		int numeroVeces = Coche.cantidadModelosDeUnaMarca(marca, coches);
		System.out.println("Veces encontrado: " + numeroVeces);
		// modelo veces 
		System.out.print("Que modelo quieres saber si est�: ");
		String modelo=in.nextLine();
		Coche.buscarModelos(coches,modelo);
		in.close();
	}
}
