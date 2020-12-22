import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ManagerProduct {
    static ArrayList<Product> arrayList;
    Scanner sc = new Scanner(System.in);
    int choice = -1;
    static int id = 1;
    static {
        try {
            Object fileProduct = ProcessFile.readFile("productList.data");
            if(fileProduct == null){
                arrayList = new ArrayList<>();
            }else {
                arrayList = (ArrayList<Product>) fileProduct;
            }
            int maxId=0;
            for (Product products : arrayList) {
                int currenId= products.getId();
                if(currenId>maxId) maxId=currenId;
            }
            id=maxId+1;
        } catch (Exception e) {
            arrayList = new ArrayList<>();
            id=1;
        }
    }

    //    init menu
    public void initMenu() throws Exception {
        while (choice != 0) {
            System.out.println("-----Menu-----");
            System.out.println("1.Thêm Sản Phẩm ");
            System.out.println("2.Hiển thị Sản Phẩm");
            System.out.println("3.Tìm kiếm thông tin sản phẩm");
            System.out.println("0.Exit");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    showProduct();
                    break;
                case 3:
                    searchProduct();
                    break;
                case 0:
                    System.out.println("-----GoodBye-----");
                    System.exit(0);
            }
        }
    }

    //    add product
    public void addProduct() throws Exception {
        System.out.println("Nhập tên sản phẩm");
        String name = sc.nextLine();
        System.out.println("Nhập hãng sản xuất");
        String brand = sc.nextLine();
        System.out.println("Nhập giá sản phẩm");
        double price = sc.nextInt();
        sc.nextLine();
        Product product = new Product(id++, name, brand, price);
        arrayList.add(product);
        outputFile();
    }

    //        show product
    public void showProduct() {
        System.out.println(arrayList);
    }

    //    search Product
    public void searchProduct() {
        System.out.println("Nhập id sản phẩm muốn tìm");
        int id = sc.nextInt();
        System.out.println(arrayList.get(id - 1));
    }

//    ghi file
    public static void outputFile() throws Exception {
        ProcessFile.saveFile(arrayList,"productList.data");
    }
//    d
}
