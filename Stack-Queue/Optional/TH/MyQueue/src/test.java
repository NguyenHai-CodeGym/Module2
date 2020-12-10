public class test {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(5);
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);


        myQueue.dequeue();
        System.out.println(myQueue.currentSize);
        myQueue.print();
    }
}
