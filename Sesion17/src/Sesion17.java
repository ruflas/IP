import java.util.Scanner;

public class Sesion17 {
	public static int[] NuevoVector() {
		Scanner t = new Scanner(System.in);
		System.out.print("\nIntroduce el temaño del vector: ");
		int tamaño = t.nextInt();
		int[] v = new int[tamaño];
		for(int i = 0; i<v.length;i++) {
			System.out.print("\nIntroduce un numero al vector: ");
			int n = t.nextInt();
			v[i] = n;
		}
		return v;
	}
	
	public static void LeeVector(int[] v) {
		for(int j = 0; j< v.length; j++) {
			if(j==0)System.out.print("{"+v[j]+",");
			else if (j>0 && j<v.length-1)System.out.print(v[j]+",");
			else System.out.print(v[j]+"}");
		}
	}
	
	public static int ProductoEscalar(int[] v, int[] v2) {
		int prod = 0;
		for(int i = 0; i<v.length;i++) {
			for(int j = 0; j< v2.length; j++) {
				prod += (v[i]*v2[j]);
			}
		}
		return prod;
	}
	
	public static double ModuloVectores(int[] v) {
		int mod = 0;
		for(int i = 0; i<v.length;i++) {
				mod += Math.sqrt( Math.pow(v[i], 2) ); 
		}
		return mod;
	}
	
	public static double AnguloVectores(int[] v,int[] v2) {
		double prod = ProductoEscalar(v,v2);
		double mod1 = ModuloVectores(v);
		double mod2 = ModuloVectores(v2);
		double result = Math.acos((prod)/(mod1*mod2));
		return result;
	}
	
	public static void PrimeraMayor(int[] v) {
		int pm = 0;
		int cont = 0;
		for(int i = 0; i<v.length;i++) {
			if((i+1)<v.length)if(v[i]>v[i+1]) {
				pm=v[i];
				cont+=1;
			}
		}
		if(cont>0)System.out.printf("\nEl elemento mayor al siguiente es %d .", pm);
		else System.out.print("\nNo hay elemento mayor que el siguiente.");
	}
	
	public static void main(String[] args) {
		int[] v = NuevoVector();
		LeeVector(v);
		int[] v2 = NuevoVector();
		LeeVector(v2);
		System.out.printf("\nSu producto escalar es %d.",ProductoEscalar(v,v2));
		if(ProductoEscalar(v,v2) == 0) System.out.print("\nSon ortogonales.");
		System.out.printf("\nEl angulo de los vectores es %.2f", AnguloVectores(v,v2));
		PrimeraMayor(v);
		PrimeraMayor(v2);
	}
}
