import java.util.Scanner;

public class Weak {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr the choice which day you required");
        int day=sc.nextInt();
        if(day==1){
            System.out.println("Sunday");
        }
        else if(day==2){
            System.out.println("Monday");
        }
        else if(day==3){
            System.out.println("Tuesday");
        }
        else if(day==4){
            System.out.println("Wednesday");
        }
        else if(day==5){
            System.out.println("thuesday");
        }
        else if(day==6){
            System.out.println("Friday");
        }
        else if(day==7){
            System.out.println("Saturday");
        }
        else{
            System.out.println("this choice id worng please write choice");
        }
        
        sc.close();
    }
}
