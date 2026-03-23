import javax.swing.*;

public class Main {
    public static void main(String[] args) {
            Rownanie r = new Rownanie(0, 0, 0);

            boolean running = true;

            while (running){

                String windowMessage = "Wybierz dzialanie 1-3\n" +
                        "1 - Ustaw wartosci a,b,c\n" +
                        "2 - Oblicz Y dla wskazanego X\n" +
                        "3 - Wyznacz liczbe pierwiastkow rownania\n" +
                        "4 - Wyjscie z programu\n";

                String userInput = JOptionPane.showInputDialog(windowMessage);

                switch (userInput) {
                    case "1":
                        double a = Double.parseDouble(JOptionPane.showInputDialog("Podaj a"));
                        double b = Double.parseDouble(JOptionPane.showInputDialog("Podaj b"));
                        double c = Double.parseDouble(JOptionPane.showInputDialog("Podaj c"));

                        r.setWartosc(a, b, c);
                        JOptionPane.showMessageDialog(null, "Ustawiono wartosci rownania.");
                        break;

                    case "2":
                        double x = Double.parseDouble(JOptionPane.showInputDialog("Podaj X"));
                        double y = r.obliczY(x);

                        JOptionPane.showMessageDialog(null, "Y = " + y);
                        break;

                    case "3":
                        int pierwiastek = r.wyznaczPierwiastek();

                        JOptionPane.showMessageDialog(null, "Liczba pierwiastkow: " + pierwiastek);
                        break;

                    case "4":
                        running = false;
                        break;

                    default:
                        throw new IllegalArgumentException("Wybrano liczbę spoza zakresu. Wpisz ponownie: " + userInput);
                }
            }
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
        return a * Math.pow(x, 2) + b * x + c;
    }

    // Wyznaczenie liczby pierwiastkow
    public int wyznaczPierwiastek() {
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