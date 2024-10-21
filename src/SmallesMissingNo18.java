import java.util.HashSet;
import java.util.Set;

public class SmallesMissingNo18 {

    public static void main(String[] args) {

        int[]arr={1,2,3,4};
        int no=5;
        SmallesMissingNo18.smallestMissingNo(arr,no);
    }

    public static void smallestMissingNo(int[]arr,int nos){

        Set<Integer> set= new HashSet<>();
        for (int i=0;i< nos;i++){
            set.add(i);
        }
        for (Integer no:arr){
            if (set.contains(no)){
                set.remove(no);
            }
        }
       Integer smallestmissingNo= set.stream().reduce((x,y)->x>y?x:y).get();
        System.out.println(smallestmissingNo);
    }
}
