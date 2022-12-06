import java.util.*;
class pyramid{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        scan.close();
        for(int i=0;i<n;i++){
            for(int j=(n-i);j>=0;j--){
                System.out.print(" ");
            }
                for(int k=0;k<=i;k++){
                    System.out.print("* ");
                }
        System.out.println();
        }
    }
}