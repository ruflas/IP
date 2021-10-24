import java.util.Scanner;
public class tarea2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce nota de teoría y practicas: ");
		double t = teclado.nextDouble();
		double p = teclado.nextDouble();
		
		if (t >=9 && p >=9)
			System.out.println("SOBRESALIENTE");
		else
			if (t >= 7.5 && p >= 7.5)
				System.out.println("NOTABLE");
			else
				if(t >= 5 && p >= 5)
					System.out.println("SUFICIENTE");
				else
					System.out.println("SUSPENSO");
		teclado.close();
	}

}