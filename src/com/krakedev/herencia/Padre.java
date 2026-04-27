package com.krakedev.herencia;

public class Padre {
	private int defectos;
	private int virtudes;
	
	public Padre() {
		super();
		System.out.println("Soy el constructor vacio del padre");
	}
	
	public Padre(int defectos, int virtudes) {
		super();
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
	
	public void imprimir() {
		System.out.println("Virtuden: "+virtudes);
		System.out.println("Defectos: "+defectos);
	}
	private void guardarSecreto() {
		System.out.println("Esto no se Hereda: ");
	}

	
	@Override
	public String toString() {
		return "Padre [defectos=" + defectos + ", virtudes=" + virtudes + ", Total Ahorrado=" + "]";
	}
	
}
