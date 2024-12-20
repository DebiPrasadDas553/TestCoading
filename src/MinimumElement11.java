import java.util.Arrays;

public class MinimumElement11 {
    public static void main(String[] args) {
        int[]arr={3,4,5,6,7,1,2,9,11};;//return 1
       // MinimumElement11.minimumNoUsingList(arr);
        minimumusingBinary(arr);

    }
    public static void minimumNoUsingList(int[]arr1){
        Integer minimum = Arrays.stream(arr1).boxed().sorted().findFirst().get();
        System.out.println("minimum element is"+" "+minimum);
    }
    public static void minimumusingBinary(int[]arr2){
        int left=0;
        int right =arr2.length-1;
        while (left<right){
            int mid= (left+right)/2;
            if (arr2[mid]>arr2[right]){
                left=mid+1;
            }
            else {
                right=mid;
            }
        }
        System.out.println(arr2[left]);
    }
}
