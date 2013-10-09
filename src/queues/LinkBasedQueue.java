package queues;

public class LinkBasedQueue<T> extends AbstractQueue<T> {
    
    public LinkBasedQueue() {
        super();
    }

    @Override
    public boolean isEmpty() {
        return numNodes == 0;
    }

    @Override
    public T getFront() throws QueueException {
        if (!isEmpty()) {
            T result = first.getValue();
            return result;
        } else {
            throw new QueueException("Error in dequeue, the queue was empty");
        }
    }

    @Override
    public void enqueue(T newElem) {
        QueueNode<T> newNode = new QueueNode<T>(newElem);
        if (isEmpty()) {
            first = newNode;
            last  = newNode;
        } else {
            last.setNext(newNode);
            last = newNode;
        }
        numNodes++;
    }

    @Override
    public T dequeue() throws QueueException {
        if (!isEmpty()) {
            T result = first.getValue();
            if (first == last) {
                last = null;
            }
            first = (QueueNode<T>) first.getNext();
            numNodes--;
            return result;
        } else {
            throw new QueueException("Error in dequeue, the queue was empty");
        }
    }

}
