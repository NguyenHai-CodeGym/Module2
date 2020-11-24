public class FindMin {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int index = min(arr);
        System.out.println("The smallest element in the array is: " + index);
    }
    public static int min(int arr[]){
        int min = arr[0];
        for(int i = 0; i< arr.length;i++){
            if(min > arr[i]){
                min = arr[i];
            }
        } return min;
    }
}
