import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */
        byte zmienna1;
        zmienna1=5;
        byte zmienna1_1=125;
        System.out.println("zmienne byte = " + zmienna1+", "+zmienna1_1);

        int zmienna2;
        zmienna2=55555;
        int zmienna2_1=4466;
        System.out.println("zmienne int = " + zmienna2+", "+zmienna2_1);

        short zmienna3=1234;
        short zmienna3_1=4321;
        System.out.println("zmienne short = " + zmienna3+", "+zmienna3_1);

        long zmienna4=1234567890;
        long zmienna4_1=987654321;
        System.out.println("zmienne long = " + zmienna4+", "+zmienna4_1);

        float zmienna5=12.34455f;
        float zmienna5_1=34.987f;
        System.out.println("zmienne float = " + zmienna5+", "+zmienna5_1);

        double zmienna6=1234.678;
        double zmienna6_1=33.3333333;
        System.out.println("zmienne double = " + zmienna6+", "+zmienna6_1);

        boolean zmienna7=true;
        boolean zmienna7_1=false;
        System.out.println("zmienne boolean = " + zmienna7+", "+zmienna7_1);

        char zmienna8='T';
        char zmienna8_1='M';
        System.out.println("zmienne char = " + zmienna8+", "+zmienna8_1);
        System.out.println();


        String zmiennaString1="Java to";
        String zmiennaString1_2="Najlepszy język!";
        System.out.println("Zmienne string: "+zmiennaString1+" "+zmiennaString1_2);
        System.out.println();

       /* zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
        *    mnożenia, dziealenia i modulo na zmiennych:
        *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
        *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double) */

        int sumaInt=zmienna2+zmienna2_1;
        System.out.println("Summa wartosci dwóch zmiennych int: "+sumaInt);
        int roznicaInt=zmienna2-zmienna2_1;
        System.out.println("Róznica wartosci dwóch zmiennych int: "+roznicaInt);
        int iloczynInt=zmienna2*zmienna2_1;
        System.out.println("Iloczyn wartosci dwóch zmiennych int: "+iloczynInt);
        int ilorazInt=zmienna2/zmienna2_1;
        System.out.println("Iloraz wartosci dwóch zmiennych int: "+ilorazInt);
        int moduloInt=zmienna2%zmienna2_1;
        System.out.println("Moduło int: "+moduloInt);
        System.out.println();


        double sumaDouble=zmienna6+zmienna6_1;
        System.out.println("Summa wartosci dwóch zmiennych double: "+sumaDouble);
        double roznicaDouble=zmienna6-zmienna6_1;
        System.out.println("Róznica wartosci dwóch zmiennych double: "+roznicaDouble);
        double iloczynDouble=zmienna6*zmienna6_1;
        System.out.println("Iloczyn wartosci dwóch zmiennych double: "+iloczynDouble);
        double ilorazDouble=zmienna6/zmienna6_1;
        System.out.println("Iloraz wartosci dwóch zmiennych double: "+ilorazDouble);
        double moduloDouble=zmienna6%zmienna6_1;
        System.out.println("Moduło double: "+moduloDouble);



    }
}
