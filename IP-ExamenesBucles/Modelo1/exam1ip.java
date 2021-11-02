import java.util.Scanner;
public class exam1ip {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.print("Introduce enteros de secuencia (en 0 para): ");
		int n = t.nextInt();
		int sum_pos = 0;
		int sum_neg = 0;
		
		while(n!=0) {
			if(n>0) sum_pos += n;
			else sum_neg += n;
			System.out.print("Introduce enteros de secuencia (en 0 para): ");
			n = t.nextInt();
		}
		
		System.out.printf("Positivos: %d, Negativos: %d\n", sum_pos,sum_neg);
		if(sum_pos > Math.abs(sum_neg)) System.out.print("Los positivos suman mas en valor absoluto.\n"); 
		else if(Math.abs(sum_neg) > sum_pos)System.out.print("Los negativos suman mas en valor absoluto.\n");
		else System.out.print("Suman lo mismo en valor absoluto.\n");
		
		System.out.print("Introduce extremo a del intervalo: ");
		int a = t.nextInt();
		System.out.print("Introduce extremo b del intervalo: ");
		int b = t.nextInt();
		boolean check = false;
		
		for(int i = a; i<=b ;i++) {
			if(i % 13 == 0) {
				check = true;
				break;
			}
		}
		
		if(check == true) System.out.print("SI hay multiplos de 13");
		else System.out.print("NO hay multiplos de 13");
		
		t.close();
	}
}
