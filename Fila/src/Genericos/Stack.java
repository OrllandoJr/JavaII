package Genericos;

import java.util.EmptyStackException;
/*
 * @author Orlando Jr
 */
public interface Stack {
    
    public int size(); // Mostra o tamanho da pilha
    
    public boolean isEmpty(); // Mostra se pilha está vazia ou não
    
    public Object top() throws EmptyStackException; // Mostra o projeto do topo da pilha
    
    public void push(Object x); //Insere um projeto no topo da pilha
    
    public Object pop() throws EmptyStackException; //Remove o projeto do topo da pilha
    
}
