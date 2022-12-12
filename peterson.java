import java.util.*;

 class Peterson {
    public static int factorials(int n){
        int factorial=1;
                for(int i=n;i>0;i--){
                    factorial=factorial*i;


                }return factorial;
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        scan.close();
        int temp=num;
        int digit=0;
        int sum=0;
        int add=0;
                
        while(temp>0){
                    digit=temp%10;
                    add=factorials(digit);
                    sum+=add;
                    temp=temp/10;
        }
        if(sum==num){
            System.out.println("Peterson number");
        }else{
            System.out.println("Not a Peterson number");
        }
        
    }
    
}
