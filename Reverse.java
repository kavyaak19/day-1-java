import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int Reverse=0;
        while(n>0){
            int digit=n%10;
            Reverse=Reverse*10+digit;
            n/=10;
        }
        System.out.println(Reverse);
        
    }
    
}
