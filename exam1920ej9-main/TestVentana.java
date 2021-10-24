import java.util.Scanner;
public class TestVentana {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		Ventana v = new Ventana();
		System.out.println("Dame el ancho: ");
		v.setAncho(t.nextInt());
		System.out.println("Dame el alto: ");
		v.setAlto(t.nextInt());
		System.out.println("Dame el marco: ");
		v.setMarco(t.nextInt());
		
		System.out.printf("\nLa superficie es %f",v.calculaSuperficieCristales());
		System.out.printf("\n¿Tiene mas cristal la ventana llamada que el parametro? %b", v.tieneMasCristal(v));
		System.out.printf("\n%s", v.toString());
		t.close();

	}

}
