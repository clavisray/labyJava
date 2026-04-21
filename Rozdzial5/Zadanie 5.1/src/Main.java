import java.util.*;

class Wspolrzedna implements Comparable<Wspolrzedna> {
    private int x, y;
    public Wspolrzedna(int _x, int _y) {
        x = _x;
        y = _y;
    }
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    public int compareTo(Wspolrzedna w) {
        if (this.x != w.x) {
            return this.x - w.x;
        }
        return this.y - w.y;
    }
}

// zmiana klasy na main ze względu na nazwę pliku
public class Main {
    private static void wypiszElementy(TreeSet zbior) {
        Iterator it = zbior.iterator();
        while (it.hasNext()) {
            System.out.println((it.next()).toString());
        }
    }
    public static void main(String[] args) {
        TreeSet zbior = new TreeSet();
        zbior.add( new Wspolrzedna(2, 3) );
        zbior.add( new Wspolrzedna(-3, 0) );
        zbior.add( new Wspolrzedna(-1, 2) );
        zbior.add( new Wspolrzedna(-1, 2) );
        zbior.add( new Wspolrzedna(-3, -2) );
        wypiszElementy(zbior);
    }
}