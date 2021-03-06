package javaapplication21;

/**
 *
 * @author aluno
 */
public class TorresHanoi {
    
    int nmov;
    
    TorresHanoi(){
        nmov= 0;
    }
    
    void moverDiscos(int n, char a, char c, char b){
        if(n==1){
            System.out.printf("Mover um disco de %c para %s\n",a,c);
            nmov++;
        }
        else{
            moverDiscos(n-1, a, b, c);
            moverDiscos(1, a, c, b);
            moverDiscos(n-1, b, c, a);
        }
    }
    void escreveTotalMovimentos(){
        System.out.printf("Total de movimentos = %d\n",nmov);
    }
}
