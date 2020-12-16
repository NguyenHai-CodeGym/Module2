public class BinarySearch {
    static int[] list = {0,1,2,3,4,5,6,7,8,9};
    static int binarySearch(int[] list, int key){
        int low = 0;
        int hight = list.length-1;
        while (hight >= low) {
            int mid = (hight + low /2);
            if(key > list[mid]){
                low = mid +1;
            }else if(key == list[mid]){
                return mid;
            }else {
                hight = mid -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list,8));
    }
}
