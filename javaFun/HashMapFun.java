import java.util.HashMap;
import java.util.Set;
public class HashMapFun {
    public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("johnsmith@mail.com", "John Smith");
        userMap.put("bobjohnson@mail.com", "Bob Johnson");
        userMap.put("susanjacobs@mail.com", "Susan Jacobs");

        String name = userMap.get("johnsmith@mail.com");
        System.out.println("The full name is: " + name);

        //get the keys by using the keySet method
        Set<String> keys = userMap.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(userMap.get(key));
        }
    }
}