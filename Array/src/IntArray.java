import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class IntArray {
    public static void main(String[] args) {

        int array[];

        array = new int[10];

        String output = "Índice\tValores\n";

        for (int counter = 0; counter < array.length; counter++) {
            output += counter + "\t" + array[counter] + "\n";
        }
        JTextArea outputArea = new JTextArea();
        outputArea.setText(output);

        JOptionPane.showMessageDialog(null, outputArea, "Initializing an Array of int Values",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
