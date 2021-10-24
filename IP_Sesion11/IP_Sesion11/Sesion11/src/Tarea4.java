import java.util.Scanner;
public class Tarea4 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("Introduce un numero:");
		int n = t.nextInt();
		for(int i = 0; i<=10; i++) {
			int tabla = n * i;
			System.out.printf("%d x %d : %d\n", n,i,tabla);
		}
		t.close();
	}

}
