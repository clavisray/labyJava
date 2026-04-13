import javax.swing.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        String trescPliku = JOptionPane.showInputDialog(null, "Edytor tekstu, wprowadz wiadomosc, a nastepnie ja zapisz");
        String nazwaPliku = JOptionPane.showInputDialog(null, "Zapisz plik txt jako: ");

        try (OutputStreamWriter writer =
                new OutputStreamWriter(new FileOutputStream(nazwaPliku + ".txt"), "UTF-8")) {
            writer.write(trescPliku);
        }

        JFileChooser chooser = new JFileChooser();
        int result = chooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(new FileInputStream(file), "UTF-8")
            );

            String line = reader.readLine();
            JOptionPane.showMessageDialog(null, line);

            reader.close();
        }
    }
}