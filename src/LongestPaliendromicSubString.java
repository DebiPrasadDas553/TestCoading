import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestPaliendromicSubString {

    public static void main(String[] args) {
        String str="forgeeksskeegfor";//geeksskeeg
        LongestPaliendromicSubString.longestSubString(str);
    }

    public static void longestSubString(String str) {
        Set<String> listStr = new HashSet<>();
        String[] st1 = str.split("");
        String subString = "";
        if (str == "") {
            System.out.println("String is empty");
        } else if (str.length() == 1) {
            System.out.println("return same element" + "->" + str);
        } else {
            for (int i = 0; i < st1.length; i++) {
                for (int j = i + 1; j <= st1.length; j++) {
                    subString = subString + str.substring(i, j) + " ";//collect the substrings
                }
            }

            String[] words = subString.split(" ");
            for (String word : words) {
                if (isPaliendrome(word)) {
                    listStr.add(word);
                }
            }
            String longestString = listStr.stream().reduce((x, y) -> x.length() > y.length() ? x : y).get();

            int index = str.indexOf(longestString);

            System.out.println("Longest String is" + "->" + longestString + " " + "&&" + "index is" + "->" + index);
        }
        }

        public static boolean isPaliendrome (String word){
            int first = 0;
            int last = word.length() - 1;
            while (first < last) {
                if (word.charAt(first) != word.charAt(last)) {
                    return false;
                } else {
                    first++;
                    last--;
                }
            }
            return true;
        }

}
