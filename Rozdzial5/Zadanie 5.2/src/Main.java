import java.util.*;

//wspolrzedna ma przesłonić hashcode i equals, override
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Wspolrzedna that = (Wspolrzedna) o;
        return x == that.x && y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}

// również zmiana nazwy klasy na main, utworzyłem wcześniej strukture plików
public class Main {
    public static void main(String[] args) {
        HashMap mapa = new HashMap();
        mapa.put(new Wspolrzedna(2, 3), new String("czerwony"));
        mapa.put(new Wspolrzedna(-3, 0), new String("czarny"));
        mapa.put(new Wspolrzedna(-1, 2), new String("czerwony"));
        mapa.put(new Wspolrzedna(2, -1), new String("czarny"));
        Wspolrzedna w = new Wspolrzedna(-1, 2);
        System.out.println("Punkt " + w.toString()
                + " ma kolor " + mapa.get(w));
    }
}