import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Koszyk koszyk = new Koszyk();

        int wybor;

        do {
            System.out.println("SKLEP INTERNETOWY");
            System.out.println("1.Dodaj produkt");
            System.out.println("2.Wyświetl koszyk");
            System.out.println("3.Oblicz wartość zakupów");
            System.out.println("4.Wyjście");
            System.out.print("Wybierz numer: ");

            wybor = scanner.nextInt();
            scanner.nextLine();

            switch (wybor) {
                case 1:
                    System.out.print("Podaj nazwę produktu: ");
                    String nazwa = scanner.nextLine();

                    System.out.print("Podaj cene produktu: ");
                    double cena = scanner.nextDouble();

                    Produkt produkt = new Produkt(nazwa, cena);
                    koszyk.dodajProdukt(produkt);
                    break;

                case 2:
                    koszyk.costamKoszyk();
                    break;

                case 3:
                    System.out.println("Łączna wartość zakupów: "
                            + koszyk.koszykWartosc() + " zł");
                    break;

                case 4:
                    System.out.println("pozdro.");
                    break;

                default:
                    System.out.println("Wybierz poprawny numer.");
            }

        } while (wybor != 4);

        scanner.close();
    }
}