public class B implements A{
    @Override
    public void f(){
        System.out.println("class B");
    }

    public static void main(String[] args){
       B r=new B();
       r.f();

       C re=new C();
       re.f();

       E ref=new E();
       System.out.println(ref.);

       System.out.println(ref.hashCode());
    }
}