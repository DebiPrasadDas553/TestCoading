import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InterviewAsked {

        public static void getCity(Map<String,String> map){

            List<String> city = map.entrySet().stream()
                    .map(n->n.getValue().toUpperCase())
                    .filter(n->n.startsWith("A"))
                    .collect(Collectors.toList());
            System.out.println(city);
        }

        public static void main(String[] args) {
            Map<String,String> map = new HashMap<>();
            map.put("Gj", "Ahamadabad");
            map.put("Mh", "Mumbai");
            map.put("Dh", "Delhi");
            map.put("an", "anugul");

            InterviewAsked.getCity(map);
        }
    }


