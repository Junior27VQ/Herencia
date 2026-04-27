package com.krakedev.herencia;

public class Hija extends Padre {

	public Hija() {
		super();
	}

	public void escucharMusica() {
		System.out.println("Me guta la musica latina ");
	}

	@Override
	public String toString() {
		return "Hija [defectos=" + getDefectos() + ", virtudes=" + getVirtudes()
				+  "]";
	}

}
