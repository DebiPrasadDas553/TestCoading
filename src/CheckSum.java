import java.util.Arrays;

public class CheckSum {

    public static void main(String[] args) {
        int arr2[]={5,8,50,4};
        int k =50;
        int sum;
        int count=0;
        for (int i=0;i<arr2.length;i++){
            sum=0;
            for (int j=i;j<arr2.length;j++){
                sum=sum+arr2[j];
                if (sum==k){
                    count=count+1;
                }
            }
        }
        if (count>0){
            System.out.println(count);
        }
        else
            System.out.println("-1");

    }
}
