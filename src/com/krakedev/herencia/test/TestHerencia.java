package com.krakedev.herencia.test;

import com.krakedev.herencia.Hija;
import com.krakedev.herencia.Padre;

public class TestHerencia {
	public static void main(String[] args) {
		Hija hija=new Hija();
		Padre p=new Padre();
		
		hija.setVirtudes(1);
		hija.setDefectos(2);
		
		hija.escucharMusica();
		System.out.println(p);
	}

}
