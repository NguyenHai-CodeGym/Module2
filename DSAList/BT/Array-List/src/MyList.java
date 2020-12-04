import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

//    ensureCapa
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
// Add index vs Elements
     public void add(int index, E elementss) {
        if (size == elements.length) {
            ensureCapa();
        }
        for (int i = index + 1; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = elementss;
        size++;
    }

//    Remove

    public void remove(int index) {
        for (int i = index; i < elements.length - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
    }
// Get
    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }
// Size
    public int size() {
        return size;
    }
// clone array
   public MyList<E> clone(){
            return this;
   }
// IndexOf
   public int indexOf(E o){
        int index = 0;
        for(int i =0;i<size;i++){
            if(elements[i] == o){
                index = i;
                break;
            }else{
                index = -1;
            }
        }
        return index;
   }
//Contains
    public boolean contains(E o) {
        return indexOf(o) >= 0;
    }

//    boolean add
    public boolean add(E o){
        add(size,o);
        return true;
    }

//    show
    public void show(){
        for(int i = 0;i<size;i++){
            System.out.println(elements[i]);
        }
    }

// Clear
    public void clear(){
//        elements = new Object[DEFAULT_CAPACITY];
//        size = 0;
        for(int i=size-1;i>=0;i--){
            remove(i);
        }

    }

}
