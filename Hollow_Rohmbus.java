import java.util.Scanner;

public class Hollow_Rohmbus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no is:");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
             for(int j=1;j<=num;j++){
                if(i==1||i==num||j==1||j==num){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                } 
             }
            System.out.print("\n");
        } 
        sc.close();
    }
}
