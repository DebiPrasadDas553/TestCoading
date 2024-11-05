import java.util.Arrays;

public class WaveForm {
    public static void main(String[] args) {

        int[]arr={10,5,6,3,2,20,100,80};//2,3,5,6.10,20,80,100//3,2,6,5,20,10
        findInWave(arr);
        System.out.println("Wave form"+Arrays.toString(arr));

    }

    public static void findInWave(int arr[]){
        //sorting by using selection sort
        for (int i=0;i<arr.length-1;i++){
            int minimum=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[minimum]>arr[j]){
                    minimum=j;
                }
            }
            int temp =arr[minimum];
            arr[minimum]=arr[i];
            arr[i]=temp;
        }
        System.out.println("sorting Arrays by using selection sort"+Arrays.toString(arr));
        //swap

        for (int i=0;i< arr.length-1;i+=2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }


    }

}
