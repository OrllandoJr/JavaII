package recursividade;

import java.util.Scanner;

public class OrdemDecrescente {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n;
        do {
        System.out.println("Digite um n�mero inteiro e positivo: ");
        n = in.nextInt();
        } while (n<0);
        int y = n;
        ordem(n,y);
    }
    
    static int ordem(int n, int y){
        System.out.print(", "+ n );
        if (n>=y){
            return ordem(n, y-1);
        }
        else {
            return 0 ;
        }
    }
}