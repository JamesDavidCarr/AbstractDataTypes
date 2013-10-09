package queues;

public abstract class AbstractQueue<T> {
    
    protected QueueNode<T> first;
    protected QueueNode<T> last;
    protected int          numNodes;
    
    public AbstractQueue() {
        first    = null;
        last     = null;
        numNodes = 0;
    }
    
    public abstract boolean isEmpty();
    
    public abstract void enqueue(T newElem);
    
    public abstract T getFront() throws QueueException;
    
    public abstract T dequeue() throws QueueException;

}