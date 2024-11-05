public class reverseVowel {
    public static void main(String[] args) {

        String str="abvecaxi";
        System.out.println(reverseVowel(str));
    }

    public static String reverseVowel(String str){

        if(str==null && str.length()==0){
            return str;
        }
        int n = str.length();
        int first=0;
        int last =n-1;
        String vowels="aeiouAEIOU";
        char[] ch=str.toCharArray();//convert string to char

        while(first<last){
            if(vowels.indexOf(ch[first])==-1 && first<last){//check till get the vowel if not ++ left
                first++;
            }
            if(vowels.indexOf(ch[last])==-1 && first<last){//check till get the vowel if not right--
                last--;
            }
            char temp= ch[first];//once get the swap vowels
            ch[first]=ch[last];
            ch[last]=temp;
            first++;
            last--;
        }
        return new String(ch);
    }
}
