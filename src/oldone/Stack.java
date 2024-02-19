package oldone;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    private List<T> stackElements = new ArrayList<>();

    public List<T> getStackElements() {
        return stackElements;
    }

    public synchronized void push(T element){
        stackElements.add(element);
    }
    public synchronized T pop(){
        if(!stackElements.isEmpty()){
            return stackElements.remove(stackElements.size()-1);
        }
        return null;
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack();
        System.out.println("push time");
        stack.push("kleiton");
        stack.push("marcio");
        stack.push("other");
        printList(stack.getStackElements());
        System.out.println("Pop time");
        stack.pop();
        printList(stack.getStackElements());

    }

    private static void printList(List<String> list){
        list.stream().forEach(e->System.out.println(e));
    }
}
