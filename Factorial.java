import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Factorial number is :");
        int num=sc.nextInt();
        int factno=1;
        for(int i=1;i<=num;i++){
            if(num==0||num==1)
            {
                System.out.println(1);
            }
            else{
                factno*=i;
            }
        }
        System.out.println("Factorial no is  : "+factno);
        sc.close();
    }
}
