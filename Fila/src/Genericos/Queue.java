package Genericos;
/*
 * @author Orlando Jr
 */
public interface Queue {  //FIFO
    
    public int size(); //Retorna o numero de pessoas na fila
    
    public boolean isEmpty(); //Avisa se a fila está vazia ou não
    
    public boolean isFull(); //Mostra a primeira pessoa da fila
    
    public void entrarNaFila(Object pessoa); //entrar na fila
    
    public Object proximo(); //Mostra o primeiro da fila
    
    public Object atender(); //Atende o primeiro da fila
    
}
