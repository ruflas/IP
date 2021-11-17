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
				System.out.print(m[i][j]+" ");
			}
		}
	}
		
	public static int[][] MatrizTraspuesta(int[][] m){
		int mt[][] = new int[m.length][m[0].length];
		for(int i = 0; i<m.length ; i++) {
			for(int j = 0; j<m[i].length; j++) {
				mt[j][i] = m[i][j];
			}
		}
		return mt;
	}
	
	public static void main(String[] args) {
		int m [][] =new int[3][3];
		System.out.print("Introduce los elementos de la matriz: ");
		LeeMatriz(m);
		ImprimeMatriz(m);
		System.out.print("\nSu matriz traspuesta es: \n");
		ImprimeMatriz(MatrizTraspuesta(m));
	}		
}

