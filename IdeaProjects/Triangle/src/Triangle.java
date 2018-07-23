import java.util.Scanner;

public class Triangle {
    public static void main(String[] args){
        Scanner r=new Scanner(System.in);
        int a=r.nextInt();

        for(int y=0;y<=a;y++){

            for(int x=0;x<a;x++){

                if(Math.abs(x-a)<(y+1)){
                    System.out.print('*');
                }else{
                    System.out.print(' ');
                }
            }

            System.out.print("\n");
        }
    }
}