import java.util.Scanner;

public class A {


    public static void main(String[] args) {

        Scanner r=new Scanner(System.in);
        int a=r.nextInt();
        //int a=6;


        int i = 0;

        while (i < a) {

            //System.out.println("i="+i);
            String space = "";
            String star = "";
            for (int j = 0; j < a - i; j++) {space += " ";}                            //for (int j = 0; j < a - i; j++) space = space + " ";

            //System.out.println("a-i="+(a-i));

            for (int j = 0; j < i + 1; j++) { star += "*";}                         //for (int j = 0; j < 1 * i + 1; j++) star = star + "*";

            //System.out.println("i+1= "+(i + 1));

            System.out.println(space + star);
            i++;
        }
    }
}
//      *  6 probel 1 zvezd
//     **  5 probel 2 zvezd
//    ***  4 probel 3 zvezd
//   ****  3 probel 4 zvezd
//  *****  2 probel 5 zvezd
// ******  1 probel 6 zvezd
