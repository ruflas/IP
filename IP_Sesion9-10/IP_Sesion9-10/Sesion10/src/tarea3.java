import java.util.Scanner;
public class tarea3 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
        
		//Pide jugada al usuario
		System.out.println("Introduce tu jugada (r/p/s): ");
		char jUsuario = tec.next().charAt(0);
		
		//Generar jugada Aleatoria
		char jOrdenador;
		double aleatorio = Math.random();
		if(aleatorio < 1.0/3)
			jOrdenador = 'r';
		else 
			if (aleatorio < 2.0/3)
				jOrdenador = 'p';
			else
				jOrdenador = 's';
		System.out.printf("El ordenador ha escogido %c\n", jOrdenador);
		
		//Comparar jugadas Usuario vs Ordenador
		
		if (jUsuario == jOrdenador)
			System.out.println("Empate");
		else
			if ((jUsuario == 'p' && jOrdenador == 'r') ||
			   (jUsuario == 's' && jOrdenador == 'p') ||
			   (jUsuario == 'r' && jOrdenador == 's'))
			   System.out.println("GANA EL USUARIO");
			else 
				System.out.println("GANA EL ORDENADOR");
		
		tec.close();
		
	}

}