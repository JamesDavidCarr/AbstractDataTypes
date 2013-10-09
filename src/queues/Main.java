package queues;

public class Main {

    public static void main(String[] args) throws QueueException {
        
        LinkBasedQueue<Integer> numbers = new LinkBasedQueue<Integer>();
        
        System.out.println(numbers.isEmpty());
        
        numbers.enqueue(new Integer(1));
        
        System.out.println(numbers.getFront());
        
        System.out.println(numbers.isEmpty());
        
        System.out.println(numbers.dequeue());
        
        System.out.println(numbers.isEmpty());
        
    }
    
}
