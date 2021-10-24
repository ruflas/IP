import java.util.Scanner;
public class tarea1 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("Introduce un numero entero: ");
		int n = t.nextInt();
		if (n >= 0 && n < 50) System.out.println(n*3);
		else if (n >= 50) System.out.println(n*2);
		else System.out.println(Math.abs(n));
		t.close();
	}

}
