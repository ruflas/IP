package examlab2;
import java.util.Scanner;
public class mainpl2 {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int cont=0;
		int mayores=0;
		while(cont<8) {
			System.out.println("Introduce un entero: ");
			int n=t.nextInt();
			int num_ant=n;
			cont++;
			System.out.println("Introduce un entero: ");
			n=t.nextInt();
			cont++;
			if (n>num_ant) {
				mayores++;
			}
			
		}
		System.out.printf("Hay %d numeros mayores que el anterior",mayores);
		int suma;
		int n=1;
		int contador=0;
		while(n!=-99) {
			System.out.println("\nIntroduce un entero positivo (si es -99 deja de pedir numeros): ");
			n=t.nextInt();
			int x=n;
			if(n!=-99) {
				System.out.println("Introduce un entero positivo (si es -99 deja de pedir numeros): ");
				n=t.nextInt();
				suma=x+n;
				if (n!=-99) {
					System.out.println("Introduce un entero positivo (si es -99 deja de pedir numeros): ");
					n=t.nextInt();
					if (n==suma) contador++;;
				}
			}
		}
		System.out.printf("Hay %d numeros iguales a la suma de sus anteriores.",contador);
		t.close();
	}
}
