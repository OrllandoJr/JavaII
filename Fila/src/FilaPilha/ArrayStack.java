package FilaPilha;

import Genericos.Stack;
import java.util.EmptyStackException;
/*
 * @author Orlando Jr
 */
public class ArrayStack implements Stack {
    
    public static final int MAXSIZE=100;
    private Object val[];
    private int top;
    private int cap;
    
    ArrayStack(){
        this(MAXSIZE);
    }
    
    ArrayStack(int c){
        cap = c;
        val = new Object[cap];
        top = 0;
    }
    
    @Override
    public int size(){
        return top;
    }
    
    @Override
    public boolean isEmpty(){
        return (top==0);
    }
    
    public boolean isFull(){
        return (top==cap);
    }
    
    @Override
    public void push(Object x) {
        if (isFull())
            throw new RuntimeException("Pilha cheia!");
        val [top]=x;
        top++;
    }
    
    @Override
    public Object top() throws EmptyStackException{
        if (isEmpty())
            throw new RuntimeException("Pilha vazia!");
        return val[top-1];
    }
    
    @Override
    public Object pop() throws EmptyStackException{
        if (isEmpty())
            throw new RuntimeException("Pilha vazia!");
        top--;
        return val[top];
    }
    
}
