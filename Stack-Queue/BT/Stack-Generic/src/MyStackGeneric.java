import java.util.LinkedList;

public class MyStackGeneric<T> {
    LinkedList<T> stack;

    public MyStackGeneric(){
        stack = new LinkedList<>();
    }

//    size
    public int size(){
        return stack.size();
    }
//    print
    public void print(){
        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.get(i));
        }
    }
//    isEmpty
    public boolean isEmpty(){
        return stack.size() == 0;
    }

//    push
    public void push(T element){
        stack.addLast(element);
    }
// pop
    public T pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        return stack.removeLast();
    }
}
