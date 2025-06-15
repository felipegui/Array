import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class IntArray {
    public static void main(String[] args) {

        final int ARRAY_SIZE = 10;
        int array[];

        array = new int[ ARRAY_SIZE ];

        for (int counter = 0; counter < array.length; counter++) {
            array[ counter ] = 2 + 2 * counter;
        }

        String output = "Índice\tValores\n";

        for (int counter = 0; counter < array.length; counter++) {
            output += counter + "\t" + array[ counter ] + "\n";
        }

        JTextArea outputArea = new JTextArea();
        outputArea.setText(output);

        JOptionPane.showMessageDialog(null, outputArea, "Initializing to Even Numbers from 2 to 20",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
