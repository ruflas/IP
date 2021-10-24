package examlab3;
import java.util.Scanner;
public class exam3pl5 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("Introduce el tamaño del vector: ");
		int tamaño=t.nextInt();
		int[] v= new int[tamaño];
		for(int i=0;i<v.length;i++) {
			System.out.println("Introduce los enteros al vector: ");
			v[i]= t.nextInt();
		}
		int cont=0;
		int producto=1;
		while(cont<v.length) {
			                      
			if(v[cont]%3==0 && v[cont]>6) {
				producto*=v[cont];
				cont++;
			}
			else cont++;
		}
		System.out.printf("El producto de los multiplos de 3 mayores de 6: %d ",producto);
		
		cont=0;
		boolean cierto=true;
		while(cont<v.length && v[cont]>v[cont+1]+10) {
			if(cont<v.length) {
				cierto=true;
				cont++;
			}
			else {
				cierto=false;
				cont++;
			}
		}
		System.out.printf("\n¿Hay alguna celda que contenga un valor mayor en 10 unidades a la siguiente? %b Posicion: %d", cierto,cont);
		
		System.out.println("\nDame una palabra: ");
		String palabra= t.next();
		cont=0;
		int contador=0;
		while(cont<palabra.length()) {
			if(palabra.charAt(cont)=='Z' || palabra.charAt(cont)=='z') {
				cont++;
				contador++;
			}
			else cont++;
		}
		System.out.printf("La letra Z se repite %d veces.", contador);
	}

}
