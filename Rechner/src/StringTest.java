
public class StringTest {
	public static int buchstabenzaehler(String Zeichenkette, char buchstabe)
	{
	   int counter =0;
	   for (int i=0;i< Zeichenkette.length();i++)
	   {
	        if (Zeichenkette.charAt(i) == buchstabe) counter++;
	   }
	   return counter;
	}
	

	
	public static double subtraktion(double x, double y){
		return x -y;
	}
	  static String zahl1 = "1+2-13" ;
	  static double a = 0;
	  
	public static void main(String[] args){
		int minus = buchstabenzaehler(zahl1, '-');
		int plus = buchstabenzaehler(zahl1, '-');
		
		String[] zahlenW = new String[100];
		int[] index = new int[100];
		double[]zahlen = new double[100];
		String rechnung = zahl1;
		
		if(zahl1.indexOf("-") < zahl1.indexOf("+")){
			int b = buchstabenzaehler(zahl1, '+');
		while(plus >0){
			plus --;
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
		System.out.println(rechnung + " = " + str1);
	}
	}
	}
}
