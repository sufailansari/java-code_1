import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the reverse number is :");
        int num=sc.nextInt();
        int rem=0;
        while (num!=0){
             int digit= num%10;
            rem= rem*10+digit;
            num/=10;
        }
        System.out.println("reverse number is :"+rem);
        sc.close();
    }
}
