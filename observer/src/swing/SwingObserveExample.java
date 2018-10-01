package swing;

import javax.swing.*;
import java.awt.*;

public class SwingObserveExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserveExample example = new SwingObserveExample();
        example.go();
    }

    private void go() {
        frame = new JFrame();
        JButton button = new JButton("Deveria fazer isso?");
        button.addActionListener(e -> System.out.println("Angel: N�o fa�a, voc� deve se repreender!"));
        button.addActionListener(e -> System.out.println("Devil: Vamos l�, fa�a!"));

        // Set frame properties
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

   /* class AngelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("N�o fa�a, voc� deve se repreender!");
        }
    }

    class DevilListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Vamos l�, fa�a!");
        }
    }*/

}
