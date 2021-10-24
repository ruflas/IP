import java.util.Scanner;
public class TestPunto {

	public static void main(String[] args) {
		Punto p = new Punto();
		Scanner t = new Scanner(System.in);
		System.out.println("Introduce la coordenada x -> ");
		p.setX(t.nextDouble());
		System.out.println("Introduce la coordenada y -> ");
		p.setY(t.nextDouble());
		
		p.imprime();
		System.out.printf("La distancia del punto [%.02f , %.02f] al origen es -> %.02f", p.getX(), p.getY(), p.DistanciaAlOrigen());
		t.close();
	}

}
