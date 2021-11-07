import java.util.Scanner;

public class Main {
    /*zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
     *   a) Imię, nazwisko, wiek, nr indeksu,
     *   dane mają być wprowadzane z klawiatury w konsoli*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj imię: ");
        String imie = scan.nextLine();

        System.out.println("Podaj nazwisko: ");
        String nazwisko = scan.nextLine();

        System.out.println("Podaj wiek: ");
        int wiek = scan.nextInt();

        System.out.println("Podaj nr indeksu: ");
        int indeks = scan.nextInt();
        System.out.println();

        System.out.printf("Twoje dane to: imię %s, Nazwisko %s, Wiek %d, nr Indeksu %d\n", imie, nazwisko, wiek, indeks);
        System.out.println();
        System.out.println();


        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
         *   wynik wyświetlić w konsoli programu
         */

        System.out.println("Zadanie nr 2 ");
        System.out.println("Podaj pierwszą liczbę: ");
        int zmienna1 = scan.nextInt();
        System.out.println("Podaj podaj druga liczbę: ");
        int zmienna2 = scan.nextInt();

        System.out.println("Wyniki obliczeń na podanych liczbach:");

        System.out.println("Summa: " + zmienna1 + "+" + zmienna2 + "=" + (zmienna1 + zmienna2));
        System.out.println("Róznica: " + zmienna1 + "-" + zmienna2 + "=" + (zmienna1 - zmienna2));
        System.out.println("Iloczyn: " + zmienna1 + "*" + zmienna2 + "=" + (zmienna1 * zmienna2));
        System.out.println("Iloraz: " + zmienna1 + "/" + zmienna2 + "=" + (zmienna1 / zmienna2));
        System.out.println("Moduło: " + zmienna1 + "%" + zmienna2 + "=" + (zmienna1 % zmienna2));


    }
}










