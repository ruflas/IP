import java.util.Scanner;
public class TestHora {

	public static void main(String[] args) {
		Hora h = new Hora();
		Scanner t = new Scanner(System.in);
		System.out.println("Introduce la hora -> ");
		h.setHora(t.nextInt());
		System.out.println("Introduce los minutos -> ");
		h.setMinutos(t.nextInt());
		System.out.println("Introduce los segundos -> ");
		h.setSegundos(t.nextInt());
		
		System.out.printf(" %d : %d : %d\n", h.getHora(),h.getMinutos(),h.getSegundos());
		System.out.printf("Segundos desde medianoche %.02f", h.segundosDesdeMedianoche());
		t.close();
	}

}
