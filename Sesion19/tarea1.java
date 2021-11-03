import java.util.Scanner;
public class tarea1 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("Introduce un string: ");
		String s = t.next();
		String[] palabra = s.split("");
		String[] vocales = {"a","e","i","o","u","A","E","I","O","U"};
		int cont = 0;
		for(int i = 0; i<s.length();i++) {
			for(int j = 0; j < vocales.length;j++) {
				if( vocales[j].equals(palabra[i]) ) {
					cont++;
				}
			}
		}
		System.out.printf("En la palabra %s hay %d vocales.", s,cont);
		t.close();
	}

}
