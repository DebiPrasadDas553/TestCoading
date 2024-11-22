import java.util.Arrays;

public class Temp {

    public static void main(String[] args) {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};//input
        //int[] days={1,1,4,2,1,1,0,0};
        Temp.answer(temperatures);
    }

    public static void answer(int[] temp) {
        int length = temp.length;
        int[] days = new int[length];
        int count;
        for (int i = 0; i < length-1; i++) {
            count=0;
           for (int j=i+1;j<length;j++){
               if (temp[j]>temp[i]){
                   count++;
                   days[i]=count;
                   break;
               }
               else {
                   count++;
               }
           }
        }
        days[length-1]=0;
        System.out.println(Arrays.toString(days));
    }
}