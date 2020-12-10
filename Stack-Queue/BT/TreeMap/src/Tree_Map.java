import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
public class Tree_Map {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        String strUpcase = str.toUpperCase();
        TreeMap<Character, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (treeMap.containsKey(strUpcase.charAt(i))) {
                treeMap.put(strUpcase.charAt(i), treeMap.get(strUpcase.charAt(i)) + 1);
            } else {
                treeMap.put(strUpcase.charAt(i), 1);
            }
        }

        Set<Character> keys = treeMap.keySet();
        for (Character key : keys) {
            System.out.println(key + " - " + treeMap.get(key));
        }


    }}

