import java.util.Scanner;

public class ConvertToInt {
    public static void main(String[] args) {
        ConvertToInt.convertDigit("-12a5");
    }

    public static void convertDigit(String str) {
        if (str.matches("-?\\d+")){
            Integer no =   Integer.parseInt(str);
            System.out.println(no);
        }
        else {
            System.out.println("-1");
        }
    }
}
