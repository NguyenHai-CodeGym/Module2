import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter size Array");
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            System.out.println("Enter value Array");
//            arr[i] = sc.nextInt();
//        }
        int []arr = {5,3,6,4,2,7,8};
        System.out.println("mảng ban đầu");
        System.out.println(Arrays.toString(arr));

        selectionSort(arr);
        System.out.println("Mảng sau khi sắp xếp chọn");
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int arr[]){
        for (int i = 0; i < arr.length   ; i++) {
         int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            if(min != i){
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
