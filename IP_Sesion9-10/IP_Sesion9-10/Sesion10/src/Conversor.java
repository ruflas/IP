import java.util.Scanner;
public class Conversor {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("Elige la unidad que quieres convertir: ");
		System.out.println(" 1)Milla/Km\n 2)Km/Yardas\n 3)Nudo/KmH\n 4)Libra/Kg\n");
		int op = t.nextInt();
		int i=0;
		while (i==0){
			if (op==1) {
				System.out.println("Introduce las Millas: ");
				double milla = t.nextDouble();
				double mk=milla*1.609344;
				System.out.printf("%f Millas equivale a %f Km\n", milla, mk);
				i=1;
			}
			else if (op==2) {
				System.out.println("Introduce los Kilometros: ");
				double km = t.nextDouble();
				double ky=km*1093.6133;
				System.out.printf("%f Km equivale a %f Yardas\n", km, ky);
				i=1;
			}
			else if (op==3) {
				System.out.println("Introduce los Nudos: ");
				double nudo = t.nextDouble();
				double kmh=nudo*1.852;
				System.out.printf("%f Nudos equivale a %f kmh\n", nudo, kmh);
				i=1;
			}
			else if (op==4) {
				System.out.println("Introduce las Libras: ");
				double libra = t.nextDouble();
				double kg=libra*0.45359237;
				System.out.printf("%f Libras equivale a %f Kg\n", libra, kg);
				i=1;
			}
			else {
				System.out.println("Eleccion Incorrecta");
				System.out.println("Elige otra opción: ");
				op = t.nextInt();
			}
		}
		t.close();
	}

}