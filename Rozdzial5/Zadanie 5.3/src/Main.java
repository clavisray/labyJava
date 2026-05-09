import java.util.*;
class Graf {
    private int n; // liczba wierzchołków, V = {0,1,...,n-1}
    private LinkedList[] tab; // tablica wierzchołków połączo-
// nych z danym wierzcholkiem

    public Graf(String lan) {
        StringTokenizer st = new StringTokenizer(lan, "() ,");
        n = Integer.parseInt(st.nextToken());
        tab = new LinkedList[n];
        for (int i=0; i<n; ++i)
            tab[i] = new LinkedList();
        while (st.hasMoreTokens()) {
            tab[Integer.parseInt(st.nextToken())].add(
                    new Integer(st.nextToken()));
        }
    }
    public String toString() {

        StringBuffer sb1 = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb1.append(i).append(": ");

            for (int j = 0; j < tab[i].size(); j++){
                sb1.append(tab[i].get(j)).append(" ");
            }
            sb1.append("\n");
        }

        return sb1.toString();
    }
}
public class Main {
    public static void main(String[] args) {
        Graf g = new Graf("4, (0,1), (1,2), (3,0), (1,3)");
        System.out.println(g.toString());
    }
}