import javax.swing.JFrame;
public class TestCirculo {

	public static void main(String[] args) {
		JFrame app = new JFrame("Pintando circulo");
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setBounds(0, 0, 300, 200);
		Circulo C = new Circulo();
		C.setX(40);
		C.setY(25);
		C.setRadio(200);
		app.add(C);
		app.setVisible(true);
	}

}
