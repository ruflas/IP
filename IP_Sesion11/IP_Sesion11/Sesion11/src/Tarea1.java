import java.util.Scanner;
public class Tarea1 {
//Tarea 1 , 2 y 3
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("Introduce un numero:");
		int n = t.nextInt();
		int suma = 0;
		for(int i = 0;i <= n; i++) {
			suma += i;
		}
		System.out.printf("El sumatorio da %d\n", suma);
		System.out.println("Introduce un numero:");
		int m = t.nextInt();
		suma = 0;
		//Este bucle ya hace el sumatorio en un rango abierto para que sea cerrado seria poniendo
		//int i = n+1 y i<m
		for(int i = n; i<=m ;i++) {
			suma += i;
		}
		System.out.printf("El sumatorio entre %d y %d da %d\n", n,m,suma);
		t.close();
	}

}
