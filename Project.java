import javax.swing.*;
import java.awt.*;
import java.math.*;

public class Project {
    static int m, n;
    static BigInteger probability;

    public static void main(final String[] a) {

        final int input = JOptionPane.showConfirmDialog(null, "Do you want to know your odds of winning the lottery? ");
        if (input == 0) {
            try {
                m = Integer.parseInt(JOptionPane.showInputDialog("How many numbers do you need to draw? "));
            } catch (final NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "You didn't type an integer", "Error", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }

            if (m > 0) {
                try {
                    n = Integer.parseInt(JOptionPane.showInputDialog("Which is the highest numbers of draws? "));
                } catch (final NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "You didn't type an integer", "Error",
                            JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                }
                probability = BigInteger.valueOf(1);

                if (n > 0 && n > m) {
                    for (int i = 1; i <= m; i++) {
                        probability = probability.multiply(BigInteger.valueOf(n - i + 1)).divide(BigInteger.valueOf(i));
                    }

                    JOptionPane.showMessageDialog(null, "Your odds are 1 in " + probability + ". Good luck!");

                } else {
                    JOptionPane.showMessageDialog(null,
                            "The highest number of draws you typed is smaller than the numbers you need to draw!",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null,
                        "You typed 0 or a negative integer on the numbers you need to draw!", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else {
            System.exit(0);
        }

    }
}
