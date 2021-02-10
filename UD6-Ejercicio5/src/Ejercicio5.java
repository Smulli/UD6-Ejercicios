import javax.swing.JOptionPane;

public class Ejercicio5 {
	
	public static void main (String args[]) {
		
		int N = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
		String bin = binDecimal(N);
		JOptionPane.showMessageDialog(null, "el numero " +N+ " en binario es " +	bin);
	}
	
	//Creamos un método para que nos convierta el número entero que pusimos en N en binario.
	public static String binDecimal(int N) {
		
		String bin = "";
		String num;
		
		for(int val = N; val > 0; val/= 2) {
			
			if (val % 2 == 1) {
				num = "1";
			}
			else num = "0";
			bin = num+bin;
		}
		return bin;
	}
	

}
