import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cạnh a tam giác");
        int a = sc.nextInt();
        System.out.println("Nhập cạnh b tam giác");
        int b = sc.nextInt();
        System.out.println("Nhập cạnh c tam giác");
        int c = sc.nextInt();

        try{
           checkTriangle(a,b,c);
        }catch (IllegalTriangleException e){
            System.out.println(e.getMessage());
        }
    }
    public static void checkTriangle(int a, int b, int c) throws IllegalTriangleException{
        if(a + b <= 0 || a+c <=0 || b+c <= 0){
            throw new IllegalTriangleException("Tam giác không hợp lệ");
        }else {
            System.out.println("Tam giác hợp lệ");
        }
    }
}
