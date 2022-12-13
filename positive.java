import java.util.*;
class positive{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        scan.close();
        if(num>0){
            System.out.println("Positive number");
        }else if(num<0){
            System.out.println("Not a positive number");
        }else{
            System.out.println("The number is zero");
        }
    }
}