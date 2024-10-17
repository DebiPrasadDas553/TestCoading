import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[]arr={2,5,7,8,9,12,14};
        int tar =19;
        System.out.println(BinarySearch.binarySearch(arr,tar));

    }
    public static Integer binarySearch(int[]arr,int search){
        Arrays.sort(arr);
       int size = arr.length;
       int first= 0;
       int last=size-1;
       while (first<=last){
           int mid=(first+last)/2;
           if (arr[mid]>search){
               last=mid-1;
           } else if (arr[mid]<search) {
               first=mid+1;
           }
           else
               return mid;
       }
return -1;
    }
}
