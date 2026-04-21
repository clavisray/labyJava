import javax.swing.*;
import java.io.*;
import java.util.zip.GZIPOutputStream;
import java.util.zip.GZIPInputStream;

public class Main {
    public static void main(String[] args) throws Exception {

        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        JFileChooser chooser = new JFileChooser();

        // kompresja pliku do gz
        chooser.showOpenDialog(null);
        File file = chooser.getSelectedFile();

        FileInputStream fis = new FileInputStream(file);
        GZIPOutputStream gzip = new GZIPOutputStream(new FileOutputStream(file + ".gz"));

        int bajt;
        while ((bajt = fis.read()) != -1) {
            gzip.write(bajt);
        }

        fis.close();
        gzip.close();

        // dekompresja pliku do txt
        chooser.showOpenDialog(null);
        file = chooser.getSelectedFile();

        GZIPInputStream gis = new GZIPInputStream(new FileInputStream(file));
        FileOutputStream fos = new FileOutputStream(file + ".txt");

        while ((bajt = gis.read()) != -1) {
            fos.write(bajt);
        }

        gis.close();
        fos.close();
    }
}