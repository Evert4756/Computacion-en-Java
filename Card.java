public class Card {

    int numero;
    String palo;
    String color;

    String[] palosarray = {"Treboles", "Corazones", "Espadas", "Diamantes"};
    String[] coloresarray = {"Negro", "Rojo", "Negro", "Rojo"};

    public Card(int pNumero, String pPalo) {
        numero = pNumero;
        palo = pPalo;
        color = obtenerColor(pPalo);
    }

    private String obtenerColor(String pPalo) {
        for (int i = 0; i < palosarray.length; i++) {
            if (palosarray[i].equals(pPalo)) {
                return coloresarray[i];
            }
        }
        return "Desconocido";
    }    
        
    public String toString() {
        return palo + "," + color + "," + numero;
    }
}