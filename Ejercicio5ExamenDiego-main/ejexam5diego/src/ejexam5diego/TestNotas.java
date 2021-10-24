package ejexam5diego;
import java.util.Scanner;

public class TestNotas {

	public static void main(String[] args) {
		Notas n1 = new Notas();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame una nota de practicas: ");
		n1.setNP(teclado.nextLine());
		System.out.println("Dame una nota de teoria: ");
		n1.setNT(teclado.nextDouble());
		System.out.print(Notas.Nota(n1.getNP(),n1.getNT()));
        teclado.close();
	}

}
