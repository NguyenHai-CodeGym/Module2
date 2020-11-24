import java.util.Scanner;

public class UnifyArray {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int arr1[] = new int[10];
        int arr2[] = new int[10];
        int arr3 [] = new int[arr1.length + arr2.length];
        int index = 0;

        for(int i = 0; i< arr1.length;i++){
            arr1[i] = i + 1;
            arr2[i] = i + 10;
        }
        for(int i = 0; i< arr1.length;i++){
            arr3[index++] = arr1[i];
        }
        for (int i = 0; i < arr1.length;i++ ){
            arr3[index++] = arr2[i];
        }
        for(int i : arr3){
            System.out.println(i);
        }
    }
}
