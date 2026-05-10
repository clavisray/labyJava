//empty draft
import java.net.*;
import java.io.*;
public class Zadanie {
    public static void main(String[] args) {
        String nazwahosta;
        if (args.length > 0) {
            nazwahosta = args[0];
        }
        else {
            nazwahosta = "time-a.nist.gov";
        }
        try {
            Socket gniazdo = new Socket(nazwahosta, 13);
            InputStream strumien = gniazdo.getInputStream();
            BufferedReader bufor = new BufferedReader(
                    new InputStreamReader(strumien));
            String wiersz = "";
            while (wiersz != null) {
                System.out.println(wiersz);
                wiersz = bufor.readLine();
            }
        }
        catch (UnknownHostException e) {
            System.err.println(e);
        }
        catch (IOException e) {
            System.err.println(e);
        }
    }
}