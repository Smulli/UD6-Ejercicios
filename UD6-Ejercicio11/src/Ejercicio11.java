import javax.swing.JOptionPane;
import java.util.Arrays;

public class Ejercicio11 {
	
	public static void main(String args[]) {
		
		//Introducimos 2 arrays. 
		int n = (Integer.parseInt(JOptionPane.showInputDialog("Introduzca tamaño del array")));
		int array1[] = new int[n];
		int array2[];
		
		rellenarArray(array1, 10, 100);
		array2 = array1;
		
		array1 = new int[n];
		
		rellenarArray(array1, 10, 100);
		
		//Introducimos la tercera array que será quien duplique los valores de array 1 y 2 y muestre el resultado.
		int array3[] = duplicador (array1, array2);
		
		System.out.println("Array1");
		mostrar(array1);
		System.out.println("Array2");
		mostrar(array2);
		System.out.println("Array3");
		mostrar(array3);
		
		System.gc();//Se introduce el método de reciclado de objetos de la memoria para optimizar su espacio.
	}
	
	public static void rellenarArray (int v[], int a, int b) {
		
		for(int list = 0; list < v.length; list++) {
			
			v[list] = ((int)Math.floor(Math.random()*(a-b)+b));
		}
		return;
	}
	
	public static void mostrar(int v[]) {
		
		for(int list = 0; list < v.length; list++) {
			
			System.out.println("En el indice " +list+ " acaba en el valor de " +v[list]);
		}
		return;
	}
	
	//Creamos el método de duplicador asociandolo a la array3.
	public static int[] duplicador(int array1[], int array2[]) {
		
		int array3[] = new int [array1.length];
		
		for(int list = 0; list < array1.length; list++) {
			
			array3[list] = array1[list] * array2[list];
		}
		return array3;
	}
	
}
		
