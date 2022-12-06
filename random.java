 import java.util.*;
 class random {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the 1st value within which the random number should be generated: ");
        int value1=scan.nextInt();
        System.out.print("Enter the 2nd value within which the random number should be generated: ");
        int value2=scan.nextInt();
        scan.close();
        Random random=new Random();
        int random_number1=random.nextInt(value1);
        int random_number2=random.nextInt(value2);
        System.out.println("The random numbers are "+random_number1+" and "+random_number2);
        //System.out.println(random_number2);
    }
}
