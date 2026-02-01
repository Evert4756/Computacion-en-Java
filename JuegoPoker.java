package com.mycompany.juegopoker;

/**
 *
 * @author ebert
 */
public class JuegoPoker {

	public static void main(String[] args) {

		Baraja objBaraja = new Baraja();

		objBaraja.despliegaBaraja();
		objBaraja.mezclarDeck();
		objBaraja.muestraCarta();
                objBaraja.head();
                objBaraja.pick();
                objBaraja.hand();
		objBaraja.despliegaBaraja();
	}
}