package nodes;

public class Node<V> {
    
    protected V value;
    
    public void setValue(V newValue) {
        value = newValue;
    }
    
    public V getValue() {
        return value;
    }

}
