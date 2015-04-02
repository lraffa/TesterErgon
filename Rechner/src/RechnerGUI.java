import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class RechnerGUI extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Definition der Buttons, Panel und der anzeige
	 private JButton button1;
	 private JButton button2;
	 private JButton button3;
	 private JButton button4;
	 private JButton button5;
	 private JButton button6;
	 private static String storeMath = "";
	 private static String zahl1;
	 private static String zahl2;
	 private static String str1;
	 private JTextField math;
	 private JTextField Nr1;
	 private JTextField Nr2;
	 private JTextField mathB;
	 private JTextField Nr1B;
	 private JTextField Nr2B;
	 private JTextField resultatB;
	 private static JTextField resultat;
	 private Font font = new Font(Font.SANS_SERIF, Font.BOLD, 14 );
	 
	   public RechnerGUI()
	   {
	       setLayout(null);
	       setLocation(300,300);
	       setSize(300, 300);
	       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       
	 
	       
	       button1 = new JButton("Resultat");
	       button2 = new JButton("Übernehmen");
	       button3 = new JButton("*");
	       button4 = new JButton("/");
	       button5 = new JButton("-");
	       button6 = new JButton(" + ");
	       mathB = new JTextField();
	       Nr1B = new JTextField();
	       Nr2B = new JTextField();
	       resultat = new JTextField();
	       //math = new JTextField();
	       Nr1 = new JTextField();
	       Nr2 = new JTextField();
	       resultatB = new JTextField();
	       button1.addActionListener(this);
	       button2.addActionListener(this);
	       button3.addActionListener(this);
	       button4.addActionListener(this);
	       button5.addActionListener(this);
	       button6.addActionListener(this);
	       
	       add(button1);
	       add(button2);
	       add(button3);
	       add(button4);
	       add(button5);
	       add(button6);
	       //add(math);
	       add(Nr1);
	       add(Nr2);
	       add(resultat);
	       add(mathB);
	       add(Nr1B);
	       add(Nr2B);
	       add(resultatB);
	       
	       mathB.setBounds(100,0,140,50);
	       Nr1B.setBounds(0,0,90,50);
	       Nr2B.setBounds(250,0,90,50);
	       resultatB.setBounds(450,0,90,50);
	       button1.setBounds(350,50,90,90);
	       button2.setBounds(350,0,90,50);
	       button3.setBounds(100,50,50,40);
	       button4.setBounds(100,100,50,40);
	       button5.setBounds(160,100,50,40);
	       button6.setBounds(160,50,50,40);
	       //math.setBounds(100,50,140,90);
	       Nr1.setBounds(0,50,90,90);
	       Nr2.setBounds(250,50,90,90);
	       resultat.setBounds(450,50,90,90);
	       
	       mathB.setText("Operator  +  -  *  /");
	       Nr1B.setText("Zahl1");
	       Nr2B.setText("Zahl2");
	       resultatB.setText("Resultat");
	       mathB.setFont(font);
	       Nr1B.setFont(font);
	       Nr2B.setFont(font);
	       resultatB.setFont(font);
	       pack();
	       setVisible(true);
	      
	   }

	public static void main(String[] args) {
		
		
		//Neues Fenster
		RechnerGUI g = new RechnerGUI();
		g.setSize(600, 200);
		
	}

	//Definition der verschidenen Rechnungen
		public static double addition(double x, double y){
			return x + y;
		}
	
		public static double subtraktion(double x, double y){
			return x - y;
		}
	
		public static double multiplikation(double x, double y){
			return x * y;
		}
	
		public static double division(double x, double y){
			return x / y;
		}
		
		//Per Knopf Funktion aufrufen
			public void actionPerformed(ActionEvent ae){
				   if(ae.getSource() == this.button1){
					 //a int Variable für das ausgegebene Resultat
						double a = 0;
						double a1 = 0;
						
			            //storeMath = math.getText();
			            zahl1 = Nr1.getText();
			            zahl2 = Nr2.getText();
			    		
			    		//while(test == false){
			    		double x = Double.parseDouble(zahl1);
			            double y = Double.parseDouble(zahl2);
			    		//Operation nach zuvor gewählten Operator i
			    		if(storeMath.contains("+")){
			    			a = addition(x, y);
			    			a = Math.round(a*100000000)/100000000.0;
			    			String str1 = ("" + a);
			    			resultat.setText(str1);
			    			
			    			
			    		}
			    			
			    		if(storeMath.contains("-")){
			    			a = subtraktion(x, y);
			    			a = Math.round(a*100000000)/100000000.0;
			    			String str1 = ("" + a);
			    			resultat.setText(str1);
			    			
			    			
			    		}
			    		if(storeMath.contains("/")){
			    			a1 = division(x, y);
			    			a1 = Math.round(a1*100000000)/100000000.0;
			    			String str1 = ("" + a1);
			    			resultat.setText(str1);
			    			
			    			
			    		}
			    		if(storeMath.contains("*")){
			    			a = multiplikation(x, y);
			    			a = Math.round(a*100000000)/100000000.0;
			    			String str1 = ("" + a);
			    			resultat.setText(str1);
			    			
			    	
			    		}
			    		
			    		
			  }
			  
			  if(ae.getSource() == this.button2){
				   str1 = resultat.getText();
				   Nr1.setText(str1);
			  }
			  
			  if(ae.getSource() == this.button3){
				   storeMath = "*";
			  }
			  
			  if(ae.getSource() == this.button4){
				  storeMath = "/";
			  }
			  
			  if(ae.getSource() == this.button5){
				  storeMath = "-";
			  }
			  
			  if(ae.getSource() == this.button6){
				  storeMath = "+";
			  }
			 }; 
			  
		 }
			 
			
			



