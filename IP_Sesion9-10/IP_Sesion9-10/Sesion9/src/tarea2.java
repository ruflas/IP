import java.util.Scanner;
public class tarea2 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("Dada una ecuación de segundo grado.");
		System.out.println("Introduce a: ");
		int a = t.nextInt();
		System.out.println("Introduce b: ");
		int b = t.nextInt();
		System.out.println("Introduce c: ");
		int c = t.nextInt();
		if (Math.sqrt( Math.pow(b, 2) - 4* a * c) >= 0) {
			System.out.println("Solucion real.");
			double x1 = ((-b + Math.sqrt( Math.pow(b, 2) - 4* a * c))/(2*a));
			double x2 = ((-b - Math.sqrt( Math.pow(b, 2) - 4* a * c))/(2*a));
			System.out.printf("Las soluciones son %.02f y %.02f\n", x1, x2);
		}
		
		else System.out.println("Solucion compleja.");
		t.close();
	}

}
