import java.util.*;
class Palindrome{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String word =scan.nextLine();
        scan.close();
        String palindrome="";
        for(int i=word.length()-1;i>=0;i--){
            palindrome+=word.charAt(i);

        }if(word.equals(palindrome)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
        

    }
}
