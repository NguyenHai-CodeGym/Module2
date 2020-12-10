public class MyStack {
    public int[] arr;
    public int size;
    public int index = 0;

    public MyStack(int size){
        this.size = size;
        arr = new int[size];
    }

//    size
    public int size(){
        return size;
    }
//    isEmpty
    public boolean isEmpty(){
        return index == 0;
    }
//    isFull
    public boolean isFull(){
        return index == size;
    }
//    print
    public void print(){
        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);
        }
    }
//    push
    public void push(int element){
        if(isFull()){
            System.out.println("Array is Full");
            return;
        }
        arr[index] = element;
        index++;
    }
//    pop
    public int pop(){
        if(isEmpty()){
            System.out.println("Arr is Empty");
            return -1;
        }
        --index;
        return index+1;

    }
}