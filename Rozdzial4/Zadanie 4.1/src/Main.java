import javax.swing.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        String trescPliku = JOptionPane.showInputDialog(null, "Edytor tekstu, wprowadz wiadomosc, a nastepnie ja zapisz");
        String nazwaPliku = JOptionPane.showInputDialog(null, "Zapisz plik txt jako: ");

        try (OutputStreamWriter writer =
                new OutputStreamWriter(new FileOutputStream(nazwaPliku + ".txt"), "UTF-8")) {
            writer.write(trescPliku);
        }

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(nazwaPliku + ".txt"), "UTF-8"));
        String line = reader.readLine();
        JOptionPane.showMessageDialog(null, line);
    }
}