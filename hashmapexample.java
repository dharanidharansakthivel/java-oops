import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.*;
public class hashmapexample {
    public static void main(String[] args) {
      /*  HashMap<String, String> capitals = new HashMap<>();
        capitals.put("usa","Washington D.C");
        capitals.put("uk","london");
        capitals.put("india","new delhi");
        for(String country:capitals.keySet()){
            String capital = capitals.get(country);
            System.out.println("capital"+country+": "+capital);
        }*/ 
        LinkedHashSet<String> electronic = new LinkedHashSet<>();
        electronic.add("USA");
        electronic.add("UK");
        electronic.add("India");
        Iterator<String> it = electronic.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
