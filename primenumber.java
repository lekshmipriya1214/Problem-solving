import java.util.*;
class primenumber{
 public static void checkPrime(int n){
    int half=n/2;
    if(n==0 || n==1){
        System.out.println("not prime");
    }else{
        for(int i=2;i<=half;i++){
            if(n%i==0){
                System.out.println("not prime");
                break;
            }else{
                System.out.println("prime");
                break;
            }
        }
    }
 }
 public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int m=scan.nextInt();
    scan.close();
    checkPrime(m);
 }
}
