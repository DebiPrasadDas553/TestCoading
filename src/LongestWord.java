import java.util.ArrayList;
import java.util.List;

public class LongestWord {
    public static void main(String[] args) {
        String [] st={"CODGE","ODG","LODGES","SODG","MODG","dodge","Modge","LODGESSSS"};
        String toSearch="ODG";
        String s = LongestWord.longestWord(st, toSearch);
        System.out.println(s);

    }
    public static String longestWord(String[]words,String search){
        List<String>list=new ArrayList<>();
        for (String word:words){
            if (word.contains(search)){
                list.add(word);
            }
        }
        return"longest word"+"-"+list.stream().reduce((x,y)->x.length()>y.length()?x:y).get();
    }
}
