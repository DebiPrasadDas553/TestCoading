import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Occurance {

    public static void main(String[] args) {
        String str = "aaccdsf";
        Occurance.getOccurances(str);
    }

    public static void getOccurances(String str) {
        String[] st = str.split("");
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String s : st) {
            if (map.containsKey(s)) {
                map.put(s,map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        for (Map.Entry ma : map.entrySet()) {
            System.out.println(ma.getKey() + "-" + ma.getValue());
        }


        //method two using java8
       /* Map<String, Long> collect = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
      for (Map.Entry ma: collect.entrySet()){
          System.out.println(ma.getKey()+" "+ma.getValue());
      }*/

    }
}
