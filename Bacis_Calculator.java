import java.util.Scanner;

public class Bacis_Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the choice which operation is performed by the user");
        System.out.println("if we choice 1 then performed Addition");
        System.out.println("if we choice 2 then performed Subtraction");
        System.out.println("if we choice 3 then performed Multiplication");
        System.out.println("if we choice 4 then performed Divided");
        System.out.println("if we choice 5 then performed module");
        int choice=sc.nextInt();
        float result=0;
        switch(choice){
            case 1:{
                System.out.println("Enter the your numbers to performe the operation");
                float a=sc.nextFloat();
                float b=sc.nextFloat();
                result=a+b;
                System.out.print("Final result is :"+result);
                break;
            }
            case 2:{
                System.out.println("Enter the your numbers to performe the operation");
                float a=sc.nextFloat();
                float b=sc.nextFloat();
                result=a-b;
                System.out.print("Final result is :"+result);
                break;
            }
            case 3:{
                System.out.println("Enter the your numbers to performe the operation");
                float a=sc.nextFloat();
                float b=sc.nextFloat();
                result=a*b;
                System.out.print("Final result is :"+result);
                break;
            }
            case 4:{
                System.out.println("Enter the your numbers to performe the operation");
                float a=sc.nextFloat();
                float b=sc.nextFloat();
                result=a/b;
                System.out.print("Final result is :"+result);
                break;
            }
            case 5:{
                System.out.println("Enter the your numbers to performe the operation");
                float a=sc.nextFloat();
                float b=sc.nextFloat();
                result=a%b;
                System.out.print("Final result is :"+result);
                break;
            }
            default:{
                System.out.println("Please Enter write opration ");
            }
        }
        sc.close();
    }
}
