import java.util.Scanner;
public class SensacionTermicaConsola {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("Introduce la temperatura: ");
		double temperatura = t.nextDouble();
		System.out.println("Introduce la velocidad del viento: ");
		double vv = t.nextDouble();
		double STSiple = -0.04544 *(10.45 + 10*Math.sqrt(vv)-vv )*(33-temperatura)+33;
		double STModerna= 13.12+0.6215*temperatura+(0.3965*temperatura-11.37)*Math.pow(vv, 0.16);
		System.out.printf("Con una temperatura %f y una velocidad de viento %f las formulas dan:\n %f Siple\n %f Moderna", temperatura,vv,STSiple,STModerna);
		t.close();
	}

}
