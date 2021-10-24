import java.util.Scanner;
public class VolumenEsfera {

	public static void main(String[] args) {
		 Scanner t = new Scanner(System.in);
		 System.out.println("Introduce un radio: ");
		 double radio = t.nextDouble();
		 //double volumen = ((4/3)*Math.PI)*Math.pow(radio, 3);
		 double volumen=4*Math.pow(radio, 3)*Math.PI/3;
		 System.out.printf("El volumen del radio %f es -> %f", radio,volumen);
		 t.close();
	}

}
