import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n =scan.nextInt();
        int upto =scan.nextInt();
        scan.close();
        for(int i=upto;i>=1;i--){
            System.out.println(n*i);
        }

    }
}