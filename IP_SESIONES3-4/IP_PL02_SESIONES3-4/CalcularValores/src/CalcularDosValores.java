import java.util.Scanner;
public class CalcularDosValores {

	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		Scanner t = new Scanner(System.in);
		double primer_calculo = (x+(y/3.0))-(((4.0*2.0)*(5.0/x))-3.0);
		double segundo_calculo = (x*y)+((2.0*(x/3.0))*5.0)+((4.0/x)-1.0);
		System.out.printf("El resultado de la primera formula es %f y la segunda es %f", primer_calculo,segundo_calculo);
		double tercer_calculo = ((x+y)/3.0)-4.0*((2.0*5.0)/(x-3.0));
		double cuarto_calculo = x*((y+2.0*x)/3.0)*5.0+(4.0/(x-1.0));
		System.out.printf("\nEl resultado de la tercera formula es %f y la cuarta es %f", tercer_calculo,cuarto_calculo);
		System.out.println("\nIntroduce un numero: ");
		double num1= t.nextDouble();
		System.out.println("Introduce otro numero: ");
		double num2 = t.nextDouble();
		double media = (num1+num2)/2.0;
		double desvt=Math.sqrt(((Math.pow((num1-media),2.0)+Math.pow((num2-media), 2.0))));
		System.out.printf("Dados los valores %f y %f :\n Su media es %f\n Su Desv. tipica es %f",num1,num2,media,desvt);
		t.close();
	}

}
