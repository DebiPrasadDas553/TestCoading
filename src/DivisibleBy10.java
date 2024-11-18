public class DivisibleBy10 {
    public static void main(String[] args) {
        int no=100;
        System.out.println(isDivisible(no));

    }

    public static boolean isDivisible(int no){
        if(no<=0){
            return false;//not negative
        }
        while(no%10==0){// divisible by 10
            no=no/10;
        }
        if(no==1){// reminder should be 1
            return  true;
        }
        return false;
    }
}
