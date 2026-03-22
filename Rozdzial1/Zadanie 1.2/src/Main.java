import javax.swing.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {

        BigInteger wartosc = new BigInteger(
                JOptionPane.showInputDialog(null, "Wprowadz wartosc")
        );

        BigInteger silnia = BigInteger.ONE;

        for (int i = 1; BigInteger.valueOf(i).compareTo(wartosc) <= 0; i++) {
            silnia = silnia.multiply(BigInteger.valueOf(i));
        }

        JOptionPane.showMessageDialog(null, "Silnia = " + silnia);
    }
}