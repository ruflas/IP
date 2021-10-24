public class TestColchon {

	public static void main(String[] args) {
		Colchon c = new Colchon();
		c.setAncho(90);
		c.setLargo(180);
		c.setGrosor(20);
		c.setTipo(1);
		System.out.printf("Volumen: %.02f\n",c.calculaVolumen());
		System.out.printf("¿Es mas voluminoso?: %b\n",c.esMasVoluminoso(c));;
		System.out.println(c.toString());
	}
}
