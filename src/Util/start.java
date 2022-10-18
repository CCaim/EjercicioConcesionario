package Util;

import java.util.Date;

import MiProyectoPruebaCoches.Coche;
import MiProyectoPruebaPersonas.Persona;

public class start {

	public static void main(String[] args) {
		
		Persona persona = new Persona("Carlos", new Date(), "Oviedo");

		Coche coche = new Coche(persona);
		coche.setConsumo(2.4f);
		coche.setPuertas(5);

		
		
	}

}
