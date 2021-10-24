package exam2021ej5;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner t= new Scanner(System.in);
	System.out.print("Dame un num entero: ");
	int n1=(t.nextInt());
	System.out.print("Dame otro num entero: ");
	int n2=(t.nextInt());
	System.out.print("Dame otro num entero: ");
	int n3=(t.nextInt());
	System.out.print(Triangulo(n1,n2,n3));
	t.close();
	}
	public static String Triangulo(int n1,int n2,int n3) {
		if(n1==n2 && n2==n3) return "Equilatero";
		else if((n1==n2 && n2!=n3) || (n2==n3 && n1!=n3) || (n1==n3 && n1!=n2)) return "Isosceles";
		else if(n1!=n2 && n2!=n3 && n1!=n3) return "Escaleno";
		else return "No es un triangulo.";
	}
}
