public class A {
    void fA() {
        System.out.println("class A");
    }

    public static void main(String[] args) {
        A r=new С();
        r.fA();
        ((B)r).fB(); // явное приведение типов. Референс перепривязали к классу B и теперь можно пользоваться и fA, и fB
    }
}