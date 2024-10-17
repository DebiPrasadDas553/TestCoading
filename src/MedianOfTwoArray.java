import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MedianOfTwoArray {
    public static void main(String[] args) {

        int[] arr1 = {2, 3, 5, 8};
        int[] arr2 = {10, 12, 14, 16, 18, 20};
       /* Integer median = MedianOfTwoArray.medianOfTwoArray(arr1, arr2);
        System.out.println("median is" + "-" + median);*/

      Integer median=  MedianOfTwoArray.findMedian(arr1,arr2);
        System.out.println("median is" +"-"+ median);

    }

    //method one by using list
    public static Integer medianOfTwoArray(int[] arr1, int[] arr2) {
        List<Integer> collect = Arrays.stream(arr1).boxed().collect(Collectors.toList());
        List<Integer> collect1 = Arrays.stream(arr2).boxed().collect(Collectors.toList());
        collect.addAll(collect1);
        int size = collect.size();
        if (size % 2 == 0) {
            return (collect.get(size / 2) + collect.get((size / 2) - 1)) / 2;
        }
        return collect.get(size / 2);
    }

    //method two using adding arrays

    public static Integer findMedian(int[] arr1, int[] arr2) {
        int a = arr1.length;
        int b = arr2.length;
        int c= a+b;
        int[]arr3= new int[c];
        //travers arr1 and add into the arr3
        for (int i=0;i<a;i++){
            arr3[i]=arr1[i];
        }
        //travers arr2 and add into the arr3
        for (int i=0;i<b;i++){
            arr3[a+i]=arr2[i];
        }

        if (c%2!=0){
            return arr3[c/2];
        }
        return (arr3[c/2]+arr3[(c/2)-1])/2;
    }
}
