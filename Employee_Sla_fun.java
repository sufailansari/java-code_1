import java.util.Scanner;

public class Employee_Sla_fun {
    static int findHra(int basic){
        int a;
        a=(basic*30)/100;
        return a;
    }
    static int findDa(int basic){
        int c;
        c=(basic*20)/100;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entre the employe name:");
        String name=sc.nextLine();
        System.out.println("entre the basic salary:");
        int basic=sc.nextInt();

        sc.close();

    }
}
