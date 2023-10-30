import java.util.Scanner;

public class TaxCalculater {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the employe basic salary is :");
    float sal=sc.nextFloat();
    if(sal<=10000){
        System.out.println("No text aplicable on the employe salary ");
        System.out.println("employe salary is:"+sal);
    }
    else if (sal<10000||sal>=20000){
        System.out.println("Text aplicable on the employe salary");
        float text=(sal*10)/100;
        float totalsal=sal-text;
        System.out.println("text is aplicable on employe salary :"+text);
        System.out.println("total salary also aplicable on text is :"+totalsal);
    }
    else if (sal<20000||sal>=30000){
        System.out.println("Text aplicable on the employe salary");
        float text=(sal*15)/100;
        float totalsal=sal-text;
        System.out.println("text is aplicable on employe salary :"+text);
        System.out.println("total salary also aplicable on text is :"+totalsal);
    }
    else{
       System.out.println("Text aplicable on the employe salary");
        float text=(sal*25)/100;
        float totalsal=sal-text;
        System.out.println("text is aplicable on employe salary :"+text);
        System.out.println("total salary also aplicable on text is :"+totalsal); 
    }
    sc.close();

   } 
}
