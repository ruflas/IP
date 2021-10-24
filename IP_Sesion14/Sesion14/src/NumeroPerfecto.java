import java.util.Scanner;
public class NumeroPerfecto {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("Introduce un numero entero: ");
		int n = t.nextInt();
		
		int suma = 0;
		
		
		for (int i = 1; i <= n/2; i++)
			if (n % i == 0)
				suma += i;
				
		
	
		System.out.printf("El número %d %s PERFECTO\n", 
				n, (suma == n ? "ES" : "NO ES"));
		
		
		/*
		for (int i = 1; i < n; i++) {
			if(n % i == 0) {
				i += i;
				if (n == i) System.out.print("Verdadero");
				else System.out.print("Falso");
			}
		}
		*/
		t.close();
	}

}
