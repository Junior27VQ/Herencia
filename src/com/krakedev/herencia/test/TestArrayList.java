package com.krakedev.herencia.test;

import java.util.ArrayList;

import com.krakedev.herencia.Hija;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<Hija> listaHija=new ArrayList<Hija>();
		
		Hija h1=new Hija();
		h1.setVirtudes(1);
		h1.setDefectos(2);
		listaHija.add(h1);
		
		Hija h2=new Hija();
		h2.setVirtudes(5);
		h2.setDefectos(6);
		listaHija.add(h2);
		
		Hija h3=new Hija();
		h3.setVirtudes(10);
		h3.setDefectos(11);
		listaHija.add(h3);
		
		
		System.out.println(listaHija);
		

	}

}
