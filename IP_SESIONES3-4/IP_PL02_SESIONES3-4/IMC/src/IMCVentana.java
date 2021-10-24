import javax.swing.JOptionPane;
public class IMCVentana {

	public static void main(String[] args) {
		String num_string=JOptionPane.showInputDialog("Introduce el peso: ");
		double peso=Double.parseDouble(num_string);
		String num_string2=JOptionPane.showInputDialog("Introduce la altura: ");
		double altura=Double.parseDouble(num_string2);
		double IMC = (peso/Math.pow(altura, 2));
		String salida=String.format("El IMC con el peso %f kg y altura %f m es %f", peso,altura,IMC);
		JOptionPane.showMessageDialog(null, salida);

	}

}
