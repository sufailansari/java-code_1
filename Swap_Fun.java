import java.util.Scanner;

public class Swap_Fun {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num= sc.nextInt();
        int num1=sc.nextInt();
        System.out.println("before swap:"+num );
        System.out.println("before swap:"+num1);
        isSwap(num, num1);
        sc.close();
    }
    static void isSwap(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swap:"+a);
        System.out.println("after swap:"+b);
        
    }
}
