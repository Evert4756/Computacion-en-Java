package com.mycompany.juegopoker;

/**
 *
 * @author ebert
 */
import java.util.*;

public class Baraja {

    static ArrayList<Card> cllCard = new ArrayList<Card>();

    public Baraja() {
        crearBaraja();
    }

    public void crearBaraja() {
        int i;

        System.out.println("Creando Baraja de Poker");

        for (i = 0; i < 13; ++i) {
            cllCard.add(new Card(i + 1, "Treboles"));
        }

        for (i = 0; i < 13; ++i) {
            cllCard.add(new Card(i + 1, "Diamantes"));
        }

        for (i = 0; i < 13; ++i) {
            cllCard.add(new Card(i + 1, "Corazones"));
        }

        for (i = 0; i < 13; ++i) {
            cllCard.add(new Card(i + 1, "Espadas"));
        }
    }

    public void despliegaBaraja() {
        for (Card iCard : cllCard) {
            System.out.println(iCard.toString() + " ");
        }
    }

    public void muestraCarta() {
        Card iCard = cllCard.get(1);
            System.out.println("Muestra carta 1: " + iCard.toString());
    }

    public void mezclarDeck() {
        Collections.shuffle(cllCard);
        System.out.println("Se mezclo el Deck.");
    }

    public void head() {
        Card iCard = cllCard.remove(0);
        System.out.println(iCard.toString());
        System.out.println("Quedan " + cllCard.size() + " cartas en deck");
    }

    public void pick() {
        Random rand = new Random();
        int index = rand.nextInt(cllCard.size());
        Card iCard = cllCard.remove(index);

        System.out.println(iCard.toString());
        System.out.println("Quedan " + cllCard.size() + " cartas en deck");
    }

    public void hand() {
        for (int i = 0; i < 5; i++) {
            Card iCard = cllCard.remove(0);
            System.out.println(iCard.toString());
        }
        System.out.println("Quedan " + cllCard.size() + " cartas en deck");
    }
}