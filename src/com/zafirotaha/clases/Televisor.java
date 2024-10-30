package com.zafirotaha.clases;

public class Televisor extends ProductoElectrodomestico {

	String tamanioPantalla;
	String resolucion;
	
	public Televisor(String nombre, double precio, int cantidadDisponible, String tamanioPantalla, String resolucion) {
		super(nombre, precio, cantidadDisponible);
		this.tamanioPantalla = tamanioPantalla;
		this.resolucion = resolucion;
	}
	
	@Override
	public void mostrarInformacion() {
	       System.out.println("Tamaño de la panatalla: " + tamanioPantalla);
	       System.out.println("Resolución:" + resolucion);
	   }
	
	
	
	
	
}
