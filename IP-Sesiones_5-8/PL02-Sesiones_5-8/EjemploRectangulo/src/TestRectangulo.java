
public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r = new Rectangulo();
		r.setAltura(12);
		r.setBase(18);
		System.out.printf("Su Area es -> %.02f\nSu Perimetro es -> %.02f", r.calculaArea(),r.calculaPerimetro());
	}

}
