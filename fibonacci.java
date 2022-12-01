import java.util.*;

class fibonacci {
    public static void main(String[] args){
                Scanner scan=new Scanner(System.in);
                int count=scan.nextInt();
                scan.close();
                int n=0,n1=1;
                int n2;
                System.out.print(n+" "+n1+" ");
                for(int i=2;i<count;i++){
                n2=n+n1;
                System.out.print(n2+" ");
                n=n1;
                n1=n2;
            }



    }
}
