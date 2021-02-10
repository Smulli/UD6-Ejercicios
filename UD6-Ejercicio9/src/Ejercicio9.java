import java.util.Random;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Ejercicio9 {
	
	public static void main (String args[]) {
		
		//Le asignamos un tamaño a la array.
		int n[] = new int [Integer.parseInt(JOptionPane.showInputDialog("Introduzca tamaño de la array"))];
		
		
		rellenarArray(n, 0, 9);
		mostrar(n);
	}
	
	//Rellenamos las posiciones con valores aleatorios con el método Math.random.
	public static void rellenarArray (int v[], int a, int b) {
		
		for(int list = 0; list < v.length; list++) {
			
			
			v[list] = ((int)Math.floor(Math.random()*(a-b)+b));
		}
	}
	
	public static void mostrar(int v[]) {
		
		for(int list = 0; list < v.length; list++) {
			
			System.out.println("En el indice " +list+ " contiene el valor " +v[list]);
		}
	}
	
}

		
			
			
		
		
