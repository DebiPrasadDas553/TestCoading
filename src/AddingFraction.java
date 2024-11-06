//(a*d+c*b)/b*d

public class AddingFraction {
    public static void main(String[] args) {
        int num1=1;
        int deno1=3;
        int num2=3;
        int deno2=9;

        AddingFraction.addFraction(num1,deno1,num2,deno2);
    }
    public static void addFraction(int num1, int deno1,int num2, int deno2){
        int numerator=num1*deno2+num2*deno1;
        int denominator=deno1*deno2;

        //simplify the fraction

        int gcd=findGcd(numerator,denominator);

        numerator = numerator/gcd;
        denominator=denominator/gcd;


        System.out.println(numerator+"/"+denominator);
    }

    private static int findGcd(int numerator, int denominator) {
        if (denominator==0){
            return numerator;
        }
        return findGcd(denominator,numerator%denominator);
    }
}
