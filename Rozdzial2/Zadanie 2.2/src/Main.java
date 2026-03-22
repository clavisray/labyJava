import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Podaj a");
        String b = JOptionPane.showInputDialog("Podaj b");
        String c = JOptionPane.showInputDialog("Podaj c");


    }
}

class Rownanie {
    private double a, b, c;

    // konstruktor
    public Rownanie(double a, double b, double c) {
        this.a = a; this.b = b; this.c = c;
    }

    // Nadanie wartosci wspolczynnikom
    public void setWartosc(double a, double b, double c) {
        this.a = a; this.b = b; this.c = c;
    }

    // Obliczenie Y dla podanego X
    public double obliczY(double x) {
        double y;
        return y = a * Math.pow(x, 2) + b * x + c;
    }

    // Wyznaczenie liczby pierwiastkow
    public int wyznaczPierwiastek() {
        int p = 2;
        double d = Math.pow(b, 2) - 4 * a * c;

        if (d < 0) {
            return 0;
        } else if (d == 0) {
            return 1;
        } else {
            return 2;
        }
    }
}