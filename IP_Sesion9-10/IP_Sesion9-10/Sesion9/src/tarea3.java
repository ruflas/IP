import java.util.Scanner;
public class tarea3 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("Introduce un año: ");
		int year = t.nextInt();
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ) System.out.println("Es bisiesto.");
		else System.out.println("No es bisiesto.");
		t.close();
	}

}
