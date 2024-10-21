import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question17 {
    public static void main(String[] args) {
        String[]words={"ab","abcd","bcdaf","bcad","acd","acab"};
                String str="abcd";
        Question17.anagram(words,str);

    }
    public static void anagram(String[]words,String word){
        List<String>listWords= new ArrayList<>();
        for (String word1:words){
            if (word1.length()==word.length()){
                List<String> collect = Arrays.stream(word1.split("")).collect(Collectors.toList());
                List<String> collect1 = Arrays.stream(word.split("")).collect(Collectors.toList());
                List<String> collect2 = collect1.stream().filter(collect::contains).collect(Collectors.toList());
                if (collect2.size()== collect.size()){
                    listWords.add(word1);
                }
            }
        }
        System.out.println(listWords);
    }
}
