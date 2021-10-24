package examlab2;
import java.util.Scanner;
public class mainpl5 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int n=1;
		int pos=0;
		int neg=0;
		int suma_p=0;
		int suma_n=0;
		int suma_nAbs=0;
	    boolean mas_menos=true;
		while(n!=0) {
			System.out.println("Dame un entero: ");
			n=t.nextInt();
			if(n>0) {
				pos++;
				suma_p=n+suma_p;
			}
			else {
				neg++;
				suma_nAbs=Math.abs(n)+suma_nAbs;
				suma_n=n+suma_n;
			}
			if (suma_p>suma_nAbs) mas_menos=false;
			else mas_menos=true;
		}	
		System.out.printf("\nNum Positivos: %d , Num Negativos: %d", pos,neg-1);
		System.out.printf("\nSuma Positivos: %d , Suma Negativos: %d", suma_p,suma_n);
		System.out.printf("\nLos negativos suman más en valor absoluto. %b\n",mas_menos );
		
		System.out.println("Introduce a (primer numero del intervalo): ");
		int a= t.nextInt();
		System.out.println("Introduce b (numero final del intervalo): ");
		int b= t.nextInt();
		int cont=a;
		boolean cierto=true;
		int multiplo=0;
		while(cont<b) {
			cont++;
			if(cont%13==0) {
				multiplo=cont;
				cierto=true;	
			}
			else{
				cont++;
				if(multiplo>0) cierto=true;
				else cierto=false;
			}
		}
		System.out.printf("\n¿Hay multiplos de 13?: %b", cierto);
		t.close();
	}
}
