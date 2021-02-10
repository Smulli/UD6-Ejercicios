import javax.swing.JOptionPane;

public class Ejercicio6 {
	
	public static void main (String args[]) {
		int N = 0;
		
		//Hacemos que el entero que pasemos por N pase por el método countCif.
		do {
			N = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero positivo"));
		}while(N < 0);
		
		int numCif = countCif (N);
		
		if (numCif == 1) {
			JOptionPane.showMessageDialog(null, "el numero " +N+ " tiene " +numCif+ " cifras. ");
		}
		else JOptionPane.showMessageDialog(null, "el numero " +N+ " tiene " +numCif+ " cifras.	");
		
	}
	//El método countCif nos permite saber las cifras de un entero.
	public static int countCif (int N) {
		
		int count = 0;
		
		for (int num = N; num > 0; num /= 10) {
			
			count++;
		}
		return count;
	}
}



		
	

