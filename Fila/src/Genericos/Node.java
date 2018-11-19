package Genericos;
/*
 * @author Orlando Jr
 */
public class Node {
    Object val;
    Node next;
    
    public Node(Object v, Node n){
        val = v;
        next = n;
    }

    public Node next() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object val() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
