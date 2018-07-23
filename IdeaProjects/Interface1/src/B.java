public class B implements A {

    public static void main(String[] args) {
        A r = new B();
        void f(){
            System.out.println("Interface");
        }
        void fB(){
            System.out.println("class B");
        }
    }
}