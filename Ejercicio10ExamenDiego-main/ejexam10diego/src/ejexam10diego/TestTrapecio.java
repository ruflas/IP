package ejexam10diego;
import java.util.Scanner;
public class TestTrapecio {

	public static void main(String[] args) {
		Trapecio t1= new Trapecio();
		Scanner teclado= new Scanner(System.in);
		System.out.println("Dame la base1: \n");
		t1.base1=teclado.nextDouble();
		System.out.println("Dame la base2: \n");
		t1.base2=teclado.nextDouble();
		System.out.println(Trapecio.calculaArea(t1.getbase1(),t1.getbase2(),t1.getaltura()));
		System.out.println(Trapecio.BasesMayores(t1));
		teclado.close();
	}

}
