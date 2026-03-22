import javax.swing.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {

        boolean running = true;

        while(running){

            String menuMessage = "1 - Dodawanie\n"
                    + "2 - Mnozenie\n"
                    + "3 - Odejmowanie\n"
                    + "4 - Dzielenie\n"
                    + "5 - Rownosc\n"
                    + "6 - Porownanie\n"
                    + "7 - Tekstowa reprezentacja liczby\n"
                    + "8 - Wyjscie z programu\n";
            String userChoice = JOptionPane.showInputDialog(menuMessage);
            String userChoice2 = "";

            switch(Integer.parseInt(userChoice)) {
                case 1: {
                    menuMessage = "Prosze wprowadz ulamki, ktore chcesz do siebie dodac";

                    // ulamek 1
                    userChoice = JOptionPane.showInputDialog("Licznik 1: ");
                    userChoice2 = JOptionPane.showInputDialog("Mianownik 1: ");

                    BigInteger user1 = new BigInteger(userChoice);
                    BigInteger user2 = new BigInteger(userChoice2);

                    Rational ulamek1 = new Rational(user1, user2);

                    // ulamek 2
                    userChoice = JOptionPane.showInputDialog("Licznik 2: ");
                    userChoice2 = JOptionPane.showInputDialog("Mianownik 2: ");

                    user1 = new BigInteger(userChoice);
                    user2 = new BigInteger(userChoice2);

                    Rational ulamek2 = new Rational(user1, user2);

                    // dodanie ulamkow
                    Rational result = ulamek1.add(ulamek2);

                    menuMessage = "Wynik: " +result;

                    JOptionPane.showMessageDialog(null, menuMessage);
                    break;
                }

                case 2: {
                    menuMessage = "Prosze wprowadz ulamki, ktore chcesz pomnozyc";

                    // ulamek 1
                    userChoice = JOptionPane.showInputDialog("Licznik 1: ");
                    userChoice2 = JOptionPane.showInputDialog("Mianownik 1: ");

                    BigInteger user1 = new BigInteger(userChoice);
                    BigInteger user2 = new BigInteger(userChoice2);

                    Rational ulamek1 = new Rational(user1, user2);

                    // ulamek 2
                    userChoice = JOptionPane.showInputDialog("Licznik 2: ");
                    userChoice2 = JOptionPane.showInputDialog("Mianownik 2: ");

                    user1 = new BigInteger(userChoice);
                    user2 = new BigInteger(userChoice2);

                    Rational ulamek2 = new Rational(user1, user2);

                    // mnozenie ulamkow
                    Rational result = ulamek1.mul(ulamek2);

                    menuMessage = "Wynik: " + result;

                    JOptionPane.showMessageDialog(null, menuMessage);
                    break;
                }

                case 3: {
                    menuMessage = "Prosze wprowadz ulamki, ktore chcesz od siebie odjac";

                    // ulamek 1
                    userChoice = JOptionPane.showInputDialog("Licznik 1: ");
                    userChoice2 = JOptionPane.showInputDialog("Mianownik 1: ");

                    BigInteger user1 = new BigInteger(userChoice);
                    BigInteger user2 = new BigInteger(userChoice2);

                    Rational ulamek1 = new Rational(user1, user2);

                    // ulamek 2
                    userChoice = JOptionPane.showInputDialog("Licznik 2: ");
                    userChoice2 = JOptionPane.showInputDialog("Mianownik 2: ");

                    user1 = new BigInteger(userChoice);
                    user2 = new BigInteger(userChoice2);

                    Rational ulamek2 = new Rational(user1, user2);

                    // odejmowanie ulamkow
                    Rational result = ulamek1.sub(ulamek2);

                    menuMessage = "Wynik: " + result;

                    JOptionPane.showMessageDialog(null, menuMessage);
                    break;
                }

                case 4: {
                    menuMessage = "Prosze wprowadz ulamki, ktore chcesz podzielic";

                    // ulamek 1
                    userChoice = JOptionPane.showInputDialog("Licznik 1: ");
                    userChoice2 = JOptionPane.showInputDialog("Mianownik 1: ");

                    BigInteger user1 = new BigInteger(userChoice);
                    BigInteger user2 = new BigInteger(userChoice2);

                    Rational ulamek1 = new Rational(user1, user2);

                    // ulamek 2
                    userChoice = JOptionPane.showInputDialog("Licznik 2: ");
                    userChoice2 = JOptionPane.showInputDialog("Mianownik 2: ");

                    user1 = new BigInteger(userChoice);
                    user2 = new BigInteger(userChoice2);

                    Rational ulamek2 = new Rational(user1, user2);

                    // dzielenie ulamkow
                    Rational result = ulamek1.div(ulamek2);

                    menuMessage = "Wynik: " + result;

                    JOptionPane.showMessageDialog(null, menuMessage);
                    break;
                }

                case 5: {
                    menuMessage = "Prosze wprowadz ulamki, ktorych rownosc chcesz sprawdzic";

                    // ulamek 1
                    userChoice = JOptionPane.showInputDialog("Licznik 1: ");
                    userChoice2 = JOptionPane.showInputDialog("Mianownik 1: ");

                    BigInteger user1 = new BigInteger(userChoice);
                    BigInteger user2 = new BigInteger(userChoice2);

                    Rational ulamek1 = new Rational(user1, user2);

                    // ulamek 2
                    userChoice = JOptionPane.showInputDialog("Licznik 2: ");
                    userChoice2 = JOptionPane.showInputDialog("Mianownik 2: ");

                    user1 = new BigInteger(userChoice);
                    user2 = new BigInteger(userChoice2);

                    Rational ulamek2 = new Rational(user1, user2);

                    // porownanie ulamkow
                    boolean result = ulamek1.equals(ulamek2);

                    menuMessage = "Wynik: " + result;

                    JOptionPane.showMessageDialog(null, menuMessage);
                    break;
                }

                case 6: {
                    menuMessage = "Prosze wprowadz ulamki, ktore chcesz do siebie porownac";

                    // ulamek 1
                    userChoice = JOptionPane.showInputDialog("Licznik 1: ");
                    userChoice2 = JOptionPane.showInputDialog("Mianownik 1: ");

                    BigInteger user1 = new BigInteger(userChoice);
                    BigInteger user2 = new BigInteger(userChoice2);

                    Rational ulamek1 = new Rational(user1, user2);

                    // ulamek 2
                    userChoice = JOptionPane.showInputDialog("Licznik 2: ");
                    userChoice2 = JOptionPane.showInputDialog("Mianownik 2: ");

                    user1 = new BigInteger(userChoice);
                    user2 = new BigInteger(userChoice2);

                    Rational ulamek2 = new Rational(user1, user2);

                    // porownanie ulamkow
                    int result = ulamek1.compareTo(ulamek2);

                    menuMessage = "Wynik: " + result;

                    JOptionPane.showMessageDialog(null, menuMessage);
                    break;
                }

                case 7: {
                    menuMessage = "Prosze wprowadz ulamek, ktore chcesz wyswietlic za pomoca stringa";

                    // ulamek 1
                    userChoice = JOptionPane.showInputDialog("Licznik 1: ");
                    userChoice2 = JOptionPane.showInputDialog("Mianownik 1: ");

                    BigInteger user1 = new BigInteger(userChoice);
                    BigInteger user2 = new BigInteger(userChoice2);

                    Rational ulamek1 = new Rational(user1, user2);

                    JOptionPane.showMessageDialog(null, ulamek1.toString());
                    break;
                }

                case 8: {
                    running = false;
                    break;
                }

                default:{

                }
            }
        }
    }
}

