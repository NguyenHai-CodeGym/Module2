import java.util.Scanner;

public class FindMinElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size arr");
        int size = sc.nextInt();
        System.out.println("Enter value in array");
        int arr[] = new int[size];
        for(int i = 0; i<size;i++){
            System.out.printf("a[%d] = ", i);
            arr[i] = sc.nextInt();
        }
        for(int i : arr){
            System.out.println(i);
        }
//        find min
        int min = arr[0];
        for(int i = 0; i< arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Min is:" + min);
    }
}
