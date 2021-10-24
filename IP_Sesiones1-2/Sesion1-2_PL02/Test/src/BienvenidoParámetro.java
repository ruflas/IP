/**
 * @author los profesores de IP
 * BienvenidoParámetro: muestra en consola un texto de bienvenida con un parámetro
 */
public class BienvenidoParámetro {
	public static void main(String[ ] args) {
		/* Imprimimos las cadenas "Bienvenido " y
		otra cadena que será el primer parámetro */
		System.out.print("Bienvenido ");
		System.out.println(args[0]);
	}
}
