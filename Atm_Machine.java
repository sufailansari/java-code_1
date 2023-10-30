import java.util.Scanner;

public class Atm_Machine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("This is your ATM machine");
        System.out.println("we are choice one option in this list");
        System.out.println("if we have to choice 1 you check your balance");
        System.out.println("if we have to choice 2 you Deposit amount");
        System.out.println("if we have to choice 3 you widthdraw");
        int choice=sc.nextInt();
        float balance=2000;
        switch(choice){
            case 1:{
                System.out.println("the minimum balance is :"+balance);
                break;
            }
            case 2:{
                System.out.println("you choices deposit amount");
                System.out.println("Enter the deposit amount");
                float amount=sc.nextFloat();
                float total_amot=balance+amount;
                System.out.println("user toatal amount is :"+total_amot);
                break;
            }
             case 3:{
                System.out.println("you choices widthdraw amount");
                System.out.println("Enter the widthdraw amount");
                float amount=sc.nextFloat();
                float total_amot=balance-amount;
                System.out.println("user toatal amount is :"+total_amot);
                break;
            }
        }
        sc.close();
    }
}
