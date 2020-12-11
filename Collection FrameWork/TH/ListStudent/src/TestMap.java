import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> haspmap = new HashMap<>();

        haspmap.put("Phuoc Babies", 19);
        haspmap.put("Vinh Babies", 26);
        haspmap.put("Thinh Babies", 20);
        haspmap.put("Thang Babies", 22);
        Iterator<String> itr = haspmap.keySet().iterator();
        while (itr.hasNext()){
            System.out.println(haspmap.get(itr.next()));
        }
        System.out.println("/////////");


        Map<Integer, String> treemap = new TreeMap<>();
        treemap.put(2,"Phuoc");
        treemap.put(5,"Thang");
        treemap.put(1,"Dat");
        treemap.put(4,"Hai");
        treemap.put(3,"Thinh");

       for(Map.Entry<Integer, String> entry : treemap.entrySet()){
           System.out.println(entry.getKey() + " " + entry.getValue());
       }
        System.out.println("/////////");

       Map<Integer, String> linkedhasmap = new LinkedHashMap<>();
       linkedhasmap.put(2,"Phuoc");
       linkedhasmap.put(5,"Thang");
       linkedhasmap.put(1,"Dat");
       linkedhasmap.put(4,"Hai");
       linkedhasmap.put(3,"Thinh");

       Set<Integer> keyset = linkedhasmap.keySet();
       for(Integer keys : keyset){
           System.out.println(keys +  " " + linkedhasmap.get(keys));
       }

    }
}
