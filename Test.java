import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        System.out.println("Taking Input From the user");
        Scanner input = new Scanner(System.in);
       // System.out.println("enter the name");
       // String name=input.nextLine();  
        System.out.println("Enter number1");
        int a=input.nextInt();
        System.out.println("Enter number 2:");
        int b=input.nextInt();
        int g=a+b;
        System.out.println("Enter the floating number:");
        float f=input.nextFloat();
        input.nextLine(); 
        System.out.println("enter the name");
        String name=input.nextLine();  
        System.out.println("name :" +name);
        System.out.println("The sum of these number is: "+ g);
        System.out.println(f);
        input.close();










        
    }
}

