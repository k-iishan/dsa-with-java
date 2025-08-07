import java.util.HashMap;
import java.util.Set;

public class Hash01 {
    public static void main(String[] args) {
        HashMap<Integer , String> map = new HashMap<>();
        map.put(45, "kishan");
        map.put(445, "kishan");

        System.out.println(map);

        String k = map.get(45);
        System.out.println(k);

        System.out.println(map.containsKey(44));  
        System.out.println(map.containsValue("llll"));
    

        //loop

        Set<Integer> keys= map.keySet();
        for(int i : keys){
            System.out.println(map.get(i));

        }
    }
    
}
