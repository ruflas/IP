import java.util.Scanner;
public class TestSumatorioPotencias {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("Introduce un numero entero: ");
		int n = t.nextInt();
		
		
		double suma = 0.0;
		
		for (int j = 1; j <= n; j++) {
			// calcula la potencia
			double pot = 1.0;
			for (int i = 1; i <= j; i++)
				pot *= j;
			
			// acumulamos en la suma
			suma += pot;
		}
		
		System.out.println(suma);
		
		
		/*
		for (int i = 1; i <= n; i++) {
			double r = Math.pow(i, i);
			r += Math.pow((i-1), (i-1));
			System.out.println(r);
		}
		/*for (int i = 1; i < n; i++) {
			for (int cont = i; cont < n; cont++) {
				cont *= cont;
				double r = i * cont;
				r += r;
				System.out.println(r);
			}
		}*/
		t.close();
	}

}
