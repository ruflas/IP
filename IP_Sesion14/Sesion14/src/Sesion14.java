import java.util.ArrayList;
import java.util.Scanner;
public class Sesion14{
	public static boolean esPerfecto(int n) {
		boolean check = false;
		int sum = 0;
		for(int i = 1; i < n; i++) {
			if(n%i == 0) {
				sum += i;
			}
		}
		if(sum == n) check = true;
		return check;
	}
	
	public static ArrayList Perfectos() {
		ArrayList result = new ArrayList();
		for(int i = 1; i < 10000; i++) {
			if(esPerfecto(i) == true) result.add(i);
		}
		return result;
	}
	
	public static boolean rangoPerfectos(int a, int b) {
		boolean check = false;
		for(int i = a; i<=b ; i++) {
			if(esPerfecto(i) == true) {
				check = true;
				break;
			}
		}
		return check;
	}
	
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("Introduce un numero entero: ");
		int n = t.nextInt();
		
		System.out.printf("¿Es perfecto %d?: %b\n",n,esPerfecto(n));
		
		System.out.print(Perfectos());
		
		System.out.println("\nIntroduce el inicio del rango: ");
		int a = t.nextInt();
		System.out.println("Introduce el final del rango: ");
		int b = t.nextInt();
		
		System.out.printf("¿Hay perfectos entre %d y %d?: %b",a,b,rangoPerfectos(a,b));
		t.close();
	}

}
