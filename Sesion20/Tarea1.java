import java.util.Scanner;
public class Tarea2 {
	public static int[][] LeeMatriz(int[][] m){
		Scanner t = new Scanner(System.in);
		for(int i = 0; i<m.length ; i++) {
			for(int j = 0; j<m[i].length; j++) {
				int n = t.nextInt();
				m[i][j]=n;
			}
		}
		t.close();
		return m;
	}
	
	public static void ImprimeMatriz(int[][] m) {
		for(int i = 0; i<m.length ; i++) {
			System.out.print("\n");
			for(int j = 0; j<m[i].length; j++) {
				System.out.print(m[i][j]);
			}
		}
	}
	
	public static void SumaColumnas(int[][] m){
		int sum = 0, cont = 0;
		for(int i = 0; i<m.length ; i++) {
			cont = i;
			sum = 0;
			for(int j = 0; j<m[i].length; j++) {
				sum += m[j][i];
			}
			System.out.printf("\nLa suma de los elementos de la columna %d es %d\n",cont,sum);
		}
	}
	
	public static void main(String[] args) {
		int m [][] =new int[3][3];
		LeeMatriz(m);
		ImprimeMatriz(m);
		SumaColumnas(m);
	}		
}

