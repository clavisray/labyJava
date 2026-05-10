import java.util.*;
class MapaKomunikatow {
    private HashMap mapa = new HashMap();
    public synchronized void dodaj(String klucz, Integer wartosc) {
        mapa.put(klucz, wartosc);
    }

    public synchronized Integer pobierz(String klucz) {
        return (Integer) mapa.get(klucz);
    }

    public synchronized String toString() {
        return mapa.toString();
    }
}
class Watek extends Thread {
    private MapaKomunikatow mapako;
    public String s;
    public int start;
    public Watek(MapaKomunikatow mapa, String s, int start) {
        this.mapako = mapa;
        this.s = s;
        this.start = start;
    }

    public void run() {
        try {
            for (int i = start; i<=10; i+=2) {
                mapako.dodaj(s + i, new Integer(i));
                Thread.sleep(50);
            }
        }
        catch (Exception e){};
    }
}
public class Main {
    public static void main(String args[]) {
        MapaKomunikatow mapa = new MapaKomunikatow();

        Watek w1 = new Watek(mapa, "A", 1);
        Watek w2 = new Watek(mapa, "B", 2);

        w1.start();
        w2.start();

        try {
            w1.join();
            w2.join();
        } catch (InterruptedException e){}

        System.out.print(mapa);
    }
}