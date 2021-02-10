import javax.swing.JOptionPane;
import java.util.Arrays;

public class Ejercicio10 {
	
	public static void main (String args[]) {
		
		int n[] = new int [Integer.parseInt(JOptionPane.showInputDialog("Introduzca tamaño del array"))];
		boolean esMayor = true; //Esta variable del tipo booleano nos servirá para saber cual número primo es mayor.
		
		rellenarArray(n, 1, 100);
		mostrar(n);
		
		int mCousin = mayor(n);
		
		System.out.println("El primo mayor es el " +mCousin);
	}
	
	public static void rellenarArray(int v[], int a, int b) {
		
		int list = 0;
		
		while(list<v.length) {
			
			int n = ((int)Math.floor(Math.random()*(a-b)+b));
			
			if(isCousin(n)) {
				
				v[list] = n;
				list++;
			}
		}
	}
	
	//Creamos el método para comprobar si es primo.
	public static boolean isCousin(int n) {
		
		int residuo = 0;
		int m = 2;
		
		if (n < 1) {
			return false;
		}
		else if (n == 1) {
			return true;
		}
		else {
			while(n!=m){
				
				residuo = n%m;
				
				if (residuo  == 0){
					return false;
				}
				else m++;
			}
			return true;
		}
	}
	public static void mostrar (int v[]) {
		
		for(int list = 0; list < v.length; list++) {
			
			System.out.println("En el indice " +list+ " contiene el valor " +v[list]);
		}
	}
	
	//Creamos el método para saber cual es el primo mayor.
	public static int mayor (int v[]) {
		
		int mayor = 0;
		
		for(int list = 0; list < v.length; list++) {
			
			if (v[list] > mayor) {
				
				mayor = v[list];
			}
		}
		return mayor;
	}
	
	
}
		
		
