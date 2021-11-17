public class TestPunto {

	public static void main(String[] args) {
		Punto p1 = new Punto();
		Punto p2 = new Punto(5,3);
		Punto p3 = new Punto(p2);
		
		p1.imprime();
		p2.imprime();
		p3.imprime();
	}

}
