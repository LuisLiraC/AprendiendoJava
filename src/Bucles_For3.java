import javax.swing.*;
public class Bucles_For3 {

	public static void main(String[] args) {
		
		long resultado = 1L;
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa n�mero"));
		
		for (int i=numero; i>0; i--) {
			
			resultado *= i;
		}
		
		System.out.println("El factorial de " + numero + " es " + resultado);
	}

}
