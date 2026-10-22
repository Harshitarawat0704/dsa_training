import java.util.HashMap;

public class Hash {
    public static void main(String[] args) {

        HashMap<Integer, String> map= new HashMap<>();

        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");

      
        System.out.println("HashMap: " + map);

       
        System.out.println("Value at key 2: " + map.get(2));

       
    }
}
