import java.util.Scanner;
import javax.swing.*;



public class RechnerMain{

	 


	public static void main(String[] args) {
		//a int Variable für das ausgegebene Resultat
		int a = 0;
		//Für die Validierung der Eingabe des Operators
		boolean test = false;
		//Neues Fenster
		RechnerMain g = new RechnerMain();
		//Begrüssung
		System.out.println("Willkommen zum Simplen Rechner");
		//Build new Scanner
		Scanner sc = new Scanner(System.in);
		//Validierung solange bis richtiger Operator eingegeben wird
		while(test == false){
		//Einlesen des Operators
		System.out.println("Bitte geben sie ihre gewüschten Operator ein");
		String i = sc.next();
		//Einlesen der Zahlen
		System.out.println("Bitte geben sie ihre erste Zahl ein");
		int x = sc.nextInt();
		System.out.println("Bitte geben sie ihre zweite Zahl ein");
		int y = sc.nextInt();
		
		//Operation nach zuvor gewählten Operator i
		if(i.contains("+")){
			a = addition(x, y);
			System.out.println("Resultat: "+ x + i + y + " = " + a);
			System.out.println("BEENDEN? Y/N");
			String q = sc.next();
			
			if(q.contains("y")){
				test = true;
			}
			else{
				test = false;
			}
		}
			
		if(i.contains("-")){
			a = subtraktion(x, y);
			System.out.println("Resultat: "+ x + i + y + "=" + a);
			System.out.println("BEENDEN? Y/N");
			String q = sc.next();
			
			if(q.contains("y")){
				test = true;
			}
			else{
				test = false;
			}
		}
		if(i.contains("/")){
			a = division(x, y);
			System.out.println("Resultat: "+ x + i + y + "=" + a);
			System.out.println("BEENDEN? Y/N");
			String q = sc.next();
			
			if(q.contains("y")){
				test = true;
			}
			else{
				test = false;
			}
		}
		if(i.contains("*")){
			a = multiplikation(x, y);
			System.out.println("Resultat: "+ x + i + y + "=" + a);
			System.out.println("BEENDEN? Y/N");
			String q = sc.next();
			
			if(q.contains("y")){
				test = true;
			}
			else{
				test = false;
			}
		}
		else{
			System.out.println("Bitte einen der folgenden Operatoren eingeben + - * / ");
			test = false;
		}
		}
	}
	//Definition der verschidenen Rechnungen
		public static int addition(int x, int y){
			return x + y;
		}
	
		public static int subtraktion(int x, int y){
			return x - y;
		}
	
		public static int multiplikation(int x, int y){
			return x * y;
		}
	
		public static int division(int x, int y){
			return x / y;
		}
		
	
		 
			 
			
			

}	

