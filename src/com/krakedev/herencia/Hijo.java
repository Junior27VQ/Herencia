package com.krakedev.herencia;

public class Hijo extends Padre{
	private int jugetes;

	public Hijo(String nombre, int virtudes, int defectos, int jugetes) {
		super(nombre, defectos, virtudes);
		this.jugetes = jugetes;
	}
	
	public void ahorrar(double monto) {
		double cantidad=monto*50/100;
		setTotalAhorrado(cantidad);
	}
	
	@Override
	public String toString() {
		return "Hijo [Nombre:" +getNombre()+ ", defectos= " + getDefectos() + ", virtudes=" + getVirtudes() + "[jugetes=" + jugetes +", Total Ahorrado=" +getTotalAhorrado()+ "]";
	}

	

}
