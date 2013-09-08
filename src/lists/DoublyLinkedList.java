package lists;

public class DoublyLinkedList<K extends Comparable<K>, V> extends AbstractDoublyLinkedList<K,V> {

    public DoublyLinkedList() {
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
        newNode.setPrev(head);
        
        head.getNext().setPrev(newNode);
        head.setNext(newNode);
    }

}
