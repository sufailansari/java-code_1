import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total amount of costumer purchasing product");
        float total_amot= sc.nextFloat();
        if(total_amot<=1000){
            System.out.println("No discount is available in this store");
            System.out.print("costumer total bill pay is:"+total_amot);
        }
        else if(total_amot>1000||total_amot<=5000){
            System.out.println("Discount is available on a costumer for 5%");
            float Dis=(total_amot*5)/100;
            float Cpbill=total_amot-Dis;
            System.out.println("Discount in apply on costumer bill is :"+Dis);
            System.out.println("Toatl bill pay the costumer is :"+Cpbill);
        }
        else if(total_amot>5000||total_amot<=10000){
            System.out.println("Discount is available on a costumer for 10%");
            float Dis=(total_amot*10)/100;
            float Cpbill=total_amot-Dis;
            System.out.println("Discount in apply on costumer bill is :"+Dis);
            System.out.println("Toatl bill pay the costumer is :"+Cpbill);
        }
        else if(total_amot>10000||total_amot<=20000){
            System.out.println("Discount is available on a costumer for 15%");
            float Dis=(total_amot*15)/100;
            float Cpbill=total_amot-Dis;
            System.out.println("Discount in apply on costumer bill is :"+Dis);
            System.out.println("Toatl bill pay the costumer is :"+Cpbill);
        }
        else {
            System.out.println("Discount is available on a costumer for 25%");
            float Dis=(total_amot*25)/100;
            float Cpbill=total_amot-Dis;
            System.out.println("Discount in apply on costumer bill is :"+Dis);
            System.out.println("Toatl bill pay the costumer is :"+Cpbill);
        }
        sc.close();
    }
}
