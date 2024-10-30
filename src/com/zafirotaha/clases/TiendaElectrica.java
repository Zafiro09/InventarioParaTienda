package com.zafirotaha.clases;

import java.util.ArrayList; 
	
	public class TiendaElectrica {
		private ArrayList<ProductoElectrodomestico> listaDeProductos;
		
		
		public ArrayList<ProductoElectrodomestico> getListaDeProductos() {
			return listaDeProductos;
		}

		public void setListaDeProductos(ArrayList<ProductoElectrodomestico> listaDeProductos) {
			this.listaDeProductos = listaDeProductos;
		}
		
		public TiendaElectrica() {
			this.listaDeProductos = new ArrayList<>();
		}
		
		public void agregarProducto(ProductoElectrodomestico producto) {
			listaDeProductos.add(producto);
			System.out.println("Producto agregado: " + producto.getNombre());
			System.out.println("Cantidad disponble: "+ producto.getCantidadDisponible());
		}
		
		public void mostrarProductosDisponibles() {
			System.out.println("Productos disponibles en tienda:");
			for (ProductoElectrodomestico producto : listaDeProductos) {
				producto.mostrarInformacion();
				System.out.println("-----------");
			}
		}
		
		public ProductoElectrodomestico buscarProductoPorNombre(String nombre) {
	        for (ProductoElectrodomestico producto : listaDeProductos) {
	            if (producto.getNombre().equalsIgnoreCase(nombre)) {
	                return producto;
	            }
	        }
	        return null;
	    }
		
		public void realizarVenta(String nombreProducto, int cantidad) {
	        ProductoElectrodomestico producto = buscarProductoPorNombre(nombreProducto);
	        if (producto != null) {
	            if (producto.getCantidadDisponible() >= cantidad) {
	                producto.setCantidadDisponible(producto.getCantidadDisponible() - cantidad);
	                System.out.println("Venta realizada: " + cantidad + " unidad(es) de " + nombreProducto);
	            } else if (producto.getCantidadDisponible() > 0) {
	                System.out.println("No hay suficiente stock. Solo se vendieron " + producto.getCantidadDisponible() + " unidad(es) de " + nombreProducto);
	                producto.setCantidadDisponible(0);
	            } else {
	                System.out.println("Producto agotado: " + nombreProducto);
	            }
	        } 
	    }
	
	}
	
