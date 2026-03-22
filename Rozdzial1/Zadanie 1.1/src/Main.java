import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args){

        String napis = JOptionPane.showInputDialog(null, "Wprowadz wartosc");

        JOptionPane.showMessageDialog(null, "Przed zmianami: " + napis);
        JOptionPane.showMessageDialog(null, "Po zmianach: " + napis.toUpperCase());

    }
}