class Rational {
    private BigInteger licznik;
    private BigInteger mianownik;

    //konstruktor
    public Rational(BigInteger licznik, BigInteger mianownik) {
        this.licznik = licznik; this.mianownik = mianownik;
    }

    // 1
    public Rational add(Rational arg) {
        BigInteger nowyLicznik =
                this.licznik.multiply(arg.mianownik).add(arg.licznik.multiply(this.mianownik));

        BigInteger nowyMianownik =
                this.mianownik.multiply(arg.mianownik);


        return new Rational(nowyLicznik, nowyMianownik);
    }

    // 2
    public Rational mul(Rational arg) {

        BigInteger nowyLicznik =
                this.licznik.multiply(arg.licznik);
        BigInteger nowyMianownik =
                this.mianownik.multiply(arg.mianownik);

        return new Rational(nowyLicznik, nowyMianownik);
    }

    // 3
    public Rational sub(Rational arg) {
        BigInteger nowyLicznik =
                this.licznik.multiply(arg.mianownik).subtract(arg.licznik.multiply(this.mianownik));
        BigInteger nowyMianownik =
                this.mianownik.multiply(arg.mianownik);

        return new Rational(nowyLicznik, nowyMianownik);
    }

    // 4
    public Rational div(Rational arg) {

        if (arg.licznik.equals(BigInteger.ZERO)) {
            throw new ArithmeticException("Nie mozna dzielic przez zero");
        }

        BigInteger nowyLicznik =
                this.licznik.multiply(arg.mianownik);
        BigInteger nowyMianownik =
                this.mianownik.multiply(arg.licznik);

        return new Rational(nowyLicznik, nowyMianownik);
    }

    // 5
    public boolean equals(Rational arg) {
        // return this.licznik.equals(arg.licznik) && this.mianownik.equals(arg.mianownik);
        return this.licznik.multiply(arg.mianownik).equals(arg.licznik.multiply(this.mianownik));
    }

    // 6
    public int compareTo(Rational arg) {
        BigInteger pierwszyUlamek = this.licznik.multiply(arg.mianownik);
        BigInteger drugiUlamek = arg.licznik.multiply(this.mianownik);

        int result = pierwszyUlamek.compareTo(drugiUlamek);

        if(result < 0) return -1;
        if(result == 0) return 0;
        return 1;
    }

    // 7
    public String toString() {
        return "Twoja liczba to " + this.licznik + "/" + this.mianownik;
    }

}