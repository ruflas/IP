import java.util.Scanner;
public class Tarea2 {
	public static String[] ListaStrings(String v[]) {
		Scanner t = new Scanner(System.in);
		for(int i = 0; i<5 ;i++) {
			String s = t.next();
			v[i] = s;
		}
		t.close();
		return v;
	}
	
	public static void StringMasLarga(String v[]) {
		String mayor = v[0];
		for(int j = 0; j<v.length; j++) {
			if(v[j].length()>mayor.length()) mayor = v[j];
		}
		System.out.printf("La palabra mas larga de la lista es %s", mayor);
	}
	
	public static void main(String[] args) {
		System.out.println("Introduce un string: ");
		String v[] = new String[5];
		ListaStrings(v);
		StringMasLarga(v);
	}		
}

