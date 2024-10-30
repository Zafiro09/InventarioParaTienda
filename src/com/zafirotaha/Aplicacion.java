package com.zafirotaha;

import com.zafirotaha.clases.*;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		
		TiendaElectrica tiendita = new TiendaElectrica();
		Televisor tv = new Televisor("Samsung ultraDom", 300, 20, "22 Pulgadas", "4K");
		ComputadoraPortatil compu = new ComputadoraPortatil("ASUS serie tresZion", 200, 40, "ASUS", "8GB", 628815);
		
		tiendita.agregarProducto(tv);
		tiendita.agregarProducto(compu);
	
		
		tiendita.realizarVenta("Samsung ultraDom", 5);
		tiendita.realizarVenta("ASUS serie tresZion", 3);
	
		tiendita.mostrarProductosDisponibles();
		
		
		
	}

}
