import java.util.*;


class reverse_of_string{
    public static void main(String[] args){
                Scanner scan=new Scanner(System.in);
                String str=scan.nextLine();
                scan.close();
                int length=str.length();
                for(int i=0;i<length;i++){
                    System.out.print(str.charAt(str.length()-i-1));

                }

    }
}