public class MultDivide {

    float mult(float a, float b){
        return (a*b); }

    static float divide(int k, int c) {
        return(k/c); }

    public static void main(String[] args) {
        MultDivide r = new MultDivide();
        float buf = r.mult(3.82f, 4.14f);
        System.out.println(buf);

        buf = divide(72,12);
        System.out.println(buf); }
}