import java.util.HashMap;
import java.util.Map;

public class LongestPallindrom {
    public static void main(String[] args) {
        String str="abccccdddaa";//dccaccd a-1,b-1,c-4,d-3
        LongestPallindrom.findLongestPallendrum(str);

    }

    public static void findLongestPallendrum(String str){

        String [] st= str.split("");
        Map<String,Integer>map = new HashMap<>();
        for (String s:st){
            if (map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }
            else{
                map.put(s,1);
            }
        }
        int length=0;

       for (int count:map.values()){
           if (count%2==0){
               length=length+count;
           }
           else {
               length=length+count-1;
           }
       }
       if (length%2==0){
           length=length+1;
           System.out.println(length);
       }
       else {
           System.out.println(length);
       }

    }
}
