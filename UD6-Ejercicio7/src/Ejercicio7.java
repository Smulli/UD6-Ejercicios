import javax.swing.JOptionPane;

public class Ejercicio7 {
	
	public static void main (String args[]) {
		
		double money = Double.parseDouble(JOptionPane.showInputDialog("Escriba la cantidad a convertir"));
		String moneda = JOptionPane.showInputDialog("Seleccione una moneda: dolares, libras, yenes");
		conversor(money, moneda);
	}
	
	//Creamos el método que nos permitirá convertir money a los distintos tipos de conversión.
	public static void conversor (double money, String moneda) {
		
		double resultado = 0;
		
		switch (moneda) {
		case "dolares":
			resultado = money * 1.20;
			break;
		case "libras":
			resultado = money * 0.88;
			break;
		case "yenes":
			resultado = 126.86;
			break;
		default:
			JOptionPane.showMessageDialog(null, "No ha seleccionado la conversion correcta.");
			money = 0;
		}
		
		/*Si money es mayor a 0 nos mostrará el string con la solicitada la operación se ejecuta 
		 * en el método convesor.
		 */
		if (money >= 0) {
			JOptionPane.showMessageDialog(null, money+ " euros en " +moneda+ " son "+resultado);
		}
	}
	
}
		
		
