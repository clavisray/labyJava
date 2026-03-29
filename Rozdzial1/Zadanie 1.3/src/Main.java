// Zadanie 1.3

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args){

        Integer zakres = new Integer(JOptionPane.showInputDialog(null, "Wprowadz wartosc"));

        int wynik = 0;

        for (int i = 1; i <= zakres; i++) {
            if (i % 2 == 1) {
                wynik += i;
                System.out.println(wynik);
            }
        }
        JOptionPane.showMessageDialog(null, "Suma wartosci: " + wynik);

    }
}