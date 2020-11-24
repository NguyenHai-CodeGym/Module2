import java.util.Arrays;
import java.util.Scanner;

public class deleteElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int i = 0;
        do {
            System.out.println("Enter a size");
            size = sc.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);
//        them value vao mang;
        int[] arr = new int[size];
        while (i < arr.length) {
            System.out.println("Enter value in arr at" + (i + 1));
            arr[i] = sc.nextInt();
            i++;
        }

        int valueToRemove = sc.nextInt();

        System.out.println(Arrays.toString(removeAll(arr, valueToRemove)));

    }

    public static int[] removeAll(int[] arr, int value) {
        int[] newArr = new int[arr.length];
        int current = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != value) {
                newArr[current] = arr[i];
                current++;
            }
        }
        for (; current < newArr.length; current++) {
            newArr[current] = 0;
        }
        return newArr;
    }
}
