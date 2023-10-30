import java.util.Scanner;

public class Patten {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        for(int i=1;i<=size;i++){
            for(int j=1;j<=size;j++){
                System.out.print("*");
                
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
