public class MyLinkedList<E> {
    private Node head;
    private int numNodes=0;

    public MyLinkedList(Object data) {
        head = new Node(data);
        numNodes=1;
    }

    //    add index & Element
    public void add (int index, E elements){
        Node temp = head;
        Node holder;
        for(int i=0;i<index-1 &&temp.next!=null;i++){
            temp = temp.next;
        }
        holder = temp.next;
        Node newNode = new Node(elements);
        newNode.next = holder;
        temp.next = newNode;
        numNodes++;
    }

    //    addFirst
    public void addFirst(E elements){
        Node temp = head;
        head = new Node(elements);
        head.next = temp;
        numNodes++;
    }
    //    addLast
    public void addLast(E elements){
        add(numNodes,elements);
    }
    //    Remove Index E
    public E remove(int index){
        Node temp = head;
        E result;
        if(index == 0 || index == numNodes){
            System.out.println("Can't remove");
            return  null;
        }else{
            for(int i=0;i<index-1;i++){
                temp = temp.next;
            }
            result = (E) temp.next.data;
            temp.next = temp.next.next;
        }
        numNodes--;
        return result;

    }
    //    remove Object
    public boolean remove(Object elements){
        Node temp = head;
        for(int i=0;i<numNodes-1;i++){
            if(temp.getData().equals(elements)){
                remove(i);
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    //    size
    public int size(){
        return numNodes;
    }
    // IndexOf
    public int indexOf(E elements){
        Node temp = head;
        for(int i=0;i<numNodes;i++){
            if(temp.getData().equals(elements)){
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }
    //    contains
    public boolean contains(E elements){
        return indexOf(elements) != -1;
    }
    //    Get Index
    public E get(int index){
        Node temp = head;
        for(int i=0;i<index;i++){
            temp = temp.next;
        }
        return (E) temp.getData();
    }
    //    get Fist
    public E getFirst() {
        return get(0);
    }
    //    getLast
    public E getLast(){
        return get(numNodes-1);
    }
    // Show
    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }



    public class Node{
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData(){
            return this.data;
        }
    }
}