
public class Queue {
//    Node
    public class Node {
        public int data;
        public Node link;

        public Node(int data){
            this.data = data;
            this.link = null;
        }
    }
//    Queue
    public Node front;
    public Node rear;
    public int numNodes = 0;

    public Queue(int data){
        Node newNode = new Node(data);
        this.front = this.rear = newNode;
        numNodes=1;
    }

//    enQueue
    public void enQueue(int data){
        Node newNode = new Node(data);
        if(this.front == null){
            this.rear = this.front = newNode;
            return;
        }
        Node rearHolder = this.rear;
        this.rear = newNode;
        rearHolder.link = rear;
        this.rear.link = front;
        numNodes++;
    }
//    dequeu
    public Object deQueue(){
        if(this.front == null){
            return null;
        }
        Object objectHolder = front.data;
        front = front.link;
        rear.link = front;
        numNodes--;
        return objectHolder;
    }
// size
    public int size(){
        return numNodes;
    }
    public void Print(){
       for(int i =0;i<numNodes;i++){
           System.out.println(front.data);
           front = front.link;
       }
    }
}
