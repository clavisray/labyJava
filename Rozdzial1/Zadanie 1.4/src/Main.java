// Zadanie 1.4

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String wartosc = JOptionPane.showInputDialog(null, "Wprowadz wartosc");
        String wynikBinarny = Konwersja.naBinarne(Integer.parseInt(wartosc));
        String wynikOsemkowy = Konwersja.naOsemkowe(Integer.parseInt(wartosc));
        String wynikSzesnastkowy = Konwersja.naHex(Integer.parseInt(wartosc));

        String pelnyWynik = "Wynik binarny: " + wynikBinarny
                + " Wynik osemkowy: " + wynikOsemkowy
                + " Wynik szesnastkowy: " + wynikSzesnastkowy;

        JOptionPane.showMessageDialog(null, pelnyWynik);
    }
}

class Konwersja {
    public static String naBinarne(int wartosc) {
        return Integer.toBinaryString(wartosc);
    }

    public static String naOsemkowe(int wartosc) {
        return Integer.toOctalString(wartosc);
    }

    public static String naHex(int wartosc) {
        return Integer.toHexString(wartosc);
    }
}