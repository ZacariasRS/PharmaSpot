package com.pharma.rest.model;

import java.util.ArrayList;


public class Cesta {
	private ArrayList<Producto> carro;
	
	public Cesta(){}
	
	public Cesta(ArrayList<Producto> cart){
		carro=cart;
	}
	
	public void addItem(Producto p){
		carro.add(p);
	}
	
	public void removeItem(Producto p){
		carro.remove(p);
	}
	
	public void clearCart(){
		carro.clear();
	}
}
