package lists;

public class SinglyOrderedLinkedList<K extends Comparable<K>, V> extends AbstractSinglyLinkedList<K,V> {

    public SinglyOrderedLinkedList() {
        super();
    }
    
    @Override
    public void add(K key, V value) {
        if (contains(key)) {
            ListNode<K,V> node = find(key);
            node.setValue(value);
            return;
        }
        
        numElems++;
        
        ListNode<K,V> newNode = new ListNode<K,V>(key, value);
        
        ListNode<K,V> curr = head;
        
        while ((curr.getNext() != tail) && (curr.getNext().getKey().compareTo(key) < 0)) {
            curr = curr.getNext();
        }
        
        newNode.setNext(curr.getNext());
        curr.setNext(newNode);
    }

}
