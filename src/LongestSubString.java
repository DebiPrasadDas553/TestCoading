import java.util.Arrays;

public class LongestSubString {
    public static void main(String[] args) {
        String str ="absdsbs";
        String substring="";
       String[] st= str.split("");
        for (int i=0;i<st.length;i++){
            for (int j=i+1;j<=st.length;j++){
                 substring =substring+str.substring(i,j)+" ";
            }
        }
        System.out.println(substring);
        String longestSubStrig = Arrays.stream(substring.split(" ")).reduce((x, y) -> x.length() > y.length() ? x : y).get();
        System.out.println(longestSubStrig);
    }
}
