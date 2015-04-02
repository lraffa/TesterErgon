
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class RechnerPro extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Definition der Buttons, Panel und Variablen
	 private JButton button1;
	 private JButton button2;
	 private JButton button3;
	 private JButton button4;
	 private JButton button5;
	 private JButton button6;
	 private JButton button7;
	 private JButton button8;
	 private JButton button9;
	 private static String zahl1;
	 private static String str1;
	 private JTextField Nr1;
	 private JTextField Nr1B;
	 private Font font = new Font(Font.SANS_SERIF, Font.BOLD, 14 );
	
	 
	 //Erstellen eines Rechners
	   public RechnerPro()
	   {
	       setLayout(null);
	       setLocation(300,300);
	       setSize(300, 300);
	       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       
	 
	       //Erstellen der Buttons
	       button1 = new JButton("=");
	       button2 = new JButton("Übernehmen");
	       button3 = new JButton("Wurzel");
	       button4 = new JButton("Clear");
	       button5 = new JButton("+");
	       button6 = new JButton("-");
	       button7 = new JButton("*");
	       button8 = new JButton("/");
	       button9 = new JButton("^");
	       //Erstellen der TExtfelder
	       Nr1 = new JTextField();
	       Nr1B = new JTextField();
	       
	       
	       //Actionlistener
	       button1.addActionListener(this);
	       button2.addActionListener(this);
	       button3.addActionListener(this);
	       button4.addActionListener(this);
	       button5.addActionListener(this);
	       button6.addActionListener(this);
	       button7.addActionListener(this);
	       button8.addActionListener(this);
	       button9.addActionListener(this);
	       
	       Nr1.addKeyListener(tfKeyListener);	       
	       //hinzufügen der Widgets
	       add(button1);
	       add(button2);
	       add(button3);
	       add(button4);
	       add(button5);
	       add(button6);
	       add(button7);
	       add(button8);
	       add(button9);
	       add(Nr1);
	       add(Nr1B);
	       
	       
	       //Positionierung
	       Nr1B.setBounds(0,0,150,50);
	       Nr1.setBounds(0,50,150,50);
	       button1.setBounds(100,200,50,50);
	       button2.setBounds(0,250,150,50);
	       button3.setBounds(0,100,75,50);
	       button4.setBounds(75,100,75,50);
	       button5.setBounds(50,150,50,50);
	       button6.setBounds(0,150,50,50);
	       button7.setBounds(50,200,50,50);
	       button8.setBounds(0,200,50,50);
	       button9.setBounds(100,150,50,50);
	              
	       //Beschriften der Textfelder
	       Nr1B.setText("Operation");
	       Nr1B.setFont(font);
	       pack();
	       setVisible(true);
	      
	   }

	public static void main(String[] args) {
		
		
		//Neues Fenster
		RechnerPro g = new RechnerPro();
		g.setSize(100, 350);
		
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
		
		public static double hoch(double x, double y){
			double a = Math.pow(x, y);
			return a;
		}
		
		public static int buchstabenzaehler(String Zeichenkette, char buchstabe)
		{
		   int counter =0;
		   for (int i=0;i< Zeichenkette.length();i++)
		   {
		        if (Zeichenkette.charAt(i) == buchstabe) counter++;
		   }

		return counter;
		}
		//Per Knopf Funktion aufrufen
			public void actionPerformed(ActionEvent ae){
				   if(ae.getSource() == this.button1){
					 //a int Variable für das ausgegebene Resultat
						double a = 0;
			            zahl1 = Nr1.getText();
			           			    		
			    		
			    		//Operation nach zuvor gewählten Operator i
			    		if(zahl1.contains("+")){
			    			
			    			int b = buchstabenzaehler(zahl1, '+');			    			
			    			String[] zahlenW = new String[100];
			    			int[] index = new int[100];
			    			double[]zahlen = new double[100];
			    			String rechnung = zahl1;
			    			
			    			index[0] = zahl1.indexOf("+");
			    			zahlenW[0] = zahl1.substring(0, index[0]);
			    			zahlen[0] = Double.parseDouble(zahlenW[0]);
			    			zahl1 = zahl1.substring(index[0]+1);
			    			
			    			for(int i=1; i<b+1; i++ ){
			    				if(i<b){
			    				index[i] = zahl1.indexOf("+");
			    				zahlenW[i] = zahl1.substring(0, index[i]);
			    				zahl1 = zahl1.substring(index[i]+1);
			    				zahlen[i] = Double.parseDouble(zahlenW[i]);
			    				
			    				}
			    				else{
			    					index[i] = zahl1.lastIndexOf("+");
			    					zahlenW[i] = zahl1.substring(index[i]+1);
				    				zahlen[i] = Double.parseDouble(zahlenW[i]);
			    				}
			    			}
			    			a = 0;
			    			for(int i=0;i<b+1;i++){
			    				
			    				a= addition(a, zahlen[i]);
			    			}
			    			a = Math.round(a*100000000)/100000000.0;
			    			String str1 = ("" + a);
			    			Nr1.setText(rechnung + " = " + str1);	
			    			
			    		}
				   
			    		if(zahl1.contains("-")){
			    			int b = buchstabenzaehler(zahl1, '-');
			    			String[] zahlenW = new String[100];
			    			int[] index = new int[100];
			    			double[]zahlen = new double[100];
			    			String rechnung = zahl1;
			    			
			    			index[0] = zahl1.indexOf("-");
			    			zahlenW[0] = zahl1.substring(0, index[0]);
			    			zahlen[0] = Double.parseDouble(zahlenW[0]);
			    			zahl1 = zahl1.substring(index[0]+1);
			    			
			    			for(int i=1; i<b+1; i++ ){
			    				if(i<b){
			    				index[i] = zahl1.indexOf("-");
			    				zahlenW[i] = zahl1.substring(0, index[i]);
			    				zahl1 = zahl1.substring(index[i]+1);
			    				zahlen[i] = Double.parseDouble(zahlenW[i]);
			    				
			    				}
			    				else{
			    					index[i] = zahl1.lastIndexOf("-");
			    					zahlenW[i] = zahl1.substring(index[i]+1);
				    				zahlen[i] = Double.parseDouble(zahlenW[i]);
			    				}
			    			}
			    			a = 0;
			    			for(int i=1;i<b+2;i++){
			    				if(i==1){
			    					a= subtraktion(zahlen[0],zahlen[i]);
			    				}
			    				else{
			    				a= subtraktion(a, zahlen[i]);
			    				}
			    			}
			    			a = Math.round(a*100000000)/100000000.0;
			    			String str1 = ("" + a);
			    			Nr1.setText(rechnung + " = " + str1);
			    			
			    			
			    		}
			    		if(zahl1.contains("/")){
			    			int b = buchstabenzaehler(zahl1, '/');
			    			String[] zahlenW = new String[100];
			    			int[] index = new int[100];
			    			double[]zahlen = new double[100];
			    			String rechnung = zahl1;
			    			
			    			index[0] = zahl1.indexOf("/");
			    			zahlenW[0] = zahl1.substring(0, index[0]);
			    			zahlen[0] = Double.parseDouble(zahlenW[0]);
			    			zahl1 = zahl1.substring(index[0]+1);
			    			
			    			for(int i=1; i<b+1; i++ ){
			    				if(i<b && zahlen[i] != 0){
			    				index[i] = zahl1.indexOf("/");
			    				zahlenW[i] = zahl1.substring(0, index[i]);
			    				zahl1 = zahl1.substring(index[i]+1);
			    				zahlen[i] = Double.parseDouble(zahlenW[i]);
			    				
			    				}
			    				else{
			    					index[i] = zahl1.lastIndexOf("/");
			    					zahlenW[i] = zahl1.substring(index[i]+1);
				    				zahlen[i] = Double.parseDouble(zahlenW[i]);
				    				
			    				}
			    			}
			    			a = 0;
			    			for(int i=1;i<b+1;i++){
			    				if(i==1){
			    					a= division(zahlen[0],zahlen[i]);
			    				}
			    				else{
			    				a= division(a, zahlen[i]);
			    				}
			    			}
			    			a = Math.round(a*100000000)/100000000.0;
			    			String str1 = ("" + a);
			    			Nr1.setText(rechnung + " = " + str1);
			    		}
			    		if(zahl1.contains("*")){
			    			int b = buchstabenzaehler(zahl1, '*');			    			
			    			String[] zahlenW = new String[100];
			    			int[] index = new int[100];
			    			double[]zahlen = new double[100];
			    			String rechnung = zahl1;
			    			
			    			index[0] = zahl1.indexOf("*");
			    			zahlenW[0] = zahl1.substring(0, index[0]);
			    			zahlen[0] = Double.parseDouble(zahlenW[0]);
			    			zahl1 = zahl1.substring(index[0]+1);
			    			
			    			for(int i=1; i<b+1; i++ ){
			    				if(i<b){
			    				index[i] = zahl1.indexOf("*");
			    				zahlenW[i] = zahl1.substring(0, index[i]);
			    				zahl1 = zahl1.substring(index[i]+1);
			    				zahlen[i] = Double.parseDouble(zahlenW[i]);
			    				
			    				}
			    				else{
			    					index[i] = zahl1.lastIndexOf("*");
			    					zahlenW[i] = zahl1.substring(index[i]+1);
				    				zahlen[i] = Double.parseDouble(zahlenW[i]);
				    				
			    				}
			    			}
			    			a = 0;
			    			for(int i=1;i<b+1;i++){
			    				if(i==1){
			    					a= multiplikation(zahlen[0],zahlen[i]);
			    				}
			    				else{
			    				a= multiplikation(a, zahlen[i]);
			    				}
			    			}
			    			a = Math.round(a*100000000)/100000000.0;
			    			String str1 = ("" + a);
			    			Nr1.setText(rechnung + " = " + str1);
			    	
			    		}
			    		if(zahl1.contains("^")){
			    			int b = buchstabenzaehler(zahl1, '^');			    			
			    			String[] zahlenW = new String[100];
			    			int[] index = new int[100];
			    			double[]zahlen = new double[100];
			    			String rechnung = zahl1;
			    			
			    			index[0] = zahl1.indexOf("^");
			    			zahlenW[0] = zahl1.substring(0, index[0]);
			    			zahlen[0] = Double.parseDouble(zahlenW[0]);
			    			zahl1 = zahl1.substring(index[0]+1);
			    			
			    			for(int i=1; i<b+1; i++ ){
			    				if(i<b){
			    				index[i] = zahl1.indexOf("^");
			    				zahlenW[i] = zahl1.substring(0, index[i]);
			    				zahl1 = zahl1.substring(index[i]+1);
			    				zahlen[i] = Double.parseDouble(zahlenW[i]);
			    				
			    				}
			    				else{
			    					index[i] = zahl1.lastIndexOf("^");
			    					zahlenW[i] = zahl1.substring(index[i]+1);
				    				zahlen[i] = Double.parseDouble(zahlenW[i]);
				    				
			    				}
			    			}
			    			a = 0;
			    			for(int i=1;i<b+1;i++){
			    				if(i==1){
			    					a= hoch(zahlen[0],zahlen[i]);
			    				}
			    				else{
			    				a= hoch(a, zahlen[i]);
			    				}
			    			}
			    			a = Math.round(a*100000000)/100000000.0;
			    			String str1 = ("" + a);
			    			Nr1.setText(rechnung + " = " + str1);
			    	
			    		}
			    		
			    		//if(zahl1.contains("*") || zahl1.contains("/") || zahl1.contains("-")  || zahl1.contains("+") || zahl1.contains("^")){
			    		//	Nr1.setForeground(Color.black);
			    		//}
			    		
			    	//	else{
			    		//	Nr1.setForeground(Color.red);
			    		//	Nr1.setText(" Invalid operation use (+) (-) (*) (/) (^)");
			    		//}
			  }
			  
				   if(ae.getSource() == this.button2){
					   str1 = Nr1.getText();
					   int index1 = str1.indexOf('=');
					   String s2 = str1.substring( index1 + 1);
					   Nr1.setText(s2);
				   }
				   
				   if(ae.getSource() == this.button3){
					   zahl1 = Nr1.getText();
					   double x = Double.parseDouble(zahl1);
					   double a = Math.sqrt(x);
					   a = Math.round(a*100000000)/100000000.0;
					   String str1 = ("" + a);
					   Nr1.setForeground(Color.black);
					   Nr1.setText(str1);
					   
				   }
				   
				   if(ae.getSource() == this.button4){
					   Nr1.setText("");
				   }
				   
				   if(ae.getSource() == this.button5){
					  String y = Nr1.getText();
					  Nr1.setText(y + "+");
				   }
				   
				   if(ae.getSource() == this.button6){
						  String y = Nr1.getText();
						  Nr1.setText(y + "-");
					   }
				   
				   if(ae.getSource() == this.button7){
						  String y = Nr1.getText();
						  Nr1.setText(y + "*");
					   }
				   
				   if(ae.getSource() == this.button8){
						  String y = Nr1.getText();
						  Nr1.setText(y + "/");
					   }
				   
				   if(ae.getSource() == this.button9){
						  String y = Nr1.getText();
						  Nr1.setText(y + "^");
					   }
			  
		
		}; 
		KeyListener tfKeyListener = new KeyAdapter() {
			public void keyPressed(KeyEvent evt) {
			if (evt.getKeyCode() == KeyEvent.VK_ENTER)
			button1.doClick();
			}
			};
			  
}
			 
			
			



