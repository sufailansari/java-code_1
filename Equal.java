import java.util.Scanner;

public class Equal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number 1:");
        int a=sc.nextInt();
        System.out.println("enter the number 2:");
        int b=sc.nextInt();
        System.out.println("enter the number 3:");
        int c=sc.nextInt();
        System.out.println((a>b)&&(b>c)?("a number is grater then"+a):(b>a)&&(b>c)?("b is grater then other"+b):("c is grater then other"+c ));
        sc.close();
    }
}
