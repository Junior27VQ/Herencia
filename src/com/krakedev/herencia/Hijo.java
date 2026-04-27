package com.krakedev.herencia;

public class Hijo extends Padre{
	private int jugetes;

	public Hijo(int virtudes, int defectos, int jugetes) {
		super(defectos, virtudes);
		this.jugetes = jugetes;
	}
	
	public void ahorrar(double monto) {
		double cantidad=monto*50/100;
		setTotalAhorrado(cantidad);
	}
	
	@Override
	public String toString() {
		return "Hijo [defectos= " + getDefectos() + ", virtudes=" + getVirtudes() + "[jugetes=" + jugetes +", Total Ahorrado=" +getTotalAhorrado()+ "]";
	}

	

}
