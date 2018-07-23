public class A {
    public static void main(String[] args) {
     switch(1) {
         case 1: System.out.println(1);
         case 2: System.out.println(2);
         break;                              // после break перестает выполняться и выходит из функции.
         case 3: System.out.println(3);
     }
    }
}