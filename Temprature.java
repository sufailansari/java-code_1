import java.util.Scanner;

public class Temprature {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  choice which scale in the output ");
        System.out.println("if you choice 1 than output is  Fahrenheit scale");
        System.out.println("if you choice 2 than output is celceus scale");
        int choice=sc.nextInt();
        if(choice==1){
            System.out.println("Enter the celceus input");
            float celceus=sc.nextFloat();
            double fah=(celceus*9/5)+32;
            System.out.println("the output is fahrenheit is:"+fah+"*F"); 
        }
        else if(choice==2){
             System.out.println("Enter the faherenhit input");
            float fah=sc.nextFloat();
            double Cel=(fah-32)/(9/5);
            System.out.println("the output is celceus is:"+Cel+"*C"); 
        }
        else{
            System.out.println("Please write choice");
        }
        sc.close();
    }
}
