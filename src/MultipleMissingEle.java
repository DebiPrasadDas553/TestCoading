import java.util.HashSet;
import java.util.Set;

public class MultipleMissingEle {

    public static void main(String[] args) {
        int[] arr={1,3,2,6,8,7,4};//
        int nos=10;
        MultipleMissingEle.missingNo(arr,nos);
    }

    public static void missingNo(int[] arr,int nos){
        Set<Integer> set= new HashSet<>();
        for (int i=1;i<=nos;i++){
            set.add(i);
        }
        for (int no:arr){
            if (set.contains(no)){
                set.remove(no);
            }
        }
        System.out.println(set);
    }
}


