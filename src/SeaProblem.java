import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SeaProblem {
    public static void main(String[] args) {
        int[] buildingHeight={1,7,5,3,4};
        List<Integer> buildingList = SeaProblem.buildingWithSeaView(buildingHeight);
        System.out.println(buildingList);
    }
     public static List<Integer> buildingWithSeaView(int[]buildings){
     List<Integer>buildingList= new ArrayList<>();
         int max =Integer.MIN_VALUE;
        for (int i=buildings.length-1;i>=0;i--){
            if (max<buildings[i]){
                buildingList.add(buildings[i]);
                max=buildings[i];
            }
        }
         Collections.reverse(buildingList);
        return buildingList;
     }

}
