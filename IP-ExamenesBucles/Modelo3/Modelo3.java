import java.util.Scanner;
public class Modelo3 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        double n = 1;
        double ant = 1;
        int cont = 0;
        for(int i = 0; i<8; i++){
            ant = n;
            System.out.print("Introduce la secuencia: ");
            n = t.nextDouble();
            if(n>ant) cont++;
        }
        System.out.printf("Hay %d numeros mayores que el anterior.\n",cont);
        
        int num = 0;
        int sum_ant = 0;
        boolean check = false;
        while(num!=-99){
            ant = num;
            sum_ant += ant;
            System.out.print("Introduce la secuencia: ");
            num = t.nextInt();
            if(num==sum_ant){
                check = true;
                n = -99
            }
        }
        if(check == true) System.out.printf("El %d es igual que la suma de sus anteriores.",num);
        else System.out.print("Ninguno es igual a la suma de sus anteriores.");
        t.close();
    }
}
