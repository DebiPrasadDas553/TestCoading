import java.util.*;
import java.util.stream.Collectors;

public class NonRepeatingChar {
    public static void main(String[] args) {
        String str = "dfsdfca";
        NonRepeatingChar.nonRepeatingChar(str);
    }

    public static void nonRepeatingChar(String str) {
        String[] str1 = str.split("");
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String st : str1) {
            if (map.containsKey(st)) {
                map.put(st, map.get(st) + 1);
            } else {
                map.put(st, 1);
            }
        }
        // List<String> list= map.entrySet().stream().filter(n -> n.getValue() == 1).map(n -> n.getKey()).collect(Collectors.toList());
        List<String> list = new ArrayList<>();
        for (Map.Entry ma : map.entrySet()) {
            if (ma.getValue().equals(1)) {
                list.add((String) ma.getKey());
            }
        }
        String firstnonRepeateElement = list.stream().findFirst().get();
        System.out.println("First non repeating char is" + "---" + firstnonRepeateElement);
    }
}
