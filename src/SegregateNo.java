import java.util.Arrays;

public class SegregateNo {

    public static void main(String [] args){
        int[] array= {1,2,3,-2,3,-7,1};
        SegregateNo.getArray(array);

    }

    public static void getArray(int[]nos){
        int size = nos.length;
        int array[]= new int[size];
        int left=0;
        int right=size-1;

        for (int i=0 ;i<nos.length;i++){

            if (nos[i]>0){
                array[left]=nos[i];
                left++;
            } else  {
                array[right]=nos[i];
                right--;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
