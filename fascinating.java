import java.util.*;

class fascinating{
    public static void main(String[] args){
                Scanner scan=new Scanner(System.in);
                int num=scan.nextInt();
                scan.close();
                int num1=num*2;
                int num2=num*3;
            
                String chara=num+""+num1+num2;
                boolean found=true;
                for(char i='1';i<='9';i++){
                    int count=0;
                    for(int j=0;j<chara.length();j++){
                        char ch=chara.charAt(j);
                        if(ch==i){
                            count++;
                        }}
                    
                
                if(count==0||count>1){
                    found=false;
                    break;
                }
                }
                if(found){
                    System.out.println("Fascinating number");
                }else{
                    System.out.println("Not a fascinating number");
                }
    }
}
