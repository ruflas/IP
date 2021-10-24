import javax.swing.JOptionPane;
public class SensacionTermicaVentana {
	public static void main(String[] args) {
		String num_string=JOptionPane.showInputDialog("Introduce la temperatura: ");
		double temperatura=Double.parseDouble(num_string);
		String num_string2=JOptionPane.showInputDialog("Introduce la velocidad del viento: ");
		double vv=Double.parseDouble(num_string2);
		double STSiple = -0.04544 *(10.45 + 10*Math.sqrt(vv)-vv )*(33-temperatura)+33;
		double STModerna= 13.12+0.6215*temperatura+(0.3965*temperatura-11.37)*Math.pow(vv, 0.16);
		String salida=String.format("Con una temperatura %f y una velocidad de viento %f las formulas dan:\n %f Siple\n %f Moderna", temperatura,vv,STSiple,STModerna);
		JOptionPane.showMessageDialog(null, salida);

	}
}
