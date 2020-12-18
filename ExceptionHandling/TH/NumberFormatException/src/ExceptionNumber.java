public class ExceptionNumber {
    public void caculator(int a, int b){
        try{
            int sum = a + b;
            System.out.println("Tổng của " + a + " " + b + " là: " + sum);
            int subtraction = a - b;
            System.out.println("Hiệu của " + a + " " + b + " là: " + subtraction);
            int multiplication = a * b;
            System.out.println("Tích của " + a + " " + b + " là: " + multiplication);
            int division = a / b;
            System.out.println("Thương của " + a + " " + b + " là: " + division);
        }catch (Exception e){
            System.err.println("Xảy ra ngoại lệ");
        }
    }
}
