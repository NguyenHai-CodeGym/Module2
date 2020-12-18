import java.util.Arrays;
import java.util.Scanner;

public class BubleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size arr:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i <size ; i++) {
            System.out.println("Enter value Arr");
            arr[i] = sc.nextInt();
        }

        System.out.println("Mảng ban đầu");
        System.out.println(Arrays.toString(arr));
        System.out.println("Mảng sau khi sắp xếp nổi bọt");
        bubleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubleSort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i -1 ; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
