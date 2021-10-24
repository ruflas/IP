package examlab2;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("Introduce el primer numero del intervalo: ");
		int num1=t.nextInt();
		System.out.println("Introduce el ultimo numero del intervalo: ");
		int num2=t.nextInt();
		int cont=num1;
		int producto=1;
		while(cont<num2) {
			if (cont%2!=0 || cont%4==0) {
				producto*=cont;
				cont++;
			}
			else cont++;
		}
		System.out.printf("El producto de los multiplos o impares del rango (%d %d) es %d\n", num1,num2,producto);
		
		int n=1;
		int contador=0;
		boolean condicion=true;
		while(n>0) {
			contador++;
			System.out.println("\nIntroduce un entero positivo (si es negativo deja de pedir numeros): ");
			n=t.nextInt();
			if(!(n>contador*contador) && n>0) condicion=false;
		}
		System.out.printf("Condicion= %b", condicion);
		t.close();
		}

}
