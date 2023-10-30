import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a+"this is after swap"+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+"this value is swap"+b);
        sc.close();
    }
}
