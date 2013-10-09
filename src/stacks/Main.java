package stacks;

public class Main {

    public static void main(String[] args) {
        Stack<String> james = new Stack<String>();
        
        System.out.println(james.isEmpty());
        
        james.push("Hello");
        
        System.out.println(james.isEmpty());
        
        james = new Stack<String>();
        
        System.out.println(james.peek() == null);
        
        james.push("Hello");
        
        System.out.println(james.peek());
        
        james = new Stack<String>();
        
        System.out.println(james.pop() == null);
        
        james.push("James");
        
        System.out.println(james.pop());
        
        System.out.println(james.isEmpty());
    }
}
