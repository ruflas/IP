import javax.swing.JOptionPane;

public class VolumenEsferaVentana {

	public static void main(String[] args) {
		String num_string=
				JOptionPane.showInputDialog("Introduce el radio: ");
		double radio=Double.parseDouble(num_string);
		 double volumen = (4/3*Math.PI*Math.pow(radio, 3));
		 String salida=String.format("El volumen del radio %f es -> %f", radio,volumen);
			JOptionPane.showMessageDialog(null, salida);
	}
}
