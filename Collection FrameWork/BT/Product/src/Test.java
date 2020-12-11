import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Product product = new Product(1,"hang",12.00);
        ProductManager<Product> productProductManager = new ProductManager<>();
        productProductManager.addProduct(product);
        int choice = -1;
        Scanner sc = new Scanner(System.in);

        while (choice!=0 ){
            System.out.println("Menu");
            System.out.println("1. Hiển thị danh sách sản phẩm");
            System.out.println("2. Thêm Sản Phẩm");
            System.out.println("3. Xóa Sản phẩm theo id");
            System.out.println("4. Tìm kiếm sản phẩm theo tên");
            System.out.println("5. Sắp Xếp Sản Phẩm: ");
            System.out.println("6 . Sắp Xếp Sản Phẩm: ");
            System.out.println("0 . Exit ");
            choice = sc.nextInt();

            switch (choice){
                case 2:
                    System.out.println("Nhập id:");
                    int id = sc.nextInt();
                    System.out.println("Nhập tên");
                    String nameprd = sc.nextLine();
                    System.out.println("Nhập price");
                    double priceprd = sc.nextDouble();
                    Product product1 = new Product(id,nameprd,priceprd);
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }


    }
}
