package com.krakedev.herencia.test;

import com.krakedev.herencia.Hija;
import com.krakedev.herencia.Hijo;
import com.krakedev.herencia.Padre;

public class TestAhorros {

	public static void main(String[] args) {
		Padre p=new Padre("Ramon",6,7);
		p.ahorrar(125);
		System.out.println(p);
		
		Hija hija=new Hija("Maria",4,5);
		hija.ahorrar(125);
		System.out.println(hija);
		
		Hijo hijo=new Hijo("Jose",1,2,3);
		hijo.ahorrar(125);
		System.out.println(hijo);

		System.out.println(">>>No todos los hijos ahorran igual... y en Java eso se controla con sobreescritura.<<<");
	}

}
