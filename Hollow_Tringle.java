import java.util.Scanner;

public class Hollow_Tringle {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num:");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                if(i==1||i==num||j==1||j==num){
                System.out.print("*");
                }
            }
            System.out.println("\n");
        }
        sc.close();
    }
    
}
