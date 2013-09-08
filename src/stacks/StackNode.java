package stacks;

import nodes.Node;

public class StackNode<V> extends Node<V> {
    
    private StackNode<V> next;
    
    public StackNode(V value, StackNode<V> next) {
        this.value = value;
        this.next = next;
    }

    public StackNode<V> getNext() {
        return next;
    }
    
}
