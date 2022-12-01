import java.util.*;

class factorial{
    public static void main(String[] args){
                Scanner scan=new Scanner(System.in);
                int num=scan.nextInt();
                scan.close();
                int factorial=1;
                for(int i=num;i>0;i--){
                    factorial=factorial*i;


                }System.out.println(factorial);
    }
}