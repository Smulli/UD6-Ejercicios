import java.util.Arrays;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Ejercicio12 {
	
	public static void main(String args[]) {
		
		String text;
		int n[] = new int [Integer.parseInt(JOptionPane.showInputDialog("Introduzca tamaño del array"))];
		int digito;
		
		do {
			digito = (Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero entre 0 y 9")));
		}while(!(digito >= 0 && digito <= 9)); 
		
		rellenarArray(n, 1, 300);
		
		int acabados[] = numerosAcabadosEn(n, digito); 
		
		mostrar(n);
		mostrar(acabados);
			
		
	}
	public static void rellenarArray (int v[], int a, int b) {
		
		for (int list = 0; list < v.length; list++) {
			
			v[list] = ((int)Math.floor(Math.random()*(a-b)+b));
		}
		
	}
	
	public static void mostrar (int v[]) {
		
		for (int list = 0; list < v.length; list++) {
			
			if(v[list] != 0) {
				
				System.out.println("El numero " +v[list]+ " acaba en el valor deseado");
			}
		}
	}
	
	public static int[]numerosAcabadosEn (int n[], int ultimoNumero) {
		
		int acabados[] = new int[n.length];
		int numeroFinal = 0;
		
		for (int list = 0; list < acabados.length; list++) {
			
			numeroFinal = n[list] - (n[list]/10*10);
			
			if (numeroFinal == ultimoNumero) {
				
				acabados[list] = n[list];
			}
		}
		return acabados;
	}
}
		
		
