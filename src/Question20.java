import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Question20 {

    public static void main(String[] args) {
        String str1 = "aabbbbccddd";
        Question20.findIndexAndOcc(str1);
    }

    public static void findIndexAndOcc(String str1){
        String[] st = str1.split("");
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String s : st) {
            if (!map.containsKey(s)) {

                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
        }
        String maxOccurance= map.entrySet().stream().max(Map.Entry.comparingByValue()).map(n -> n.getKey()).get();
        int index= str1.indexOf(maxOccurance);
        System.out.println("Index is"+"->"+index+" "+"&&"+" "+"max Occurance is"+"->"+maxOccurance);

    }

    }



