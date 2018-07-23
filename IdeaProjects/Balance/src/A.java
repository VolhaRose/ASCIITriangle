import java.util.*;

public abstract class A implements Deque{

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        String a=new String(sc.next());
        Stack<Character> st=new Stack<>();

        for(int i=0;i<a.length();i++){
            char b;
            b=a.charAt(i);

            char[] c={'{','[','('};
            char[] c1={'}',']',')'};

            if(b=='}'|| b==']'|| b==')'){
                System.out.println("Not Balanced");
            }

            if(b=='{'|| b=='['|| b=='('){
                st.push(b);
            }else{

            }
        }

        /*Scanner sc=new Scanner(System.in);
        String a=new String();
        a=sc.next();
        Stack<Character> st=new Stack<>();
        //System.out.println(a);

        char b;

        for(int i=0;i<a.length();i++){
            b=a.charAt(i);
            switch(b){
                case'{':
                case'[':
                case'(':
                    st.push(b);
                    break;

                case'}':
                case']':
                case')':
                    if(!st.isEmpty()){

                        char b1=st.pop();
                        if((b=='}' && b1!='{')||(b==']' && b1!='[')||(b==')' && b1!='(')){
                            System.out.println("Not Balanced");
                        }else{
                            System.out.println("Not Balanced");
                        }
                    }
            }
        }

        /*for (int i = 0; i < a.length(); i++){
            if (a.toCharArray()[i] == '(' || a.toCharArray()[i] == '{' || a.toCharArray()[i] == '[') {
                //System.out.println("balanced");
                st.push(a.toCharArray()[i]);

                System.out.println(st.push(a.toCharArray()[i]));

            } else{
                //System.out.println("not balanced");
            }
        }*/
    }
}

/*import java.io.IOException;

public class A {
    private String input;

    public A(String in) {
        input = in;
    }

    public void check() {
        int stackSize = input.length();
        Stack theStack = new Stack(stackSize);

        for (int j = 0; j < input.length(); j++)
        {
            char ch = input.charAt(j);
            switch (ch) {
                case '{': // opening symbols
                case '[':
                case '(':
                    theStack.push(ch); // push them
                    break;

                case '}': // closing symbols
                case ']':
                case ')':
                    if (!theStack.isEmpty()) // if stack not empty,
                    {
                        char chx = theStack.pop(); // pop and check
                        if ((ch == '}' && chx != '{') || (ch == ']' && chx != '[')
                                || (ch == ')' && chx != '('))
                            System.out.println("Error: " + ch + " at " + j);
                    } else
                        // prematurely empty
                        System.out.println("Error: " + ch + " at " + j);
                    break;
                default: // no action on other characters
                    break;
            }
        }
        if (!theStack.isEmpty())
            System.out.println("Error: missing right delimiter");
    }

    public static void main(String[] args) throws IOException {
        String input = "{(})";
        A theChecker = new A(input);
        theChecker.check();
    }

}

class Stack {
    private int maxSize;

    private char[] stackArray;

    private int top;

    public Stack(int max) {
        maxSize = max;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char j) {
        stackArray[++top] = j;
    }

    public char pop() {
        return stackArray[top--];
    }

    public char peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}*/