import java.util.Arrays;
import javax.swing.JOptionPane;

public class Ejercicio8 {
	
	public static void main(String args[]) {
		
		//Creamos la array de 10 posiciones.
		int n[] = new int[10];
		
		//Llamamos a los dos métodos debajo del método main y les asignamos el valor de la variable n.
		valor(n);
		mostrar(n);
		
		
	}
	
	public static void valor (int v[]) {
		
		//Creamos un bucle que nos permita introducir valores para las 10 posiciones.
		for(int list = 0; list < v.length; list++) {
			
			v[list] = Integer.parseInt(JOptionPane.showInputDialog("Introduzca 10 valores"));
		}
		
	}
	public static void mostrar(int v[]) {
		
		/*Se genera un indice por cada posición en la array y se pasan los valores previamente 
		 * introducidos en cada posición.
		 */
		for(int list = 0; list < v.length; list++) {
			
			System.out.println("En el indice " +list+ " contiene el valor " +v[list]);
		} 
	}
}
		
		

		
