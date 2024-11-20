package esercizio1;


class Rettangolo {
    // Attributi privati
    private double altezza;
    private double larghezza;

    // Costruttore
    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    // Metodi pubblici per ottenere i valori
    public double getAltezza() {
        return altezza;
    }

    public double getLarghezza() {
        return larghezza;
    }

    // Metodo per calcolare l'area
    public double calcolaArea() {
        return altezza * larghezza;
    }

    // Metodo per calcolare il perimetro
    public double calcolaPerimetro() {
        return 2 * (altezza + larghezza);
    }

    // Metodo per stampare area e perimetro
    public static void stampaRettangolo(Rettangolo rettangolo) {
        System.out.println("Area: " + rettangolo.calcolaArea());
        System.out.println("Perimetro: " + rettangolo.calcolaPerimetro());
    }

    // Metodo per stampare area e perimetro di due rettangoli
    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        System.out.println("Primo Rettangolo:");
        stampaRettangolo(r1);

        System.out.println("Secondo Rettangolo:");
        stampaRettangolo(r2);

        double areaTotale = r1.calcolaArea() + r2.calcolaArea();
        double perimetroTotale = r1.calcolaPerimetro() + r2.calcolaPerimetro();

        System.out.println("Somma Aree: " + areaTotale);
        System.out.println("Somma Perimetri: " + perimetroTotale);
    }
}

public class Esercizio1 {
    public static void main(String[] args) {
        // Creazione di due rettangoli
        Rettangolo rettangolo1 = new Rettangolo(5, 10);
        Rettangolo rettangolo2 = new Rettangolo(3, 6);

        // Stampa delle informazioni sui rettangoli
        Rettangolo.stampaDueRettangoli(rettangolo1, rettangolo2);
}
}

