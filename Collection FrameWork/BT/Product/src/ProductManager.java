import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManager {
    Scanner sc = new Scanner(System.in);
    ArrayList<Product> ProductArray = new ArrayList<>();
    int currentId = 1;

    //    show
    public void show() {
        if (ProductArray.size() == 0) {
            System.out.println("Trống sản phẩm");
        } else {
            for (Product list : ProductArray) {
                System.out.println(list);
            }
        }
    }

    //    Add
    public void add() {
        System.out.println("Nhập tên sản phẩm");
        String name = sc.nextLine();
        System.out.println("Nhập giá sản phẩm");
        int price = sc.nextInt();
        sc.nextLine();
        ProductArray.add(new Product(currentId++, name, price));
    }

    //    Find product by name
    public void findByName(String name) {
        int count = 0;
        for (Product list : ProductArray) {
            if (list.getName().equals(name)) {
                System.out.println(list);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Sản phẩm không tồn tại");
        }
    }

    public void find() {
        System.out.println("Nhập tên sản phẩm muốn tìm kiếm");
        String nameFind = sc.nextLine();
        findByName(nameFind);
    }

    //    Find product by id
    public void findById(int id) {
        int count = 0;
        for (Product list : ProductArray) {
            if (list.getId() == id) {
                System.out.println(list);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Sản phẩm không tồn tại");
        }
    }

    public void findId() {
        System.out.println("Nhập Id sản phẩm muốn tìm");
        int id = sc.nextInt();
        sc.nextLine();
        findById(id);
    }

    //    Edit Prodcut by id
    public void idInput(int id) {
        int count = 0;
        for (Product list : ProductArray) {
            if (list.getId() == id) {
                System.out.println("Nhập tên mới");
                String newName = sc.nextLine();
                list.setName(newName);
                System.out.println("Nhập giá mới");
                int newPrice = sc.nextInt();
                sc.nextLine();
                list.setPrice(newPrice);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Sản phẩm không tồn tại");
        }
    }

    public void editById() {
        System.out.println("Nhập id của sản phẩm muốn sửa");
        int id = sc.nextInt();
        sc.nextLine();
        idInput(id);
        System.out.println("Sửa thành công");
    }

    //    remove by id
    public void inpId(int id) {
        for (Product list : ProductArray) {
            if (list.getId() == id) {
                ProductArray.remove(list);
                System.out.println("Xóa thành công");
                break;
            }
        }
    }

    public void removeById() {
        System.out.println("Nhập id sản phẩm muốn xóa");
        int id = sc.nextInt();
        sc.nextLine();
        inpId(id);
    }
//    sắp xếp giá giảm giần
    public void sort(){
       Collections.sort(ProductArray);
        System.out.println(ProductArray);
    }
//    sắp xếp tăng dần
}
