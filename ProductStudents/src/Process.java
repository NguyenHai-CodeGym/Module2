import java.util.ArrayList;
import java.util.Scanner;

public class Process {
    static Scanner sc = new Scanner(System.in);
    CheckValidate checkValidate = new CheckValidate();

    public static boolean confirm(){
        int choice = -1;
        System.out.println("1. Xác nhận thực hiện hành động");
        System.out.println("2. Trở về Menu chính");
        choice = sc.nextInt();
        switch (choice){
            case 1:
                return true;
            case 2:
                return false;
        }
        return false;
    }
}
