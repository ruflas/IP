import java.util.Scanner;
public class IMConsola {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("Introduce el peso (kg): ");
		double peso=t.nextDouble();
		System.out.println("Introduce la altura (metros): ");
		double altura=t.nextDouble();
		double IMC = (peso/Math.pow(altura, 2));
		System.out.printf("El valor de IMC del peso %f kg y altura %f m es -> %f", peso,altura,IMC);
		t.close();
	}

}
