package FilaPilha;

import Genericos.Queue;
import javax.swing.JOptionPane;

/**
 * @author Orllando Jr
 */
public class ArrayQueue implements Queue {

    private static final int MAX=100;
    private Object queue[]; //Fila
    private int size;       //Nº de pessoas
    private int first;      //Primeira pessoa da fila
    private int last;       //Ultima pessoa da fila
    private int cap;        //capacidade da fila

    ArrayQueue() {
        this(MAX);
    }
    
    ArrayQueue(int c){
        cap = c;
        queue = new Object[cap];
        size = first = last=0;
    }
    
    
    
    @Override
    public int size() {
        return size;        //retorna tamanho da fila
    }

    @Override
    public boolean isEmpty() {  //Se não tiver ninguém 
        return (size==0);       //na fila, retornará true
    }

    @Override
    public boolean isFull(){
        return (size==MAX);     //Retornará true, caso a fila esteja cheia
    }
    
    @Override
    public Object proximo() {
        if (isEmpty()){
            throw new RuntimeException("Fila vazia!");
        }
        return this.queue[first]; 
        
    }
    
    @Override
    public Object atender() {
        if (isEmpty()){
            throw new RuntimeException("Fila vazia!");
        }
        Object prox = queue[first];  //Atende o proximo da fila.
        first = (first++) % cap;     //Altera a posição da primeira pessoa
        size--;                      //Subtrai uma pessoa da fila
        return prox;
    }

    @Override
    public void entrarNaFila(Object pessoa) {
        if (isFull()){
            throw new RuntimeException("Fila cheia!");
        }
        queue[last] = pessoa;   //Adiciona uma pessoa a fila
        last = (last++)% cap;   //Altera a posição da ultima pessoa
        size++;                 //Adiciona +1 no tamanho da fila
    }

    
}
