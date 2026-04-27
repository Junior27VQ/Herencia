package com.krakedev.herencia.test;

import com.krakedev.herencia.Hija;
import com.krakedev.herencia.Hijo;
import com.krakedev.herencia.Padre;

public class TestAhorros {

	public static void main(String[] args) {
		Padre p=new Padre();
		p.ahorrar(125);
		p.setDefectos(6);
		p.setVirtudes(7);
		System.out.println(p);
		
		Hija hija=new Hija();
		hija.ahorrar(125);
		hija.setDefectos(4);
		hija.setVirtudes(5);
		System.out.println(hija);
		
		Hijo hijo=new Hijo(1,2,3);
		hijo.ahorrar(125);
		System.out.println(hijo);


	}

}
