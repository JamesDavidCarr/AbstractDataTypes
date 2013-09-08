package lists;

import nodes.Node;

public class ListNode<K,V> extends Node<V> {
    
    private K key;
    private ListNode<K,V> next;
    private ListNode<K,V> prev;
    
    public ListNode(K key, V value) {
        this.key = key;
        this.value = value;
        next = null;
        prev = null;
    }
    
    public K getKey() {
        return key;
    }
    
    public void setNext(ListNode<K,V> next) {
        this.next = next;
    }
    
    public ListNode<K,V> getNext() {
        return next;
    }
    
    public void setPrev(ListNode<K,V> newNode) {
        prev = newNode;
    }
    
    public ListNode<K,V> getPrev() {
        return prev;
    }
    
}