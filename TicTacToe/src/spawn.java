import java.awt.Color;
import java.awt.Font;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class spawn {
	JButton b1 = new JButton();

	public spawn() {
		Random randomGenerator = new Random();
		int x = randomGenerator.nextInt(3000);
		int y = randomGenerator.nextInt(1000);
		int i = randomGenerator.nextInt(10);
		int j = randomGenerator.nextInt(10);
		Font font = new Font(null, Font.BOLD | Font.ITALIC, 20);

		JFrame f = new JFrame();
		f.setAlwaysOnTop(true);
		f.setVisible(true);
		f.setLocation(x, y);
		f.setSize(200, 200);
		f.add(b1);
		b1.setText("HAHA");
		b1.setFont(font);

		if (i % 3 == 1) {
			b1.setBackground(Color.red);
			b1.setText("FUCK");
			b1.add(new JLabel(new ImageIcon("")));

		}
		if (i % 3 == 0) {
			b1.setBackground(Color.blue);
			b1.setText("THE");

		}
		if (i % 3 == 2) {
			b1.setBackground(Color.white);
			b1.setText("SYSTEM");
			;
		}

		if (j % 3 == 1) {
			b1.setBackground(Color.red);
			b1.setForeground(Color.white);

		}
		if (j % 3 == 0) {
			b1.setBackground(Color.blue);
			b1.setForeground(Color.white);

		}
		if (j % 3 == 2) {
			b1.setBackground(Color.white);
			b1.setForeground(Color.black);
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			spawn x = new spawn();
		}
	}
}
