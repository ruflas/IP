import java.util.Scanner;

/** Ejemplo 1 de uso de la clase Círculo
 *  @author los profesores de IP  */
public class Ejemplo1Círculo {

	public static void main(String[ ] args) {
		//Objeto de la clase Círculo
		Círculo c1 = new Círculo();
		Círculo c2 = new Círculo();
		//Objeto Scanner asociado con el teclado
		Scanner teclado= new Scanner(System.in);
		//Leemos el radio
	    System.out.println("Introduce el radio: ");
	    c1.setRadio(teclado.nextDouble());
	    
	    c1.setX(3);
	    c1.setY(3);
	    c1.copiaCentro(c2);
		//Mostramos el área en la pantalla
		System.out.printf("El área es %f\n",c1.calculaÁrea());
		System.out.printf("El perimetro es %f\n",c1.calculaPerimetro());
		System.out.printf("La diferencia de area entre c1 y c2 es : %f", c1.diferenciaArea(c2));
		teclado.close();
	}
}
