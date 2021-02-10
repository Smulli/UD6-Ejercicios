import javax.swing.JOptionPane;

public class Ejercicio4 {
	
	public static void main (String args[]) {
		
		int N = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
		JOptionPane.showMessageDialog(null, "el factorial de " +N+ " es " +	factor(N));
	}
	
	//Creamos un método para que nos de el factorial de N.
	public static int factor (int N) {
		
		int result = N;
		
		for(int cont = (N - 1); cont > 0; cont--) {
			
			result = result * cont;
		}
		return result;
	}

}
