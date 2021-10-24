import javax.swing.JOptionPane;
public class VentanaConversor {

	public static void main(String[] args) {
		String num_string=
				JOptionPane.showInputDialog("Elige la unidad que quieres convertir: \n 1)Milla/Km\n 2)Km/Yardas\n 3)Nudo/KmH\n 4)Libra/Kg\n");
		int op=Integer.parseInt(num_string);
		int i=0;
		while (i==0){
			if (op==1) {
				String num_string2=
						JOptionPane.showInputDialog("Introduce las Millas: ");
				double milla=Integer.parseInt(num_string2);
				double mk=milla*1.609344;
				String salida=String.format("%.2f Millas equivale a %.2f Km\n", milla, mk);
				JOptionPane.showMessageDialog(null, salida);
				i=1;
			}
			else if (op==2) {
				String num_string3=
						JOptionPane.showInputDialog("Introduce los Km: ");
				double km=Integer.parseInt(num_string3);
				double ky=km*1093.6133;
				String salida=String.format("%.2f Km equivale a %.2f Yardas\n", km, ky);
				JOptionPane.showMessageDialog(null, salida);
				i=1;
			}
			else if (op==3) {
				String num_string4=
						JOptionPane.showInputDialog("Introduce los Nudos: ");
				double nudo=Integer.parseInt(num_string4);
				double kmh=nudo*1.852;
				String salida=String.format("%.2f Nudos equivale a %.2f kmh\n", nudo, kmh);
				JOptionPane.showMessageDialog(null, salida);
				i=1;
			}
			else if (op==4) {
				String num_string5=
						JOptionPane.showInputDialog("Introduce las Libras: ");
				double libra=Integer.parseInt(num_string5);
				double kg=libra*0.45359237;
				String salida=String.format("%.2f Libras equivale a %.2f Kg\n", libra, kg);
				JOptionPane.showMessageDialog(null, salida);
				i=1;
			}
			else {
				String num_string6=
						JOptionPane.showInputDialog("Introduce otra opcion: ");
				op=Integer.parseInt(num_string6);
			}
		}
	}

}
