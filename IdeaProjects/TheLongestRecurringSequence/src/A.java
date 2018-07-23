import java.util.Arrays;

public class A{
    public static void main(String[] args){
        int[] a=new int[]{1,1,7,7,5,6,6,6,7,7,7,7,7,8,4,3,3,3,3};
        int count=1;
        int max=1;
        int ind=0;
        int number=0;

        for(int i=0;i<a.length;i++){

            for(ind=1;ind<a.length;ind++){

                if(a[i]==a[ind]){
                    count++;                    // счетчик количества повторяющихся цифр
                    //System.out.println(count);

                    if(max<count){              // меньше ли максимальное значение, чем счетчик
                        max=count;              // присваиваем максимальное значение
                        //System.out.println(max);
                        number=a[i];
                    }

                }else{
                    count=1;
                }
            }
        }

       System.out.print(number);
    }
}