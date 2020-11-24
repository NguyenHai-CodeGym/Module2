import java.util.Scanner;

public class ReverseElementArray {
    public static void main(String[] args) {

//        Khai báo các biến, nhập và kiểm tra kích thước mảng
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }

        } while (size > 20);
//          Nhập giá trị cho các phần tử của mảng
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Element" + (i + 1) + ": ");
            array[i] = sc.nextInt();
            i++;
        }

//        In ra mảng đã nhập
        System.out.printf("%-20s%s", "Element in array: ", " ");
        for(int j = 0; j< array.length; j++){
            System.out.print(array[j] + "\t");
        }

//        Reverse element array
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }

//        In ra mảng sau khi đã đảo ngược thứ tự các phần tử
        System.out.printf("%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
