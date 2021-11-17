import java.util.Scanner;
public class tarea1 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		//Tarea 1
		
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
		//Tarea 2
		
		System.out.println("\nIntroduce un string: ");
		String s2 = t.next();
		if(s.equals(s2)) System.out.print("Son la misma String");
		else System.out.print("No son la misma String.");
		t.close();
	}

}
