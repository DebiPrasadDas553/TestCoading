public class ReverseStringDivisibleByThree {
    public static void main(String[] args) {

        String str="3,6,5,4,8,7,9";
        System.out.println(reverseDivisibleByThree(str));
    }

    public static String reverseDivisibleByThree(String str){

        int no = str.length();
        int first=0;
        int last=no-1;

        char[]ch = str.toCharArray();

        while(first<last){
            if(first<last&&ch[first]%3!=0){
                first++;
            }
            if(first<last&&ch[last]%3!=0){
                last--;
            }
            char temp =ch[first];
            ch[first]=ch[last];
            ch[last]=temp;

            first++;
            last--;
        }
        return new String(ch);
    }
}
