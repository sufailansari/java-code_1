import java.util.Scanner;

public class Simp_Inrest {
   
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the value ");
        int p=sc.nextInt();
        int r=sc.nextInt();
        int t=sc.nextInt();
        int res=simpleInterest( p,r,t);
        System.out.println(res);
        sc.close();

    }
     static int simpleInterest( int p,int r,int t){
        int A;
        A=(p*r*t)/100;
        return A;
    }
}
