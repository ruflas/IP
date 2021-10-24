//Tarea 4 y 5
import java.util.Scanner;
public class tarea4 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("Introduce un numero entero: ");
		int n1 = t.nextInt();
		System.out.println("Introduce un numero entero: ");
		int n2 = t.nextInt();
		System.out.println("Introduce un numero entero: ");
		int n3 = t.nextInt();
		if (n1 > n2 && n1 > n3 && n2 > n3) System.out.printf("%d > %d > %d", n1,n2,n3);
		else if(n2 > n1 && n2 > n3 && n1 > n3) System.out.printf("%d > %d > %d", n2,n1,n3);
		else if (n1 > n2 && n1 > n3 && n3 > n2) System.out.printf("%d > %d > %d", n1,n3,n2);
		else if(n2 > n1 && n2 > n3 && n3 > n1) System.out.printf("%d > %d > %d", n2,n3,n1);
		else if(n3 > n1 && n3 > n2 && n1 > n2) System.out.printf("%d > %d > %d", n3,n1,n2);
		else System.out.printf("%d > %d > %d", n3,n2,n1);
		t.close();
	}

}
