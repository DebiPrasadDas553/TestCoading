import java.util.ArrayList;
import java.util.List;

public class Example {
        public static void main(String[] args) {
            int n = 5;
            printPascal(5);
        }
        public static List<Integer> findElements(List<Integer> li){
            List<Integer> li1 = new ArrayList<>();
            li.add(1);
            for(int i =1;i<li.size();i++){
                li1.add(li.get(i-1)+li.get(i));
            }
            li1.add(1);
            return li1;
        }
        public static List<List<Integer>> printPascal(int n){
            List<List<Integer>> psLi= new ArrayList<>();
            List<Integer>list= new ArrayList<>();
            list.add(1);
            psLi.add(list);
            for(int i=1;i<n;i++){
                list=  findElements(list);
                psLi.add(list);
            }
            System.out.println(psLi);
            return psLi;
        }
    }



