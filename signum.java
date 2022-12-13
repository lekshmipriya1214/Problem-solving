import java.util.*;
import java.lang.Integer;
class signum{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        scan.close();
        int result=Integer.signum(num);
        System.out.println(result);

    }
}