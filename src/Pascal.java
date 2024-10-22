import java.util.Arrays;

public class Pascal {
    public static void main(String[] args) {

        int no=5;
        Pascal.getPreviousArray(no);

    }
    public static int[] getNextArray(int[] previous){
        int[]newArray= new int[previous.length+1];
        newArray[0]=1;//first element
        for (int i=1;i<previous.length;i++){     //middle element
            newArray[i]=previous[i-1]+previous[i];
        }
        newArray[previous.length]=1;//last element
        return newArray;
    }


    public static void getPreviousArray(int no){
        int[] previous={1};
        System.out.println(Arrays.toString(previous));
        String st="";
        for (int i=1;i<no;i++){
           previous=getNextArray(previous);
           System.out.println(Arrays.toString(previous));
        }
    }
}