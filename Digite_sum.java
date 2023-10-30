import java.util.Scanner;

public class Digite_sum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter digite sum of number is:");
        int num=sc.nextInt();
        int sum=0;
        while (num!=0) {
            sum+=num%10;
            num/=10;
        }
        System.out.println("Sum of digite is:"+sum);
        sc.close();
    }
}
