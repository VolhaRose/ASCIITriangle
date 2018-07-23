public class aaa {
    float u(float a,float b) {
        float c=a*b;
        return c;
    }
    public static void main(String[] args) {
        float buf;
        aaa r=new aaa();
        buf=r.u(3.82f, 4.14f);
        System.out.println(buf);
    }
}