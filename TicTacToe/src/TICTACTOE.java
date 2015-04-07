import javax.swing.*;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.event.*;

public class TICTACTOE extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static int spieler;
	private static int runde;
	private static int punkteX;
	private static int punkteO;
	private static JButton button1 = new JButton("");
	private static JButton button2 = new JButton("");
	private static JButton button3 = new JButton("");
	private static JButton button4 = new JButton("");
	private static JButton button5 = new JButton("");
	private static JButton button6 = new JButton("");
	private static JButton button7 = new JButton("");
	private static JButton button8 = new JButton("");
	private static JButton button9 = new JButton("");
	private static String x1;
	private static String x2;
	private static String x3;
	private static String x4;
	private static String x5;
	private static String x6;
	private static String x7;
	private static String x8;
	private static String x9;
	private static JTextField textX = new JTextField("PUNKTE X: 0");
	private static JTextField text = new JTextField(" Punktestand ");
	private static JTextField textO = new JTextField("PUNKTE O: 0");;
	

	// Grafische Darstellung der Buttons
	public void setColor(JButton y, JPanel x) {
		Font f = new Font(Font.SERIF, Font.PLAIN, 100);
		y.setBorder(BorderFactory.createLineBorder(Color.black, 5));
		y.setFont(f);
		y.setBackground(Color.white);
		y.addActionListener(this);
		x.add(y);
	}
	
	public void setTextField(JTextField x){
		
		x.setBackground(Color.white);
		x.setForeground(Color.black);	
	}

	public TICTACTOE() {
	
		
		JPanel x = new JPanel();
		x.setLayout(new GridLayout(4, 3));

		this.setTitle("TIC TAC TOE  --  Spieler O beginnt");
		this.setSize(750, 750);
		this.setLocation(300, 100);
		this.add(x);
		this.setVisible(true);
		
		
		
		x.add(textX);
		x.add(text);
		x.add(textO);
		
		Font ft = new Font(Font.SERIF, Font.PLAIN, 20);
		Font fx = new Font(Font.SERIF, Font.PLAIN, 30);
		Font fo = new Font(Font.SERIF, Font.PLAIN, 30);
		text.setFont(ft);
		textX.setFont(fx);
		textO.setFont(fo);
		
		text.setHorizontalAlignment(JTextField.CENTER);
		
		setTextField(text);
		setTextField(textO);
		setTextField(textX);
		
		

		setColor(button1, x);
		setColor(button2, x);
		setColor(button3, x);
		setColor(button4, x);
		setColor(button5, x);
		setColor(button6, x);
		setColor(button7, x);
		setColor(button8, x);
		setColor(button9, x);
		
		text.setEditable(false);
		textX.setEditable(false);
		textO.setEditable(false);
		
		

	}

	public static void main(String[] args) {

		TICTACTOE x = new TICTACTOE();
		
		x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void clearButton() {
		x1 = null;
		x2 = null;
		x3 = null;
		x4 = null;
		x5 = null;
		x6 = null;
		x7 = null;
		x8 = null;
		x9 = null;

		spieler = 1;

		button1.setText(null);
		button2.setText(null);
		button3.setText(null);
		button4.setText(null);
		button5.setText(null);
		button6.setText(null);
		button7.setText(null);
		button8.setText(null);
		button9.setText(null);

	}

	public void gewinnerTest() {
		
		
		if (spieler % 11 == 0) {
			this.setTitle("Unentschieden -- Spieler X ist an der Reihe!");
			runde++;
			String runden = "Runde:  "+runde;
			text.setText("Punktestand nach "+runden);
			clearButton();
		} else {

			if (x1 != null && x2 != null && x3 != null) {

				if (x1.equals(x2) && x2.equals(x3) && x1.equals(x3)) {
					if (x1.contains("O")) {
						this.setTitle("Spieler O hat gewonnen! Spieler X ist an der Reihe");
						clearButton();
						spieler = 1;
						runde++;
						punkteO++;
						String runden = "Runde:  "+runde;
						String punkte = "" +punkteO;
						text.setText("Punktestand nach "+runden);
						textO.setText("PUNKTE O: "+punkte);
					}
					if (x1.contains("X")) {
						this.setTitle("Spieler X hat gewonnen! Spieler O ist an der Reihe");
						clearButton();
						spieler = 2;
						runde++;
						punkteX++;
						String runden = "Runde:  "+runde;
						String punkte = "" +punkteX;
						text.setText("Punktestand nach "+runden);
						textX.setText("PUNKTE X: "+punkte);
					}
				}
			}

			if (x1 != null && x4 != null && x7 != null) {

				if (x1.equals(x4) && x4.equals(x7)) {
					if (x1.contains("O")) {
						this.setTitle("Spieler O hat gewonnen! Spieler X ist an der Reihe");
						clearButton();
						spieler = 1;
						runde++;
						punkteO++;
						String runden = "Runde:  "+runde;
						String punkte = "" +punkteO;
						text.setText("Punktestand nach "+runden);
						textO.setText("PUNKTE O: "+punkte);
					}
					if (x1.contains("X")) {
						this.setTitle("Spieler X hat gewonnen! Spieler O ist an der Reihe");
						clearButton();
						spieler = 2;
						runde++;
						punkteX++;
						String runden = "Runde:  "+runde;
						String punkte = "" +punkteX;
						text.setText("Punktestand nach "+runden);
						textX.setText("PUNKTE X: "+punkte);
					}

				}
			}

			if (x1 != null && x5 != null && x9 != null) {
				if (x1.equals(x5) && x5.equals(x9)) {
					if (x1.contains("O")) {
						this.setTitle("Spieler O hat gewonnen! Spieler X ist an der Reihe");
						clearButton();
						spieler = 1;
						runde++;
						punkteO++;
						String runden = "Runde:  "+runde;
						String punkte = "" +punkteO;
						text.setText("Punktestand nach "+runden);
						textO.setText("PUNKTE O: "+punkte);
					}
					if (x1.contains("X")) {
						this.setTitle("Spieler X hat gewonnen! Spieler O ist an der Reihe");
						clearButton();
						spieler = 2;
						runde++;
						punkteX++;
						String runden = "Runde:  "+runde;
						String punkte = "" +punkteX;
						text.setText("Punktestand nach "+runden);
						textX.setText("PUNKTE X: "+punkte);
					}
				}
			}
			if (x2 != null && x5 != null && x8 != null) {
				if (x2.equals(x5) && x5.equals(x8)) {
					if (x2.contains("O")) {
						this.setTitle("Spieler O hat gewonnen! Spieler X ist an der Reihe");
						clearButton();
						spieler = 1;
						runde++;
						punkteO++;
						String runden = "Runde:  "+runde;
						String punkte = "" +punkteO;
						text.setText("Punktestand nach "+runden);
						textO.setText("PUNKTE O: "+punkte);
					}
					if (x2.contains("X")) {
						this.setTitle("Spieler X hat gewonnen! Spieler O ist an der Reihe");
						clearButton();
						spieler = 2;
						runde++;
						punkteX++;
						String runden = "Runde:  "+runde;
						String punkte = "" +punkteX;
						text.setText("Punktestand nach "+runden);
						textX.setText("PUNKTE X: "+punkte);
					}
				}
			}
			if (x3 != null && x6 != null && x9 != null) {
				if (x3.equals(x6) && x6.equals(x9)) {
					if (x3.contains("O")) {
						this.setTitle("Spieler O hat gewonnen! Spieler X ist an der Reihe");
						clearButton();
						spieler = 1;
						runde++;
						punkteO++;
						String runden = "Runde:  "+runde;
						String punkte = "" +punkteO;
						text.setText("Punktestand nach "+runden);
						textO.setText("PUNKTE O: "+punkte);
					}
					if (x3.contains("X")) {
						this.setTitle("Spieler X hat gewonnen! Spieler O ist an der Reihe");
						clearButton();
						spieler = 2;
						runde++;
						punkteX++;
						String runden = "Runde:  "+runde;
						String punkte = "" +punkteX;
						text.setText("Punktestand nach "+runden);
						textX.setText("PUNKTE X: "+punkte);
					}
				}
			}
			if (x4 != null && x5 != null && x6 != null) {
				if (x4.equals(x5) && x5.equals(x6)) {
					if (x4.contains("O")) {
						this.setTitle("Spieler O hat gewonnen! Spieler X ist an der Reihe");
						clearButton();
						spieler = 1;
						runde++;
						punkteO++;
						String runden = "Runde:  "+runde;
						String punkte = "" +punkteO;
						text.setText("Punktestand nach "+runden);
						textO.setText("PUNKTE O: "+punkte);
					}
					if (x4.contains("X")) {
						this.setTitle("Spieler X hat gewonnen! Spieler O ist an der Reihe");
						clearButton();
						spieler = 2;
						runde++;
						punkteX++;
						String runden = "Runde:  "+runde;
						String punkte = "" +punkteX;
						text.setText("Punktestand nach "+runden);
						textX.setText("PUNKTE X: "+punkte);
					}
				}
			}
			if (x7 != null && x7 != null && x9 != null) {
				if (x7.equals(x8) && x8.equals(x9)) {
					if (x7.contains("O")) {
						this.setTitle("Spieler O hat gewonnen! Spieler X ist an der Reihe");
						clearButton();
						spieler = 1;
						runde++;
						punkteO++;
						String runden = "Runde:  "+runde;
						String punkte = "" +punkteO;
						text.setText("Punktestand nach "+runden);
						textO.setText("PUNKTE O: "+punkte);
					}
					if (x7.contains("X")) {
						this.setTitle("Spieler X hat gewonnen! Spieler O ist an der Reihe");
						clearButton();
						spieler = 2;
						runde++;
						punkteX++;
						String runden = "Runde:  "+runde;
						String punkte = "" +punkteX;
						text.setText("Punktestand nach "+runden);
						textX.setText("PUNKTE X: "+punkte);
					}
				}
			}
			if (x3 != null && x5 != null && x7 != null) {
				if (x3.equals(x5) && x5.equals(x7)) {
					if (x3.contains("O")) {
						this.setTitle("Spieler O hat gewonnen! Spieler X ist an der Reihe");
						clearButton();
						spieler = 1;
						runde++;
						punkteO++;
						String runden = "Runde:  "+runde;
						String punkte = "" +punkteO;
						text.setText("Punktestand nach "+runden);
						textO.setText("PUNKTE O: "+punkte);
					}
					if (x3.contains("X")) {
						this.setTitle("Spieler X hat gewonnen! Spieler O ist an der Reihe");
						clearButton();
						spieler = 2;
						runde++;
						punkteX++;
						String runden = "Runde:  "+runde;
						String punkte = "" +punkteX;
						text.setText("Punktestand nach "+runden);
						textX.setText("PUNKTE X: "+punkte);
					}
				}
			}
		}

	}

	public void actionPerformed(ActionEvent ae) {
		spieler++;
		
		
		this.setTitle("TIC TAC TOE");

		if (ae.getSource() == TICTACTOE.button1) {
			if (spieler % 2 == 1) {
				button1.setText("O");
				x1 = button1.getText();
				gewinnerTest();
			}

			if (spieler % 2 == 0) {
				button1.setText("X");
				x1 = button1.getText();
				gewinnerTest();
			}
		}

		if (ae.getSource() == TICTACTOE.button2) {
			if (spieler % 2 == 1) {
				button2.setText("O");
				x2 = button2.getText();
				gewinnerTest();
			}

			if (spieler % 2 == 0) {
				button2.setText("X");
				x2 = button2.getText();
				gewinnerTest();
			}
		}

		if (ae.getSource() == TICTACTOE.button3) {

			if (spieler % 2 == 1) {
				button3.setText("O");
				x3 = button3.getText();
				gewinnerTest();
			}

			if (spieler % 2 == 0) {
				button3.setText("X");
				x3 = button3.getText();
				gewinnerTest();
			}
		}
		if (ae.getSource() == TICTACTOE.button4) {
			if (spieler % 2 == 1) {
				button4.setText("O");
				x4 = button4.getText();
				gewinnerTest();
			}

			if (spieler % 2 == 0) {
				button4.setText("X");
				x4 = button4.getText();
				gewinnerTest();
			}
		}

		if (ae.getSource() == TICTACTOE.button5) {
			if (spieler % 2 == 1) {
				button5.setText("O");
				x5 = button5.getText();
				gewinnerTest();
			}

			if (spieler % 2 == 0) {
				button5.setText("X");
				x5 = button5.getText();
				gewinnerTest();
			}
		}

		if (ae.getSource() == TICTACTOE.button6) {
			if (spieler % 2 == 1) {
				button6.setText("O");
				x6 = button6.getText();
				gewinnerTest();
			}

			if (spieler % 2 == 0) {
				button6.setText("X");
				x6 = button6.getText();
				gewinnerTest();
			}
		}

		if (ae.getSource() == TICTACTOE.button7) {
			if (spieler % 2 == 1) {
				button7.setText("O");
				x7 = button7.getText();
				gewinnerTest();
			}

			if (spieler % 2 == 0) {
				button7.setText("X");
				x7 = button7.getText();
				gewinnerTest();
			}
		}

		if (ae.getSource() == TICTACTOE.button8) {
			if (spieler % 2 == 1) {
				button8.setText("O");
				x8 = button8.getText();
				gewinnerTest();
			}

			if (spieler % 2 == 0) {
				button8.setText("X");
				x8 = button8.getText();
				gewinnerTest();
			}
		}

		if (ae.getSource() == TICTACTOE.button9) {
			if (spieler % 2 == 1) {
				button9.setText("O");
				x9 = button9.getText();
				gewinnerTest();
			}

			if (spieler % 2 == 0) {
				button9.setText("X");
				x9 = button9.getText();
				gewinnerTest();
			}
		}

	}
}
