package queues;

import nodes.Node;

public class QueueNode<T> extends Node<T> {
    
    private Node<T> prev;
    private Node<T> next;
    
    public QueueNode(T newValue) {
        value = newValue;
        prev = null;
        next = null;
    }
    
    public Node<T> getPrev() {
        return prev;
    }
    
    public void setPrev(Node<T> newPrev) {
        prev = newPrev;
    }
           
    public Node<T> getNext() {
        return next;
    }
    
    public void setNext(Node<T> newNext) {
        prev = newNext;
    }

}