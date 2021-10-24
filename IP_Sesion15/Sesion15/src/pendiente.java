import java.util.Scanner;
public class pendiente {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("Introduce un entero: ");
		int n = t.nextInt();
		for(int i = 1; i <= n; i++) {
			for (int a = 1; a <= i; a++) {
				System.out.print('*');
			}
			System.out.println("");
		}
		t.close();
	}

}
