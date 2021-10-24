/* EL CODIGO AUN ESTA MAL HECHO
NO HACER NI PUTO CASO A ESTE .java
*/
import java.util.Scanner;
public class TestHistograma {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("Introduce un numero entero: ");
		int n = t.nextInt();
		boolean exit = false;
		int cont = 0;
		int par_n = 0;
		String result = "";
		while (exit == false) {
			if (n >= 0) {
				System.out.println("Introduce un entero: ");
				n = t.nextInt();
				cont += 1;
				for(int num = 1; num <= cont ; num ++) {
					par_n = num;
					for(int i = 0; i <= n; i++) {
						if(i % 5000 == 0) {
							for (int a = 1; a <= i; a++) {
								result = "*";
								System.out.printf("partido %d : %s\n", par_n, result);
							}
						}
					}
				}
			}
			else exit = true;
		}
		t.close();
	}

}
