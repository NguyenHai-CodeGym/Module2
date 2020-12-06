import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack(){
        stack = new LinkedList<>();
    }
//    push
    public void push(T element){
        stack.addFirst(element);
    }
//    posh
    public T pop(){
        if(stack.isEmpty()){
            System.out.println("Stack is Empty");
        }
        return stack.removeFirst();
    }

//    size
    public int size(){
        return stack.size();
    }
//    isEmpty
    public boolean isEmpty(){
        if(stack.size() == 0){
            return true;
        }
        return false;
    }
}
