import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Stack stack = new Stack();
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char[] a = s.toCharArray();
        boolean brackets = true;
        for (int i = 0; i < a.length; i++){
            if ((a[i] == '(') || (a[i] == '{') || a[i] == '[') {
                stack.push(a[i]);
            }
            else if ((!stack.empty()) && (a[i] == ')' || a[i] == '}' || a[i] == ']')) {
               if ((a[i] == ')' && stack.top() == '(') || ((a[i] == ']' && stack.top() =='[') || (a[i] == '}' && stack.top() == '{'))){
                   stack.pop();
               }
               else{
                   brackets = false;
                   break;
               }
            }
            else if ((stack.empty()) && (a[i] == ')' || a[i] == '}' || a[i] == ']')) {
                brackets = false;
                break;
            }
        }
        if (brackets && stack.empty()){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}