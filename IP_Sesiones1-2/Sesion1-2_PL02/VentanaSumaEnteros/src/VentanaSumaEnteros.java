import javax.swing.JOptionPane;
public class VentanaSumaEnteros {
	public static void main(String[] args) {
		String num_string=
				JOptionPane.showInputDialog("Introduce un entero");
		int n1=Integer.parseInt(num_string);
		String num_string2=
				JOptionPane.showInputDialog("Introduce un entero");
		int n2=Integer.parseInt(num_string2);
		int suma=n1+n2;
		String salida=String.format("La suma de %d y %d es %d", n1,n2,suma);
		JOptionPane.showMessageDialog(null, salida);

	}

}
