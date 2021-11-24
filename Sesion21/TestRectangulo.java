import javax.swing.JFrame;
public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo(2,3,5,1);
		Rectangulo r3 = new Rectangulo(r2);
		
		System.out.println(r1.calculaÁrea());
		System.out.println(r2.calculaÁrea());
		System.out.print(r3.calculaÁrea());
		JFrame app = new JFrame("Pintando rectángulo");
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setBounds(0, 0, 300, 200);
		Rectangulo R = new Rectangulo();
		R.setX(40);
		R.setY(25);
		R.setBase(200);
		R.setAltura(100);
		app.add(R);
		app.setVisible(true);
	}

}
