package lists;

public abstract class AbstractDoublyLinkedList<K extends Comparable<K>,V> extends AbstractList<K,V> {
    
    public AbstractDoublyLinkedList() {
        head.setNext(tail);
        tail.setPrev(head);
    }
    
    @Override
    public void remove(K key) {
        assert contains(key) : "The key must be in the list";
        
        ListNode<K,V> node = find(key);
        
        ListNode<K,V> prev = node.getPrev();
        ListNode<K,V> next = node.getNext();
        
        next.setPrev(prev);
        prev.setNext(next);
        
        node.setNext(null);
        node.setPrev(null);
    }

}
