import java.util.ArrayList;
import java.util.Comparator;

public class ProductManager<T>{
    ArrayList<T> arrayList = new ArrayList<T>();

    public void addProduct(T element){
        arrayList.add(element);
    }


}
