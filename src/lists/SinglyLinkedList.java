package lists;

public class SinglyLinkedList<K extends Comparable<K>, V> extends AbstractSinglyLinkedList<K,V> {

    public SinglyLinkedList() {
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
        
        newNode.setNext(head.getNext());
        head.setNext(newNode);
    }

}
