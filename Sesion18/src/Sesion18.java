import java.util.Scanner;
public class Sesion18 {
	
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
			if(j==0)System.out.print("\n{"+v[j]+",");
			else if (j>0 && j<v.length-1)System.out.print(v[j]+",");
			else System.out.print(v[j]+"}");
		}
	}
	
	public static void Comp_M(int[] v,int n) {
		int cont = 0;
		for(int i = 0; i < v.length; i++) {
			if(v[i]>n) cont++;
		}
		System.out.printf("\nComponentes mayores: %d",cont);
	}

	public static void Min_V(int[] v) {
		int min = 0;
		for(int i = 0; i < v.length; i++) {
			if(i == 0) min = v[i];
			else if(v[i]<v[i-1]) min = v[i];
		}
		System.out.printf("\nMinimo: %d", min);
	}
	
	public static int[] V_Inverso(int[] v) {
		int[] w = new int[v.length];
		int j = 0;
		for(int i = v.length; i > 0; i--) {
			w[j] = v[i-1];
			j++;
		}
		return w;
	}
	
	public static int[] V_InversoSV(int[] v) {
		int j = 0;
		for(int i = v.length; i > 0; i--) {
			v[j] = v[i-1];
			j++;
		}
		return v;
	}
	
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int[] v = NuevoVector();
		LeeVector(v);
		System.out.print("\nIntroduce un numero entero: ");
		int n = t.nextInt();
		Comp_M(v,n);
		Min_V(v);
		LeeVector(V_Inverso(v));
		LeeVector(V_InversoSV(v));
		t.close();
	}

}
