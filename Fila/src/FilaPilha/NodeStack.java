package FilaPilha;

import Genericos.Stack;
import Genericos.Node;
import java.util.EmptyStackException;
/*
 * @author Orlando Jr
 */
public class NodeStack implements Stack{
    
    Node top;
    int size;

    public NodeStack(){
        top=null;
        size = 0;
    }
    
    @Override
    public boolean isEmpty(){
        return (top==null);
    }
   
    @Override
    public int size() throws EmptyStackException {
        if (isEmpty())
            throw new RuntimeException("Pilha vazia!");
        Object res = top.val();
        top = top.next();
        size--;
        return (int) res;
    }
    
    @Override
    public void push(Object x){
        top = new Node(x, top);
        size++;
    }

    @Override
    public Object pop() throws EmptyStackException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object top() throws EmptyStackException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
}
