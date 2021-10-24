import java.util.Scanner;

/** Ejemplo 1 de uso de la clase Fecha
 *  @author los profesores de IP  */
public class Ejemplo1Fecha {

	public static void main(String[ ] args) {
		//Objeto de la clase Fecha
		Fecha f = new Fecha();
		//Objeto Scanner asociado con el teclado
		Scanner teclado= new Scanner(System.in);
		System.out.print("Introduce la fecha (día, mes y año): ");
		//Variables para leer la fecha y lectura de los datos
		short día=teclado.nextShort();
		short mes=teclado.nextShort();
		short año=teclado.nextShort();
		//Cambiamos el objeto fecha con los datos leídos
		f.setFecha(día, mes, año);
		//Mostramos la fecha en la pantalla
		f.imprimeFecha();
	}
}

