import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of rectangle");
        Float a=sc.nextFloat();
        System.out.println("enter the breath of rectangle");
        Float b=sc.nextFloat();
        Float c=a*b;
        System.out.println("area of rectangle is :"+c);
        sc.close();



    } 
    
}
