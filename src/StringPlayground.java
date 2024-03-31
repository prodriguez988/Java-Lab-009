public class StringPlayground {
    public static int parantheses(String s) {

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.length()==0){break;}
            char c = s.charAt(i);
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String string = "(3^2)+(15+2)=3";
        String  not ="(This sentence is not punctuated correctly.)  )";
        System.out.println(parantheses(string));
        System.out.println(parantheses(not));
        }
    }