
public class Testisosceles {

	public static void main(String[] args) {
		Isosceles i = new Isosceles();
		i.setBase(5);
		i.setAltura(8);
		System.out.printf("Su Area es -> %.02f\nSu Perimetro es -> %.02f", i.calculaArea(),i.calculaPerimetro());

	}

}
