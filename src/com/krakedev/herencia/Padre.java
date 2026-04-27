package com.krakedev.herencia;

public class Padre {
	private int defectos;
	private int virtudes;
	private double totalAhorrado;
	private String nombre;
	
	public Padre() {
		super();
		System.out.println("Soy el constructor vacio del padre");
	}
	
	public Padre(String nombre, int defectos, int virtudes) {
		super();
		this.nombre = nombre;
		this.defectos = defectos;
		this.virtudes = virtudes;
	}

	public int getDefectos() {
		return defectos;
	}
	public void setDefectos(int defectos) {
		this.defectos = defectos;
	}
	public int getVirtudes() {
		return virtudes;
	}
	public void setVirtudes(int virtudes) {
		this.virtudes = virtudes;
	}
	public double getTotalAhorrado() {
		return totalAhorrado;
	}
	public void setTotalAhorrado(double totalAhorrado) {
		this.totalAhorrado = totalAhorrado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void imprimir() {
		System.out.println("Virtuden: "+virtudes);
		System.out.println("Defectos: "+defectos);
	}
	private void guardarSecreto() {
		System.out.println("Esto no se Hereda: ");
	}
	public void ahorrar(double monto) {
		totalAhorrado += monto;
	}
	
	@Override
	public String toString() {
		return "Padre [Nombre: "+ nombre+ ", defectos=" + defectos + ", virtudes=" + virtudes + ", Total Ahorrado=" +", Total Ahorrado=" +totalAhorrado+ "]";
	}
	
}
