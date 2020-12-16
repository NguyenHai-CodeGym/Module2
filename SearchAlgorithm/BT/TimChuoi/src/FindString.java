import java.util.LinkedList;
import java.util.Scanner;

public class FindString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Character> max = new LinkedList<>();
        System.out.println("Enter String");
        String str = sc.nextLine();

        for(int i=0;i< str.length();i++){
            LinkedList<Character> linkedList = new LinkedList<>();
            linkedList.add(str.charAt(i));
            for (int j = i + 1 ; j <str.length() ; j++) {
                if(str.charAt(j) > linkedList.getLast()){
                    linkedList.add(str.charAt(j));
                }
            }
            if(linkedList.size() > max.size()){
                max.clear();
                max.addAll(linkedList);
            }
        }

        for (Character i : max){
            System.out.print(i);
        }
    }
}
