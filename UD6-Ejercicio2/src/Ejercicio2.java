import java.util.Random;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Scanner;


public class Ejercicio2 {
	
	public static void main(String args[]) {
		//Pasamos la cantidad de numeros que vamos a generar e indicamos cual es el valor Inferior al Superior por teclado con un parseInt.
		int C = Integer.parseInt(JOptionPane.showInputDialog("Cantidad numeros a generar"));
		int I = Integer.parseInt(JOptionPane.showInputDialog("Numero inferior"));
		int S = Integer.parseInt(JOptionPane.showInputDialog("Numero superior"));
		
		//Creamos un bucle para generar los valores.
		for(int cont = 0; cont < C; cont++) {
			System.out.println("Numero generado" +Num(I, S));
		}
	}
	
	//Nos da los valores que escribimos a valores aleatorios.
	public static int Num(int I, int S) {
		
		Random rd = new Random();
		int n = rd.nextInt(S-I)+I;
		return n;
	}
	
	
	
}
	

	
		
			
	 
		
	
	
		
		
		

		
		
		
		

		
		