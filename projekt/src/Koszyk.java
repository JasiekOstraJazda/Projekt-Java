import java.util.ArrayList;

public class Koszyk {
    private ArrayList<Produkt> produkty;

    public Koszyk() {
        produkty = new ArrayList<>();
    }

    public void dodajProdukt(Produkt produkt) {
        produkty.add(produkt);
        System.out.println("Produkt został dodany do koszyka.");
    }

    public void costamKoszyk() {
        if (produkty.isEmpty()) {
            System.out.println("Koszyk jest pusty.");
            return;
        }

        System.out.println("Produkty w koszyku:");
        for (Produkt p : produkty) {
            System.out.println(p.getNazwa() + " - " + p.getCena() + " zł");
        }
    }

    public double koszykWartosc() {
        double suma = 0;

        for (Produkt p : produkty) {
            suma += p.getCena();
        }

        return suma;
    }
}