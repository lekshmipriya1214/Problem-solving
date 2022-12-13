import java.util.*;
import java.lang.Math;
class signumdouble{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        double num=scan.nextDouble();
        scan.close();
        double result=Math.signum(num);
        System.out.println(result);

    }
}