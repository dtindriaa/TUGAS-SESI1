package dita.program;
import javax.swing.JOptionPane;

/**
 *
 * @author Dita Indriawati
 */
public class Java2 {
    public static void main(String[] args){
        String namaTeman = JOptionPane.showInputDialog("Anda sedang belajar apa?");
        JOptionPane.showMessageDialog(null, "Belajar "+namaTeman+" Sangat mudah");
    }
}