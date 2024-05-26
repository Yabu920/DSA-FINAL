import java.util.Stack;

public class StrRev {
    public static String revStr(String inp) {
        Stack<Character> stack = new Stack<>();
        for (char c : inp.toCharArray()) {
            stack.push(c);
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
       
        String input = "Yeabsra";
        String output = revStr(input);
        System.out.println("Reversed string: " + output);
    }
}
