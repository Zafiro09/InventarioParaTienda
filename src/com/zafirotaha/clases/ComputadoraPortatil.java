package com.zafirotaha.clases;

public class ComputadoraPortatil extends ProductoElectrodomestico {
	String marca;
	String memoriaRAM;
	int numeroSerie;

public ComputadoraPortatil(String nombre, double precio, int cantidadDisponible, String marca, String memoriaRAM,
		int numeroSerie) {
	super(nombre, precio, cantidadDisponible);
	this.marca = marca;
	this.memoriaRAM = memoriaRAM;
	this.numeroSerie = numeroSerie;
}	

@Override
public void mostrarInformacion() {
    System.out.println("Marca:" + marca);
    System.out.println("Memoria RAM:" + memoriaRAM);
    System.out.println("Numero de serie:" + numeroSerie);
}

}
