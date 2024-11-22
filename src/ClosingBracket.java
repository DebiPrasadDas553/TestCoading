import java.util.*;

public class ClosingBracket {

    public static void main(String[] args) {
        String str= "((a+(b-c)+z)-z)]";
        boolean isValid = ClosingBracket.isClosed(str);
        System.out.println(isValid);
    }

    public static boolean isClosed(String str) {

        Stack<String> stack = new Stack<>();
        String[] elements = str.split("");
        for (String element : elements) {
            if (element.equals("(") || element.equals("{") || element.equals("[")) {
                stack.push(element);
            } else if (element.equals(")")  && !stack.isEmpty() && stack.peek().equals("(")) {
                stack.pop();
            } else if (element.equals("}")  && !stack.isEmpty() && stack.peek().equals("{") ) {
                stack.pop();
            } else if (element.equals("]")  && !stack.isEmpty() && stack.peek() .equals("[")) {
                stack.pop();
            } else if (element.equals(")")||element.equals("}")||element.equals("]")) {
                return false;
            }
            }
        return stack.isEmpty();
    }

    }

