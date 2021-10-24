package exam2021ej3;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("Dame un entero >=1: ");
		int n=(teclado.nextInt());
		System.out.print(piAprox(n));
		teclado.close();
	}
	public static double piAprox(int n) {
		int numerador=2;
		int denominador=1;
		double producto=1.0;
		for(int i=1;i<=n;i++) {
			producto*=(double)numerador/denominador;
			if(i%2==0) numerador+=2;
			else denominador+=2;
		}
		return 2*producto;
	}

}
