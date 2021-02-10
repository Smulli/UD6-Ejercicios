import javax.swing.JOptionPane;

public class Ejercicio3 {
	
	/*Creamos el m�todo main y dentro creamos una variable de tipo int donde introduciremos un n�mero 
	 * entero, despu�s compararemos si el n�mero es primo o no con el m�todo que hemos introducido 
	 * debajo del m�todo main.
	 */
	public static void main (String args[]) {
		
		int N = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
		
		if (FindCousin(N)) {
			JOptionPane.showMessageDialog(null, N+ " es primo ^n^");
		}
		else JOptionPane.showMessageDialog(null, N+ " no es primo VnV");
		
	}
	
	public static boolean FindCousin(int N) {
		
		int Residuo = 0;
		int I = 2;
		
		if (N < 1) {//Si N es menor a 1 no es primo.0
			return false;
		}
		else if (N == 1) {//Si N es igual a 1 es primo.
			return true;
		}
		else {//Si no mientras N sea distinto a I se devuelve el resto entre los valores de N y I.
			while(N!=I){
				
				Residuo = N%I;
				
				if (Residuo  == 0){
					return false;
				} 
				else I++;
			}
			return true;
		}
	}
}
					
				
				
				
