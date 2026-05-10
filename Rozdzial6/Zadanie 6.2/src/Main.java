import java.util.*;
class MapaKomunikatow {
    private HashMap mapa = new HashMap();
    public synchronized void dodaj(String klucz, Integer wartosc) {
        mapa.put(klucz, wartosc);
    }

    public Integer pobierz(String klucz) {
        return (Integer) mapa.get(klucz);
    }
}
class Watek extends Thread {

}
public class Main {
    public static void main(String args[]) {

    }
}