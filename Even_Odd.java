import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number is :");
        int a=sc.nextInt();
        System.out.println((a%2==0)?("this number is even"):("this number is odd"));
        sc.close();


    }
}
