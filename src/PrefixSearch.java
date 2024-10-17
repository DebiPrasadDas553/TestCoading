import java.util.ArrayList;
import java.util.List;

public class PrefixSearch {
    public static void main(String[] args) {
        String[] arr = {"apple", "applet", "bread", "aper"};
        String prefix = "app";
        List<String> list = new ArrayList<>();
        for (String st : arr) {
            if (st.contains(prefix)) {
                list.add(st);
            }
        }
        System.out.println(list);

    }
}


