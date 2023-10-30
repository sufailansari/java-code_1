import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number is:");
        int num=sc.nextInt();
        int rem,sum=0;
        int temp=num;
        while(num!=0){
            rem=num%10;
            sum=sum*10+rem;
            num=num/10;
        } 
        System.out.println(sum);
        if(sum==temp){
            System.out.println("this number is palindrome");
        }
        else {
            System.out.println("Given number is not a palindrome");
        }
        sc.close();
    }
}
