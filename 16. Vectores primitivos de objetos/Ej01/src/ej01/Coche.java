package ej01;

import java.util.Scanner;

public class Coche {
	private String marca;
	private String modelo;
	private float precio;
	
	public Coche() {
	}

	public Coche(String marca) {
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + "]";
	}
	
	public void rellenar() {
		Scanner in=new Scanner(System.in);
		System.out.print("Marca = ");
		marca=in.nextLine();
		System.out.print("Modelo = ");
		modelo=in.nextLine();
		System.out.print("Precio = ");
		precio=in.nextFloat();
	}
	
	public void visualizar() {
		System.out.println("Marca = "+marca);
		System.out.println("Modelo = "+modelo);
		System.out.printf("Precio = %.2f� \n",precio);
	}
	
	public static int cantidadModelosDeUnaMarca(String marcaAbuscar,Coche[] coches) {
		int cantidad=0;
		for (int i = 0; i < coches.length; i++) {
			if(coches[i].getMarca().equals(marcaAbuscar)) {
				cantidad++;
			}
		}
		return cantidad;
	}

	public static void buscarModelos(Coche[] coches, String modelo2) {
		boolean existe=false;
		for (int i = 0; i < coches.length; i++) {
			if(coches[i].getModelo().equalsIgnoreCase(modelo2)) {
				System.out.println("Modelo encontrado en la posicion "+i);
				System.out.println("Marca = "+coches[i].getMarca());
				System.out.println("Precio = "+coches[i].getPrecio());
				existe=true;
			}
		}
		if(!existe) {
			System.out.println("El modelo no se ha encontrado");
		}
	}
}
