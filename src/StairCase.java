public class StairCase {
    public static void main(String[] args) {
        int n=4;
        System.out.println(StairCase.countStairs(n));

    }

  /*  public static int countWays(int n){
        if (n==0 || n==1) {
            return 1;
        }
        return countWays(n-1)+countWays(n-2);
    }*/

    public static int countStairs(int n){
        int first=1;
        int sec=1;
        for (int i=2;i<=n;i++){
            int current = first+sec;
            first=sec;
            sec=current;
        }
        return sec;
    }
}
