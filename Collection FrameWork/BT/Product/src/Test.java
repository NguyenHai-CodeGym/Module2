import java.util.Collections;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ProductManager productList  = new ProductManager();
        int choice = -1;
        Scanner sc = new Scanner(System.in);

        while (choice !=0){
            System.out.println("1. Thêm Sản Phẩm");
            System.out.println("2. Hiển thị danh sách sản phẩm");
            System.out.println("3. Tìm kiếm sản phẩm theo tên");
            System.out.println("4. Tìm kiếm sản phẩm theo id");
            System.out.println("5. Sửa sản phẩm theo id");
            System.out.println("6. Xóa sản phẩm theo id");
            System.out.println("7. Săp xếp sản phẩm theo giá");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                   productList.add();
                    System.out.println("Thêm sản phẩm thành công");
                    break;
                case 2:
                    productList.show();
                    break;
                case 3:
                    productList.find();
                    break;
                case 4:
                    productList.findId();
                    break;
                case 5:
                    productList.editById();
                    break;
                case 6:
                    productList.removeById();
                    break;
                case 7:
                    System.out.println("Sắp xếp giá theo giảm dần");
                    productList.sort();
                case 0:
                    System.exit(0);
            }
        }
    }
}
