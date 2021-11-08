import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class clicksCounter implements ActionListener {

    int numberOfClicks = 0;
    JFrame ff;
    JLabel ll;
    JPanel pp;
    JButton bb;

    public clicksCounter() {

        ff = new JFrame();
        ll = new JLabel("Number of clicks: 0");
        bb = new JButton("Click");
        bb.addActionListener(this);

        pp = new JPanel();
        pp.setBorder(BorderFactory.createEmptyBorder(20, 100, 20, 100));
        pp.setLayout(new GridLayout(0, 1));
        pp.add(bb);
        pp.add(ll);

        ff.add(pp, BorderLayout.CENTER);
        ff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ff.setTitle("Click Counter");
        ff.pack();
        ff.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        numberOfClicks++;
        ll.setText("Number of clicks: " + numberOfClicks);

    }

    public static void main(String[] args) {

        new clicksCounter();

    }
}
