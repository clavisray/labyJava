abstract class Wierzcholek {
    Wierzcholek lewy, prawy;
    public abstract int wartosc();
}
class Stala extends Wierzcholek {
    private int wart;
    public Stala(int x) {
        wart = x;
    }
    public int wartosc() {
        return wart;
    }
}
class Dzialanie extends Wierzcholek {
    private char op; // operator +, -, / lub *
    public Dzialanie(char znak) {
        op = znak;
    }
    public void dodajLewyArg(Wierzcholek arg) {
        lewy = arg;
    }
    public void dodajPrawyArg(Wierzcholek arg) {
        prawy = arg;
    }
    public int wartosc() throws DzieleniePrzezZero {
        switch (op) {
            case ’+’: return lewy.wartosc() + prawy.wartosc();
            case ’-’: return lewy.wartosc() - prawy.wartosc();
            case ’/’: if (prawy.wartosc() == 0) { throw new DzieleniePrzezZero(); } return lewy.wartosc() / prawy.wartosc();        // wyjątek dzielenia przez zero
            case ’*’: return lewy.wartosc() * prawy.wartosc();
        }
        return 0;
    }
}

class Wyrazenie {
    private Wierzcholek korzen;
    private Wierzcholek utworzDrzewo(String w, int p, int q) throws NiepoprawneWyrazenie {
        if (p == q) {
            if (!Character.isDigit((w.charAt(p)))) {
                throw new NiepoprawneWyrazenie();       // jeśli fragment ma długość 1
            }
            return new Stala(Character.digit(w.charAt(p), 10));
        } else {
            if (w.charAt(p) != '(' || w.charAt(q) != ')') {
                throw new NiepoprawneWyrazenie();       // sprawdzanie nawiasów przed i po wyrażeniu
            }

            int i = p+1, nawiasy = 0;
            while ( (nawiasy != 0) || (w.charAt(i) == ’(’) ||
            (w.charAt(i) == ’)’) || (Character.isDigit(w.charAt(i))))
            {
                if (w.charAt(i) == ’(’) ++nawiasy;
                if (w.charAt(i) == ’)’) --nawiasy;
                ++i;
            }

            if (i >= q) {
                throw new NiepoprawneWyrazenie();
            }

            char op = w.charAt(i);
            if (op != '+' && op != '-' && op != '*' && op != '/') {
                throw new NiepoprawneWyrazenie();
            }

            Dzialanie nowy = new Dzialanie(w.charAt(i));
            nowy.dodajLewyArg(utworzDrzewo(w, p+1, i-1));
            nowy.dodajPrawyArg(utworzDrzewo(w, i+1, q-1));
            return nowy;
        }
    }
    public Wyrazenie(String w) {
        korzen = utworzDrzewo(w, 0, w.length()-1);
    }
    public int oblicz() {
        return korzen.wartosc();
    }
}

class DzieleniePrzezZero extends RuntimeException {
    public DzieleniePrzezZero() {
        super("Nie mozna dzielic przez zero!");
    }
}

class NiepoprawneWyrazenie extends RuntimeException {
    public NiepoprawneWyrazenie() {
        super("Wyrazenie niepoprawnie skonstruowane. Poprawna gramatyka to: (wyrazenie | dzialanie | wyrazenie)");
    }
}

public class Main {

    public static void main(String[] args) {
        Wyrazenie wyr = new Wyrazenie("(3*((1+2)-1))");
        System.out.println("" + wyr.oblicz());
    }
}