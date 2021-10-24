import java.util.Scanner;
public class Tarea5 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("Introduce la base:");
		int base = t.nextInt();
		System.out.println("Introduce el exponente:");
		int exp = t.nextInt();
		int result = base;
		if(exp == 0) System.out.println("1");
		else {
		for(int i = 2; i<=exp ; i++) {
			result *= base;
		}
		System.out.println(result);
		t.close();
		}
	}
}
