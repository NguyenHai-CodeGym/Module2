public class MyQueue {
    public int capacity = 0;
    public int[] queueArr;
    public int head = 0;
    public int tail = -1;
    public int currentSize = 0;

    public MyQueue(int queuSize){
        this.capacity = queuSize;
        queueArr = new int[queuSize];
    }

//    isEmpty
    public boolean isEmpty(){
        return currentSize == 0;
    }
//    isFull
    public boolean isFull(){
        return currentSize == this.capacity;
    }

//    enqueue
    public void enqueue(int item){
        if(isFull()){
            System.out.println("Arr is Full!");
            return;
        }
        tail++;
        queueArr[tail] = item;
        currentSize++;
    }
//    dequeue
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Array is Empty");
            return;
        }
        head++;
        currentSize--;
    }
//    print
    public void print(){
        for (int i = head; i <= tail; i++) {
            System.out.println(queueArr[i]);
        }
    }

}
