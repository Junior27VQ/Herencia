package com.krakedev.herencia;

public class Hija extends Padre {

	public Hija() {
		super();
	}
	public Hija(String nombre, int virtudes, int defectos) {
		super(nombre, defectos, virtudes);
	}

	public void escucharMusica() {
		System.out.println("Me guta la musica latina ");
	}

	@Override
	public String toString() {
		return "Hija [Nombre:" +getNombre()+ ",defectos=" + getDefectos() + ", virtudes=" + getVirtudes()+ ", Total Ahorrado=" +getTotalAhorrado()+  "]";
	}

}
