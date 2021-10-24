import java.util.Scanner;
public class ConversorFahrenheit {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("Introduce los grados Fahrenheit: ");
		double F = t.nextDouble();
		double C = ((F-32)*5)/9;
		System.out.printf("La conversion de %f Fahrenheit resulta en %f Celsius",F,C);
		t.close();
	}

}
